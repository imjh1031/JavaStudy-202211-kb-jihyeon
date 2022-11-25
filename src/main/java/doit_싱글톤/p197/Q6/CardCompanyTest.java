package doit_싱글톤.p197.Q6;

/*
    카드 회사에서 카드를 발급할 때마다 카드 고유 번호를 부여해 줍니다.
    카드가 생성될 때마다 카드 번호가 자동으로 증가할 수 있도록 카드 클래스를 만드시오.
 */

public class CardCompanyTest {

    public static void main(String[] args) {

       CardCompany company = CardCompany.getInstance(); // 싱글톤

        Card myCard = company.createCard();
        Card yourCard = company.createCard();

        System.out.println(myCard.getCardNumber()); // 1001
        System.out.println(yourCard.getCardNumber()); // 1002

    }

}
