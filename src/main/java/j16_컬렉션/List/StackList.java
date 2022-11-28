package j16_컬렉션.List;

import java.util.ArrayList;

public class StackList {

    public static void main(String[] args) {

        // 임지현, 신경수, 고희주, 문승주, 장건녕, 박수현, 황석민, 박준현
        // 출력은 거꾸로 나와야 함

        ArrayList<String> stack = new ArrayList<String>();

//        stack.add(0, "임지현");
//        stack.add(0, "신경수");
//        stack.add(0, "고희주");
//        stack.add(0, "문승주");
//        stack.add(0, "장건녕");
//        stack.add(0, "박수현");
//        stack.add(0, "황석민");
//        stack.add(0, "박준현");
//
//        for(String name : stack) {
//            System.out.print(name);
//            if(!name.equals(stack.get(stack.size() - 1))) {
//                System.out.print(", ");
//            }
//        }

         stack.add("임지현");
         stack.add("신경수");
         stack.add("고희주");
         stack.add("문승주");
         stack.add("장건녕");
         stack.add("박수현");
         stack.add("황석민");
         stack.add("박준현");


//         int size = stack.size();
//         for(int i = 0; i < size; i++) {
//            System.out.println(stack.remove(size - i - 1));
//            // remove 반복 돌 때마다 사이즈가 줄어듬
//         }

         ArrayList<String> copyList = new ArrayList<String>();
         int size = stack.size();

         for(int i = 0; i < size; i++) {
             copyList.add(stack.remove(size -  i - 1)); // 역방향
         //  copyList.add(0, stack.remove(size -  i - 1)); // 정방향
         }
        System.out.println(copyList);
    }


}


