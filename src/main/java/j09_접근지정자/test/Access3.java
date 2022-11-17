package j09_접근지정자.test;

public class Access3 {

    private String address; // private = 동일 클래스 안에서만 접근 가능

    private void printAddress() {
        String address = null;
        System.out.println("address : " + address);
    }

}
