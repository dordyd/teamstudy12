import textio.TextIO;
import java.util.Scanner;

public class BlackJackHand extends Hand {

    /**
     * Computes and returns the value of this hand in the game
     * of Blackjack.
     */
    public int getBlackjackValue() {

        int val;      // The value computed for the hand.
        boolean ace;  // This will be set to true if the
                      //   hand contains an ace.
        int cards;    // Number of cards in the hand.

        val = 0;
        ace = false;
        cards = getCardCount();  // (method defined in class Hand.)

        for ( int i = 0;  i < cards;  i++ ) {
                // Add the value of the i-th card in the hand.
            Card card;    // The i-th card; 
            int cardVal;  // The blackjack value of the i-th card.
            card = getCard(i);
            cardVal = card.getValue();  // The normal value, 1 to 13.
            if (cardVal > 10) {
                cardVal = 10;   // For a Jack, Queen, or King.
            }
            if (cardVal == 1) {
                ace = true;     // There is at least one ace.
            }
            val = val + cardVal;
         }

         // Now, val is the value of the hand, counting any ace as 1.
         // If there is an ace, and if changing its value from 1 to 
         // 11 would leave the score less than or equal to 21,
         // then do so by adding the extra 10 points to val. 

         if ( ace == true  &&  val + 10 <= 21 )
             val = val + 10;

         return val;

    }  // end getBlackjackValue()

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean contin = true;

        while (contin) {
            Deck deck = new Deck();
            deck.shuffle();

            int numCard = (int) (Math.random() * 5) + 2;
            BlackJackHand hand = new BlackJackHand();

            for (int i = 0; i < numCard; i++) {
                Card card = deck.dealCard();
                hand.addCard(card);
                System.out.println(card);
            }

            int blackjackValue = hand.getBlackjackValue();
            System.out.println("hand value: " + blackjackValue);

            System.out.print("continue? (y/n) ");
            String choice = scanner.next().toLowerCase();
            contin = choice.equals("y");
        }

        scanner.close();
    }

} // end class BlackJackHand