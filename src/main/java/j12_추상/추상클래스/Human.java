package j12_추상.추상클래스;

public class Human extends Animal {

    public Human() {
        super(); // 기본생성자가 없으면 호출X
    }

    public Human(String kind) {
        super(kind); // 기본생성자가 없으면 ()입력
    }

    @Override
    public void move() {
        System.out.println("사람이 움직입니다.");
    }

}
