package j09_접근지정자.캡슐화;

public class StudentMain2 {

    public static void main(String[] args) {

        Student2 s2 = new Student2("부산대학교", "임지현", 2022, false);
        s2.printInfo2();

        s2.setSchool("부산대학교");
        s2.setName("임지현");
        s2.setYear(2022);

        String nameS2 = s2.getName();
        System.out.println(nameS2);


    }

}
