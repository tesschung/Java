import java.util.HashMap;

public class Card {

    // suitNumber
    public int suitNumber = 0;
//    public final int Clubs = 1;
//    public final int Hearts = 2;
//    public final int Diamonds = 3;
//    public final int Spades = 4;

    // rankNumber
    public int rankNumber = 0;
//    public final int Ace = 1;
//    public final int Jack = 11;
//    public final int Queen = 12;
//    public final int King = 13;

    // Card 생성자
    // int suit int rank
    public Card (int suitNumber, int rankNumber) {
        this.suitNumber = suitNumber;
        this.rankNumber = rankNumber;
    }

    public String getSuit() {
        switch (this.suitNumber) {
            case (1) :
                return "Clubs";

            case (2) :
                return "Hearts";

            case (3) :
                return "Diamonds";

            case (4) :
                return  "Spades";

            default: return "";
        }
    }

    public String getRank() {
        switch (this.rankNumber) {
            case (1) :
                return "Ace";

            case (11) :
                return "Jack";

            case (12) :
                return "Queen";

            case (13) :
                return  "King";

            default: return Integer.toString(this.rankNumber);
        }
    }

    @Override
    public String toString() {
        String suit = "";
        switch (this.suitNumber) {
            case (1) :
                suit = "Clubs";
                break;

            case (2) :
                suit = "Hearts";
                break;

            case (3) :
                suit = "Diamonds";
                break;


            case (4) :
                suit =  "Spades";
                break;
        }
        String rank = "";
        switch (this.rankNumber) {
            case (1) :
                 rank = "Ace";
                break;

            case (11) :
                rank = "Jack";
                break;

            case (12) :
                rank =  "Queen";
                break;

            case (13) :
                rank =   "King";
                break;

            default: rank = Integer.toString(this.rankNumber);
                break;
        }

        return rank+" of "+suit;
    }





}
