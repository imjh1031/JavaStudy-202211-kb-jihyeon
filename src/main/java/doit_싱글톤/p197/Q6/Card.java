package doit_싱글톤.p197.Q6;

public class Card {

    private int cardNumber;
    private static int serialNum = 1000;

    Card() {
        serialNum++;
        cardNumber = serialNum;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}
