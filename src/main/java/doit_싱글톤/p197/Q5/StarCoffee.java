package doit_싱글톤.p197.Q5;

public class StarCoffee {

    int money;

    public String brewing(int money) {

        this.money += money;

        if(money == CafeMenu.StarAmericano) {
            return "별다방 아메리카노를 구매하셨습니다.";
        } else if(money == CafeMenu.StarLatte) {
            return "별다방 카페라떼를 구매하셨습니다.";
        } else {
            return null;
        }
    }

}
