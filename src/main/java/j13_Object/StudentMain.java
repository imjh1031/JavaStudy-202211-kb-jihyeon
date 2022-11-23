package j13_Object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StudentMain {

    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {

        Student student = new Student(20220001, "임지현");
        Student student2 = new Student(20220001, "임지현");

        System.out.println(student.toString()); // toString()을 호출하지 않아도 나옴
        System.out.println(student);
        System.out.println(student2);

        System.out.println(student == student2); // false
        System.out.println(student.equals(student2));

        System.out.println();

        print(student);
        // public static void print(Object obj) 대입이 됨
        // student 또한 obj에 상속이 돼서 가능함

        System.out.println(student.hashCode() == student2.hashCode()); // 주소 값 X
        System.out.println(student2.hashCode());

        System.out.println();

        Class c = student.getClass();
        System.out.println(c);
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());

        System.out.println();

        Field[] field = c.getDeclaredFields();
        for (int i = 0; i < field.length; i++) {
            System.out.println(field[i].getName()); // 변수명 호출
        }

        System.out.println();

        Method[] methods = c.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());
        }
    }

}
