package j12_추상.인터페이스;

public interface Calculator { // 인터페이스 = 추상메소드(기본). {} 구현X

    /*
        1. 모든 메소드는 기본적으로 추상메소드이다.
        2. 변수는 선언할 수 없다.
        3. 상수는 선언할 수 있다. (기본적으로 모든 변수 선언은 상수로 선언된다. 일반 변수 X)
        4. 일반 메소드를 선언하고 싶으면 abstract 대신 default 키워드를 사용한다.
     */

    public int ERROR_CODE = -9999999;

        // private String name; 일반 변수 X
        // public String name; X

        // public Calculator() {} 일반 변수가 없어서 생성 X

    public int calc(int[] values);

        // public default void setErrorCode() {
        //    ERROR_CODE = 10;
        // } 상수로 선언되어 오류남

}
