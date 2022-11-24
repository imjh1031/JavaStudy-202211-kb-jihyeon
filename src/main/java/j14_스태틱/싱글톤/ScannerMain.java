package j14_스태틱.싱글톤;

import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {
        Scanner1 s1 = new Scanner1();
        Scanner2 s2 = new Scanner2();

        String name = null;

        Scanner scanner = ScannerSingleton.getInstance().getScanner();
        // Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요.");
        name = scanner.nextLine();

        System.out.println("이름 : " + name);

        s1.inputName();
        s2.inputAge();
    }

}
