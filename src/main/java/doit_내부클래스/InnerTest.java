package doit_내부클래스;

class OutClass {					// 외부 클래스
	private int num = 10;			// 외부 클래스 private 변수
	private static int sNum = 20;	// 외부 클래스 정적 변수
	
	private InClass inClass;		// 내부 클래스 자료형 변수를 먼저 선언
	
	public OutClass() {				// 외부 클래스 디폴트 생성자
		inClass = new InClass();	// 외부 클래스가 생성된 후에 내부 클래스 생성 가능
	}
	
	class InClass {					// 인스턴스 내부 클래스
		int inNum = 100;			// 내부 클래스의 인스턴스 변수
		// static int sInNum = 200; 인스턴스 내부 클래스에 정적 변수 선언 불가능. 오류 발생
		// 인스턴스 내부 클래스는 외부 클래스를 생성한 이후에 사용해야 함
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
		}
		
		// static void sTest() { 정적 메서드 역시 정의 불가능. 오류 발생
		// }			
	}
	public void usingClass() {
		inClass.inTest();
	}
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass(); 		 // 내부 클래스 기능 호출
	}

	
	
}
