package doit_싱글톤.p197.Q5;

/*
    아침 출근길에 김 씨는 4,000원을 내고 별다방에서 아메리카노를 사 마셨습니다.
    이 씨는 콩다방에서 4,500원을 내고 라떼를 사 마셨습니다.
    객체 지향으로 프로그래밍 하시오.
 */

public class CoffeeTest {

    public static void main(String[] args) {

        Person Kim = new Person("Kim", 10000);
        Person Lee = new Person("Lee", 10000);

        StarCoffee starcoffee = new StarCoffee();
        BeanCoffee beancoffee = new BeanCoffee();

        Kim.BuyStarCoffee(starcoffee, 4000);
        Lee.BuyBeanCoffee(beancoffee, 4500);

    }

}
