package j14_스태틱.싱글톤;

import lombok.Getter;

import java.util.Scanner;

public class ScannerSingleton {

    // 2. 자기 자신을 static 변수로 가지고 있어야 한다.
    private static ScannerSingleton instance = null; // Singleton instance 변수명 고정

    @Getter
    private Scanner scanner;

    // 1. 생성자가 private 접근지정자여야 한다.
    private ScannerSingleton() {
        scanner = new Scanner(System.in);
    }

    public static ScannerSingleton getInstance() {
        if (instance == null) {
            instance = new ScannerSingleton();
        }
        return instance;
    }

}
