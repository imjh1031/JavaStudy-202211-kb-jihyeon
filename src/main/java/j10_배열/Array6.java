package j10_배열;

public class Array6 {

    public static void main(String[] args) {

        int[] a = new int[] {1, 2, 3, 4, 5};
        System.out.println("[배열 a]");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + (i != a.length - 1 ? ", " : "\n"));
        }


        int[] b = a;

        if(a == b) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }

        System.out.println("[배열 b]");
        b[3] = 10;
        for(int i = 0; i < b.length; i++) {
            System.out.print(b[i] + (i != b.length - 1 ? ", " : "\n"));
        }

        if(a == b) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }

        System.out.println("[배열 a]");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + (i != a.length - 1 ? ", " : "\n"));
        }

        // 주소가 같으면 인덱스 값을 바꿔도 같다고 나온다. (int[] a)
        // 새로운 배열을 만들어야 다르다고 나온다.

    }

}
