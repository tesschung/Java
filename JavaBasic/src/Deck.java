import java.util.ArrayList;
import java.util.Random;

public class Deck {
    // Deck 생성자
    // 기본 파라미터 없음
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
    }


    // getCards() 카드 목록 리턴하는 메소드
    public ArrayList<Card> getCards() {
        return cards;
    }

    // addCard 카드 객체를 추가하는 메소드
    public void addCard(Card card) {
        cards.add(card);
    }

    // shuffle 카드를 섞는 메소드
    // cards의 순서를 뒤죽박죽 섞습니다.
    // Random 클래스를 이용해서 완전히 랜덤하게 섞어주세요!
    public void shuffle() {
        Random random = new Random();

        for (int i = 0; i < cards.size(); i++) {
            int randInt = random.nextInt(cards.size()); // cards사이즈 만큼의 앤덤한 값
            Card temp1 = cards.get(i);
            cards.set(i, cards.get(randInt)); // 오른쪽 값으로 대체
            cards.set(randInt, temp1);

        }
    }


    // deal 딜링하는 메소드
    // 먼저 hand라는 새로운 Deck 인스턴스를 만드세요.
    // count가 5면 현재 덱의 cards의 마지막 다섯 장을 빼고,
    // 그 다섯 장을 hand의 cards에 넣어주세요. 그리고 hand를 리턴해주면 됩니다.
    public Deck deal(int count) {
        Deck hand = new Deck();
        if (count == 5) {
            for (int i = 51; i > 46; i--) {
                Card temp = cards.get(i);
                hand.cards.add(temp);
            }
        }


        return hand;

    }


    // print() 핸드 출력하는 메소드
    public void print() {
        for (Card card : cards) {
            System.out.println(card.toString());
        }
    }
}
