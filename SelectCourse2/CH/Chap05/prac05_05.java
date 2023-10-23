package SelectCourse2.CH.Chap05;

import java.util.Scanner;

public class prac05_05 {

    public static Scanner scan = new Scanner(System.in);

    public boolean playGame() {
        Deck dealerDeck = new Deck();
        Deck playerDeck = new Deck();
        dealerDeck.shuffle();
        playerDeck.shuffle();
        BlackjackHand dealerBlackjackHand = new BlackjackHand();
        BlackjackHand playerBlackjackHand = new BlackjackHand();

        dealerBlackjackHand.addCard(dealerDeck.dealCard());
        dealerBlackjackHand.addCard(dealerDeck.dealCard());

        if (dealerBlackjackHand.getBlackjackValue() == 21) {
            System.out.println("딜러의 카드 합이 21입니다.");
            return false;
        }

        playerBlackjackHand.addCard(playerDeck.dealCard());
        playerBlackjackHand.addCard(playerDeck.dealCard());
        if (playerBlackjackHand.getBlackjackValue() == 21) {
            System.out.println("플레이어의 카드 합이 21입니다.");
            return true;
        }

        System.out.println(
                "현재 플레이어의 카드 합은 " + playerBlackjackHand.getBlackjackValue() + " 입니다 멈추시려면 Stand, 더 받으시려면 Hit을 입력해주세요");
        String input = scan.nextLine();
        while (input.equals("Hit")) {
            playerBlackjackHand.addCard(playerDeck.dealCard());
            if (playerBlackjackHand.getBlackjackValue() > 21) {
                System.out.println(playerBlackjackHand.getBlackjackValue() + "로 패배하셨습니다");
                return false;
            }
            System.out.println(
                    "현재 플레이어의 카드 합은 " + playerBlackjackHand.getBlackjackValue()
                            + " 입니다 멈추시려면 Stand, 더 받으시려면 Hit을 입력해주세요");
            input = scan.nextLine();
        }

        while (dealerBlackjackHand.getBlackjackValue() <= 16) {
            dealerBlackjackHand.addCard(dealerDeck.dealCard());
            if (dealerBlackjackHand.getBlackjackValue() > 21) {
                System.out.println("딜러가 버스트됐습니다.");
                return true;
            }
        }

        System.out.printf("플레이어 패의 총합은 %d, 딜러 패의 총합은 %d \n", playerBlackjackHand.getBlackjackValue(),
                dealerBlackjackHand.getBlackjackValue());
        if (dealerBlackjackHand.getBlackjackValue() >= playerBlackjackHand.getBlackjackValue()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int money = 100;
        boolean wantContinue = true;
        int batMoney = 0;
        String input = "";
        prac05_05 game = new prac05_05();
        while (money > 0 && wantContinue) {
            System.out.println("배팅할 금액을 입력하세요");
            batMoney = scan.nextInt();
            if (batMoney > money) {
                System.out.println("보유한 금액보다 많은 금액을 입력해 최대 금액으로 설정됩니다.");
                batMoney = money;
            }
            scan.nextLine();
            if (game.playGame()) {
                money += batMoney;
            } else {
                money -= batMoney;
            }
            System.out.println(money + "원 남았습니다. 더 하시겠습니까? yes or no");
            input = scan.nextLine();
            if (input.equals("no")) {
                wantContinue = false;
            }
        }
    }
}
