package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        students.add(new Student(20220001, "이승아", 21));
        students.add(new Student(20220002, "김수현", 22));
        students.add(new Student(20220003, "문경원", 23));
        students.add(new Student(20220004, "홍지혜", 24));
        students.add(new Student(20220005, "고동현", 25));

        Student student2 = students.get(3);

        System.out.println(student2);

        // 이름이 문경원인 학생의 나이를 26세로 바꾸세요.

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getName().equals("문경원")) {
                s.setAge(26);
                break;
            }
        }

        for (Student s : students) { // foreach
            if (s.getName().equals("문경원")) {
                s.setAge(26);
                break;
            }
        }

            System.out.println(students);

        // 0번 인덱스 학생의 이름을 다음 인덱스의 학생 이름으로 변경
        // 제일 마지막 인덱스의 학생 이름으로 0번 인덱스로 이동

        String lastName = null;
        for (int i = 0; i < students.size(); i++) {
            int nowIndex = students.size() - 1 - i; // 인덱스 4번에서 부터 거꾸로
            int preIndex = nowIndex - 1; //
            Student s = students.get(nowIndex); // 뒤에서부터 가져옴

            if (nowIndex == 0) {
                s.setName(lastName);
                break;
            }

            if (nowIndex == students.size() - 1) { // 마지막 이름일 때 넣어라.
                lastName = s.getName(); // lastName에 이름을 계속 불러옴.
            }
            s.setName(students.get(preIndex).getName());
        }

        System.out.println(students);


        }

    }

