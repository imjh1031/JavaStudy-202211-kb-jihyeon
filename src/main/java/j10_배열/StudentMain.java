package j10_배열;

public class StudentMain {

    public static void main(String[] args) {

        Student[] students = new Student[3];

        students[0] = new Student("임지현", 1);
        students[1] = new Student("신경수", 2);
        students[2] = new Student("고희주", 3);

        System.out.println(students[0].getName());
        System.out.println("이름 : 임지현, 학년 : 1");
        System.out.println("이름 : " + students[0].getName() + " 학년 : " + students[0].getYear());
        System.out.println("이름 : " + students[1].getName() + " 학년 : " + students[1].getYear());
        System.out.println("이름 : " + students[2].getName() + " 학년 : " + students[2].getYear());
        System.out.println();

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름 : " + students[i].getName() + " 학년 : " + students[i].getYear());

        }

    }

}
