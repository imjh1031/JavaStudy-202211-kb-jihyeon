package j10_배열;

import java.util.Random;

public class Array3 {

    public static int foundMinNumber(int[] numbers) { // 배열을 받을 수 있음
        int min = numbers[0]; // 출력한 numbers[0] 0번 인덱스
        for(int i = 0; i < numbers.length; i++) {
            if(min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min; // 제일 작은 값
    }

    public static int foundMaxNumber(int[] numbers) {
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if(max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max; // 제일 큰 값
    }

    public static void main(String[] args) {

        /*
            randomArray 배열을 생성(10개)
            10, 2, 4, 5, 3, 7, 1 (범위는 1 ~ 10)
            총합 :
         */

        Random random = new Random();
        int[] randomArray = new int[10];
        int total = 0;


        // 배열에 랜덤한 값 대입
        for (int i = 0; i < randomArray.length; i++) {
            while(true) { // 무한 루프
                int randomNumber = random.nextInt(10) + 1; // 0 ~ 9가 아닌 1 ~ 10. randomNumber라는 새로운 변수를 만듬
                int count = 0;
                // boolean found = true;
                for(int j = 0; j < randomArray.length; j++) {
                    if(randomArray[j] == randomNumber) { // randomArray가 randomNumber와 같으면 더해서 값이 같지 않도록 반복 후 break;
                        count++;
                        // found = false;
                        break;
                    }
                }
                if (count == 0) {
                // if (found)
                    randomArray[i] = randomNumber;
                    break;
                }
}
        }

        /*
            1. 배열에서 값을 하나씩 꺼내어 total에 더한다.
            2. 배열의 값을 하나씩 꺼내어 출력한다. (단, 마지막에는 쉼표를 찍지 않는다.)
         */

        for (int i = 0; i < randomArray.length; i++) {
            total += randomArray[i];

            System.out.print(randomArray[i]);

            if (i != randomArray.length - 1) { // -1 = 10이 아니면 ,를 찍어라
                System.out.print(", ");
            }

        }
        System.out.println();

        System.out.println("총합 : " + total);

        System.out.println("최소값 : " + foundMinNumber(randomArray));

        System.out.println("최대값 : " + foundMaxNumber(randomArray));

    }
}
