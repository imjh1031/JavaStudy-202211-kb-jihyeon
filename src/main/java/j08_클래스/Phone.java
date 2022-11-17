package j08_클래스;

public class Phone {

    String company;
    String model;

    Phone() {} // 주소 리턴. 매개변수를 받을 수 있음.

    Phone(String c, String m) { // 반환 자료형 X, 리턴 X. 대문자로 시작. 생성자. ()매개변수 넣을 수 있음.
        company = c;
        model = m;
    }

    void printPhoneCompany() {
        System.out.println("제조사 : " + company);
        System.out.println();
    }

    void printPhoneModel() {
        System.out.println("모델명 : " + model);
        System.out.println();
    }
}
