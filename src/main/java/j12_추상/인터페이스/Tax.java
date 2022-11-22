package j12_추상.인터페이스;

/*
    연말정산
 */

public class Tax implements Calculator { // 인터페이스는 extends 대신 implemeents

    @Override
    public int calc(int[] values) {
        System.out.println("연말정산을 진행합니다.");
        int result = 0;
        for (int i = 0; i < values.length; i++) {
            result += values[i];
        }
        return result;
    }

}
