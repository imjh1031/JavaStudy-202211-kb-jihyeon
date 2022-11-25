package j14_스태틱.빌더;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Student {

    private int studentCode;
    private String name;
    private String address;

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public static class StudentBuilder { // 내부 클래스. 바깥의 클래스에서 사용 가능. 같은 static 으로 생성

        // 위의 변수들이 동일하게 들어감
        private int studentCode;
        private String name;
        private String address;

        public StudentBuilder studentCode(int studentCode) { // ()변수명과 똑같아야 함
            this.studentCode = studentCode;
            return this; // 자기 자신을 리턴
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder address(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(studentCode, name, address);
            // @AllArgsConstructor를 만들어줘서 ()안에 대입함
            // 최종 생성해서 리턴해줌
        }


    }
}
