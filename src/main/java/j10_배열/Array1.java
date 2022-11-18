package j10_배열;

public class Array1 {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        // int[] 배열 자료형. numbers 변수. new int[5] 동적 메모리 생성.

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        for(int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

    }

}
