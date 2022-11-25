package doit_싱글톤.p197.Q6;

public class CardCompany {

    private static CardCompany Instance = new CardCompany();

    private CardCompany() {}
    public static CardCompany getInstance() {
        if(Instance == null)
            Instance = new CardCompany();
            return Instance;
    }

    public Card createCard() {

        Card card = new Card();
        return card;
    }
}


