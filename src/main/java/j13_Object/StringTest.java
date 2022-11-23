package j13_Object; // 모든 클래스는 오브젝트를 상속받는다.

public class StringTest {

    public static void main(String[] args) {

        String str = "A";
        String str2 = "A";
        String str3 = new String("A");

        System.out.println(str == str2); // true

        System.out.println(str.equals(str2)); // true. scanner는 다른 곳에 상속 받음. equals로 써야함.

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str == str3); // false. new 다른 주소

        System.out.println(str);
        System.out.println(str.toString()); // toString() 오브젝트 안에 들어있는 메소드

    }

}
