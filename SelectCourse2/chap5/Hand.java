import java.util.ArrayList;
import java.util.Collections;

public class Hand {
    ArrayList<Card> card;

    public Hand() {

    }

    public void clear() {
        card.clear();
    }

    public void addCard(Card c) {
        if (c == null) {
            throw new NullPointerException("null");
        }
        card.add(c);
    }

    /**
     * If the specified card is in the card, it is removed.
     */
    public void removeCard(Card c) {
        card.remove(c);
    }

    /**
     * Remove the card in the specified position from the
     * card. Cards are numbered counting from zero.
     * 
     * @throws IllegalArgumentException if the specified
     *                                  position does not exist in the card.
     */
    public void removeCard(int position) {
        if (position < 0 || position >= card.size()) {
            throw new IllegalArgumentException("Invalid");
        }
        card.remove(position);
    }

    /**
     * Return the number of cards in the card.
     */
    public int getCardCount() {
        return card.size();
    }

    /**
     * Get the card from the card in given position, where
     * positions are numbered starting from 0.
     * 
     * @throws IllegalArgumentException if the specified
     *                                  position does not exist in the card.
     */
    public Card getCard(int position) {
        if (position < 0 || position >= card.size()) {
            throw new IllegalArgumentException("Invalid");
        }
        return card.get(position);
    }

    /**
     * Sorts the cards in the card so that cards of the same
     * suit are grouped together, and within a suit the cards
     * are sorted by value.
     */
    public void sortBySuit() {

    }

    /**
     * Sorts the cards in the card so that cards are sorted into
     * order of increasing value. Cards with the same value
     * are sorted by suit. Note that aces are considered
     * to have the lowest value.
     */
    public void sortByValue() {

    }

    public String toString() {
        return card.toString();
    }

    public static void main(String[] args) {
        Hand hand = new Hand();
        Card card1 = new Card(1, 10);
        Card card2 = new Card(2, 5);
        Card card3 = new Card(3, 2);

        hand.addCard(card1);
        hand.addCard(card2);
        hand.addCard(card3);

        System.out.println("Original " + hand);

        hand.sortBySuit();
        System.out.println("Sorted Suit: " + hand);

        hand.sortByValue();
        System.out.println("Sorted Value: " + hand);
    }

}
