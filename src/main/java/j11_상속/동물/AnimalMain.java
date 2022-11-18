package j11_상속.동물;

public class AnimalMain {

    // 상위 객체가 먼저 나옴(ex = Animal)

    public static void main(String[] args) {

        Animal animal = new Animal();
        Human human = new Human();
        Tiger tiger = new Tiger();

        int a = (int) 3.14; // 다운캐스팅
        double d = (double) 3; // 업캐스팅

        Animal hAnimal = (Animal) human; // 업캐스팅
        Animal tAnimal = tiger;
        Animal[] animals = new Animal[3];

        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Animal();

        System.out.println();

        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }

        // hAnimal.* readBooks(); 가 안보임 업캐스팅

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Human) {
                Human h = (Human) animals[i]; // 다운캐스팅 명시
                h.readBooks(); // 다운캐스팅해서 호출 가능
            } else if (animals[i] instanceof Tiger) {
                Tiger t = (Tiger) animals[i];
                t.hunting();
            } else {
                System.out.println("다운캐스팅 불가");
            }
        }

    }

}
