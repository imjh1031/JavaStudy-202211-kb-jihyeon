package j15_제네릭; // 다운캐스팅이 필요 없음

public class InformationMain {

    public static void main(String[] args) {

        Student student = Student.builder()
                .studentCode(20220001)
                .name("임지현")
                .build();

        Teacher teacher = Teacher.builder()
                .teacherCode(200)
                .name("김준일")
                .build();

        Information<Student> studentInformation
                = new Information<Student>(student);

        Information<Teacher> teacherInformation
                = new Information<Teacher>(teacher);

        Information2 i1 = new Information2(student); // 안에 들어있는 변수는 오브젝트 타입
        Information2 i2 = new Information2(teacher);

        studentInformation.printInfo();
        teacherInformation.printInfo();

        System.out.println("학생 이름 : " + studentInformation.getTarget().getName());
        System.out.println("학생 이름2 : " + ((Student)i1.getTarget()).getName()); // 다운캐스팅

    }

}
