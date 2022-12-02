package j19_익명클래스;

@FunctionalInterface		  // 람다식 앞에 꼭 붙임
public interface Calculator { // 람다식은 인터페이스 안에 메소드는 하나여야 함
							  // 람다는 무조건 인터페이스

	public int calc(int a, int b);
	
	public default int a() {  // default = 이미 정의되어있는 메소드
		return 10;
	}
}
