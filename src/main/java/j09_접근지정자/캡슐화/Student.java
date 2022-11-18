package j09_접근지정자.캡슐화;

public class Student {

    private String name;
    public String gender;

    public Student() {}

    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void setName(String name) { // set 앞에 void. ()동일한 변수명. this.name = name;
        this.name = name;
    }

    public String getName() { // 외부로 가져갈 수 있음. get 앞에 변수명. 리턴
        return name;
    }

    public void printInfo() {
        System.out.println("Name : " + name);
        System.out.println("gender : " + gender);
    }
}
