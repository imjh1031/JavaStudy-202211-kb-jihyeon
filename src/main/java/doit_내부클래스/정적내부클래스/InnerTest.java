package doit_내부클래스.정적내부클래스;

class OutClass {
	private int num = 10;
	private static int sNum = 20;
	
	static class InStaticClass {		// 정적 내부 클래스
		int inNum = 100;				// 정적 내부 클래스의 인스턴스 변수
		static int sInNum = 200;		// 정적 내부 클래스의 정적 변수
		
		// 정적 내부 클래스의 일반 메소드
		void inTest() {
			// num += 10; 외부 클래스의 인스턴스 변수는 사용할 수 없음
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
		}
		
		// 정적 내부 클래스의 정적 메소드
		static void sTest() {
			// num += 10;	외부 클래스와 내부 클래스의 인스턴스 변수는 사용할 수 없음
			// inNum += 10;
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass(); // 외부 클래스를 생성하지 않고 바로 정적 내부 클래스 생성 가능
		System.out.println("정적 내부 클래스 일반 메소드 호출");
		sInClass.inTest();
		System.out.println();
		System.out.println("정적 내부 클래스의 정적 메소드 호출");
		OutClass.InStaticClass.sTest();
	}
	
	
}
