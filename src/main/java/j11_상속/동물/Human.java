package j11_상속.동물;

public class Human extends Animal {

    public Human() {
        super();
        System.out.println("Human 객체 생성");
    }

    @Override // @ 붙은 문법 -> 어노테이션. 구분하기 위해 붙여둠
    public void move() { // 재정의
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBooks() {
        System.out.println("사람이 책을 읽습니다.");
    }

}
