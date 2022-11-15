package j06_반복;

public class Loop2 {

    public static void main(String[] args) {

        /*
            [2단]
            2 x 1 = 2
            2 x 2 = 4
            2 x 3 = 6
            ...
            2 x 9 = 18

         */

        int dan = 2;

        System.out.println("[" + dan + "]");

        for (int i = 0; i < 10; i++) {
            int num = i + 1;
            System.out.println(dan + " x " + num + " = " + (dan * num));

            System.out.println();

            System.out.println("[" + dan + "단]");
            for (int h = 0; h < 10; h++) {
                for (int j = 0; j < 10; j++)
                 System.out.println(h + " x " + j + " = " + (h * j));
                }
            }
        }
    }



