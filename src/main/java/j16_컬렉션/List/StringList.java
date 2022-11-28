package j16_컬렉션.List;

import java.util.ArrayList;

public class StringList {

    public static void main(String[] args) {

        String[] strArray = new String[3];

        strArray[0] = "Java";
        strArray[1] = "JSP";
        strArray[2] = "Servlet";

        // 일반 반복
        System.out.println("<<<<<< 일반 반복 >>>>>>"); // 인덱스 값이 필요할 때 씀.
        for(int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        System.out.println();

        // foreach
        System.out.println("<<<<<< foreach >>>>>>");
        for(String str : strArray) { // : strArray -> 데이터의 집합. str에 대입함. 순서대로 나열함.
            System.out.println(str);
        }
        System.out.println();

        // list foreach
        ArrayList<String> strList = new ArrayList<String>(10); // () 1.5배로 늘어남. 지정할 수 있지만 안 해도 됨.

        // 값 추가(Create) -> add(값), add(index, 값)
        strList.add("Java"); // add = 값을 바꾸는 게 아닌 추가
        strList.add("JSP");
        strList.add("Servlet");
        strList.add(1, "C++");
        strList.add(0, "HTML"); // 앞에서 부터 값을 넣고 싶다면 0

        System.out.println("<<<<<< list foreach >>>>>>");
        for(String str : strList) {
            System.out.println(str);
        }
        System.out.println();

        // list 일반 반복
        // 값 조회(Read) -> get(index)
        System.out.println("<<<<<< list 일반 반복 >>>>>>");
        for(int i = 0; i < strList.size(); i++) { // list는 length가 아닌 size로 씀.
            System.out.println(strList.get(i));
        }
        System.out.println();

        // 값 수정(Update) -> set(index, 값)
        System.out.println("<<<<<< 값 수정 >>>>>>");
        strList.set(0, "HTML5");

        System.out.println(strList);
        System.out.println();

        // 값 삭제(Delete) -> remove(index);
        System.out.println("<<<<<< 값 삭제 >>>>>>");
        String removeDate = strList.remove(2);
        System.out.println(removeDate);
        System.out.println(strList);
    }

}
