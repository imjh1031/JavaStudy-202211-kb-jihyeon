package j14_스태틱.빌더;

public class StudentMain {

    public static void main(String[] args) {

        Student student = Student.builder() // 순서 상관 없음
                .studentCode(20220001)
                .name("임지현")
                .address("양산")
                .build();

        System.out.println(student);

        Student.StudentBuilder sb = new Student.StudentBuilder();

    }

}
