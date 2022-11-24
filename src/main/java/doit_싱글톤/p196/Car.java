package doit_싱글톤.p196;

/*
    자동차 공장에서 생산되는 자동차는 제작될 때마다 고유 번호가 부여됩니다.
    자동차 번호가 10001부터 시작되어 생성될 때마다 10002, 10003 이렇게 붙도록
    자동차 공장 클래스, 자동차 클래스를 만들어 보세요.
    두 클래스는 다음 CarFactoryTest가 수행될 수 있도록 구현해 봅니다.
 */

public class Car {

    private static int serialNumber = 10000;
    private int carNum;

    public Car() {
        serialNumber++;
        carNum = serialNumber;
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

}
