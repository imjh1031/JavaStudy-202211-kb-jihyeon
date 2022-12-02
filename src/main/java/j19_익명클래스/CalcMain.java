package j19_익명클래스;

public class CalcMain {

	public static void main(String[] args) {
		
		Calculator c1 = (x, y) -> x + y; // 람다식
		
		// Calculator c1 = (int x, int y) {
		//  	return x + y;
		// };
		
		// Calculator c = new Calculator() {
		// 		@Override						// 오버라이드는 변수 아무거나 사용 가능
		//		public int calc(int x, int y) {
		//			return x + y;
		// 		}
		// };
		
		CalculatorSub cs = x -> x * x;
		
		System.out.println(cs.calc(10));
		System.out.println(cs.a());
		
		int r1 = c1.calc(10, 20);
		System.out.println(r1);
		
		Calculator c2 = new Addition();
		
		int r2 = c2.calc(20, 30);
		System.out.println(r2);
		
	}
	
}
