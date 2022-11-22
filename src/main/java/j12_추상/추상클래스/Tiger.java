package j12_추상.추상클래스;

public class Tiger extends Animal {

//    public Tiger() { 생략해도 됨
//        super();
//    }

    public Tiger(String kind) {
        super(kind);
    }

    @Override
    public void move() {
        System.out.println("호랑이가 움직입니다.");
    }

}
