package j13_Object;

import java.util.Objects;

public class Student {

    private int code;
    private String name;

    public Student(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) { // 주소가 아니라 값을 비교
        if (this == o) return true; // 자료형은 바꿀 수 있지만 변수형은 X
        if (o == null || getClass() != o.getClass()) return false;
        // if (o == null || !(o instanceof Student) getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return code == student.code && Objects.equals(name, student.name);
        // Objects 객체들을 다루는 메소드
    }

    @Override
    public int hashCode() { // equals hashCode 클래스가 다르기 때문에 값이 같아도 다르다
        return Objects.hash(code, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
