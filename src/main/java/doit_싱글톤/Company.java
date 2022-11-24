package doit_싱글톤;

public class Company {

    /*
        1. private 생성자 만들기
        2. instance 생성하기
        3. 외부에서 참조할 수 있는 public 메소드 만들기
        4. 실제로 사용하는 코드 만들기
    */

    private static Company instance = new Company(); // 2. 유일하게 생성한 인스턴스
    private Company() {} // 1.

    public static Company getInstance() { // 3. 인스턴스를 외부에서 참조할 수 있도록 public get() 메소드 구현
        if(instance == null) {
            instance = new Company();
        }
        return instance; // 유일하게 생성한 인스턴스 반환
    }

}
