package j08_클래스;

public class PhoneMain {

    public static void main(String[] args) {

        Phone iPhone14 = new Phone(); // new = 메모리 할당. 이름은 클래스명과 동일
        Phone galaxyS22 = new Phone("SANSUNG", "GalaxyS22");

        System.out.println(iPhone14);
        System.out.println(galaxyS22);

        iPhone14.company = "Apple"; // . = 주소 참조

        iPhone14.printPhoneCompany();
        iPhone14.printPhoneModel();

        galaxyS22.printPhoneCompany();
        galaxyS22.printPhoneModel();

    }

}

/*

    Class : Student, StudeentMain
    학생 정보
    String school(학교명)
    String name(학생이름)
    int studentYear(학년)
    boolean gender(성별 true = 남, false = 여)

    showStudentInfo() {
    학교명 : 부산대학교
    이름 : 홍길동
    학년 : 3
    성별 : 남

 */
