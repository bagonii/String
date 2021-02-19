import java.util.Arrays;
import java.util.Collections;

enum Suit {SPADES, HEARTS, DIAMONDS, CLUBS}
enum Rank {TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE}

public class AssignmentNo4 {

    public static void main(String[] args) {
        String[] myCards = deck();
        System.out.println(Arrays.toString(myCards));
        shuffle(myCards);
        System.out.println(Arrays.toString(myCards));
        System.out.println(myCards[0]);
        System.out.println(Arrays.toString(Arrays.copyOfRange(myCards, 1, 7)));
    }

    public static String[] deck() {
        String[] deck = new String[52];
        int i = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck[i] = suit.toString() + rank.toString();
                i++;
            }
        }
        return deck;
    }

    public static void shuffle(String[] deck) {
        Collections.shuffle(Arrays.asList(deck));
    }
}
