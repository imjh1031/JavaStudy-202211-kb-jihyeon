package doit_싱글톤.p197.Q5;

public class Person {

    public String name;
    public int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void BuyStarCoffee(StarCoffee starcoffee, int money) {
        String message = starcoffee.brewing(4000);
        if(message != null) {
            this.money -= money;
            System.out.println(name + "씨가 " + money + "원 " + message);
        }
    }

    public void BuyBeanCoffee(BeanCoffee beancoffee, int money) {
        String message = beancoffee.brewing(4500);
        if(message != null) {
            this.money -= money;
            System.out.println(name + "씨가 " + money + "원 " + message);
        }
    }



}
