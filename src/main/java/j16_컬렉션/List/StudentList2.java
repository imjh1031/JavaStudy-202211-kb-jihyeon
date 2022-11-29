package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList2 {

    public static void main(String[] args) {

        List<Hobby> hl = Arrays.asList(new Hobby[] {
                new Hobby(1, "축구"),
                new Hobby(2, "농구"),
                new Hobby(3, "골프"),
                new Hobby(4, "음악감상"),
        });

        Student s1 = Student.builder()
                .studentId((20220001))
                .name("고동현")
                .age(21)
                .hobbyList(Arrays.asList(new Hobby[] {hl.get(0), hl.get(2)})) // asList = 리스트 반환
                .build();

        Student s2 = Student.builder()
                .studentId((20220001))
                .name("강동욱")
                .age(22)
                .hobbyList(Arrays.asList(new Hobby[] {hl.get(1), hl.get(3)})) // asList = 리스트 반환
                .build();

        Student s3 = Student.builder()
                .studentId((20220001))
                .name("정진호")
                .age(23)
                .hobbyList(Arrays.asList(new Hobby[] {hl.get(0), hl.get(3)})) // asList = 리스트 반환
                .build();

        System.out.println(s1);

        List<Student> sl = new ArrayList<Student>();

        sl.add(s1);
        sl.add(s2);
        sl.add(s3);

        for(Student s : sl) {
            System.out.println("<학생정보>");
            System.out.println(s);
            System.out.println("<" + s.getName() + " 학생 취미>");

            for(Hobby h : s.getHobbyList()) {
                System.out.println(h);
            }
            System.out.println();
        }

        //        new Hobby(1, "축구");
        //        new Hobby(2, "농구");
        //        new Hobby(3, "골프");
        //        new Hobby(4, "음악감상");

//        String[] names = new String[] {"김준일", "김준이", "김준삼"};
//
//        List<String> nameList = Arrays.asList(new String[] {
//                "김준일",
//                "김준이",
//                "김준삼"
//        });
//        // 배열을 넣으면 List로 바꿔줌
//
//        for(Hobby h : hobbyList) {
//            System.out.println(h); // h : 매번 반복 때마다 하나씩 꺼내는 용도
//        }
//
//        Object[] nameArray = nameList.toArray();
//
//        System.out.println((String) nameArray[0]); // 안에 들어있는 값을 다운캐스팅





    }

}
