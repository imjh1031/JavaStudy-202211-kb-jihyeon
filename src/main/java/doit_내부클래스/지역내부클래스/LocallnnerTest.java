package doit_내부클래스.지역내부클래스;

class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;							// 지역 변수
		
		class MyRunnable implements Runnable {	// 지역 내부 클래스
			int localNum = 10;					// 지역 내부 클래스의 인스턴스 변수
			
			@Override
			public void run() {
				// num = 200;					// 지역 변수는 상수로 바뀌므로 값을 변경할 수 없음
				// i = 100;						// 매개변수도 지역 변수처럼 상수로 바뀌므로 값을 변경할 수 없음
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outer.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
			}
			
		}
		return new MyRunnable();
	}
}

public class LocallnnerTest {
	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);	// 메소드 호출
		runner.run();							// run()이 실행되면서 getRunnable() 메소드의 지역 변수가 사용됨
	}

}
