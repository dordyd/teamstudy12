package SelectCourse2.CH.Chap05;

import java.util.Scanner;

public class prac05_04 {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        BlackjackHand bjh = new BlackjackHand();

        bjh.addCard(deck.dealCard());
        System.out.println(bjh.getCard(bjh.getCardCount() - 1));
        bjh.addCard(deck.dealCard());
        System.out.println(bjh.getCard(bjh.getCardCount() - 1));
        Scanner scan = new Scanner(System.in);

        System.out.println("지금 합계는 " + bjh.getBlackjackValue() + " 입니다 그만 받고싶으면 1을 입력하세요");
        int i = scan.nextInt();
        while (i != 1) {
            bjh.addCard(deck.dealCard());
            System.out.println(bjh.getCard(bjh.getCardCount() - 1));
            System.out.println("지금 합계는 " + bjh.getBlackjackValue() + " 입니다 그만 받고싶으면 1을 입력하세요");
            i = scan.nextInt();
        }
        System.out.println(bjh.getBlackjackValue());
    }
}
