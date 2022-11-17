package j07_메소드;

import j01_출력.SystemOut;

import java.sql.PreparedStatement;

public class Method1 {

    public static void method1() {
        System.out.println("메소드1 호출");
        System.out.println();
        method2(100);
    }

    public static void method2(int a) { // ( )= 매개변수
        System.out.println("메소드2 호출");
        System.out.println("매개변수 a : " + a);
        System.out.println();
    }

    public static int method3(int a, int b) {
        System.out.println("메소드2 호출");
        System.out.println("매개변수 a : " + a);
        System.out.println("매개변수 b : " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println();
        return a + b; // 돌려주는 값
    }

    public static int max(int a, int b) {

        int result = 0;

        if (a < b) {
            result = b;
        } else {
            result = a;
        }

        return result;
    }

    public static void main(String[] args) {
        method1(); // 메소드 호출
        System.out.println("메소드1 호출 후 출력");
        method2(10);
        int result1 = method3(3000, 7000);
        System.out.println("result1 : " + result1);
    }
}
