package SelectCourse2.YH.code.chap05.exercise0504;

import java.util.Scanner;
public class BlackjackHandTest {
    public static void main(String[] args) {
        Deck deck;
        Card draw;
        BlackjackHand player1 = new BlackjackHand();
        boolean again = true;
        Scanner scanner = new Scanner(System.in);
        while (again) {
            deck = new Deck(true);
            deck.shuffle();

            int drawCardNum = (int) (Math.random() * 5) + 2;
            for (int i = 0; i < drawCardNum; i++) {
                draw = deck.dealCard();
                player1.addCard(draw);
                System.out.println(draw);
            }
            System.out.println("Player Hand is " + player1.getBlackjackValue());
            System.out.println("do you want to play game more? 1: continue || 2: break");
            System.out.print("input your answer : ");
            int ans = scanner.nextInt();
            if (ans == 1) {
                player1.clear();
                again = true;
            } else if (ans == 2) {
                again = false;
            }
        }
    }
}
