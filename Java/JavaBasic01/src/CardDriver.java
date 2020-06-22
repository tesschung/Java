public class CardDriver {
    public static void main(String[] args) {
        // 52장 스탠다드 카드 덱 생성
        Deck standardDeck = new Deck();

        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                Card newCard = new Card(suit, rank);

                standardDeck.addCard(newCard);
            }
        }

        // 카드 셔플
        standardDeck.shuffle();

        // 딜링
        Deck hand1 = standardDeck.deal(5);
        Deck hand2 = standardDeck.deal(5);

        // 각 핸드 출력
        hand1.print();
        System.out.println("----------");
        hand2.print();
    }
}
