package SelectCourse2.YH.code.chap05.exercise0504.exercise0505;

import SelectCourse2.YH.code.chap05.exercise0504.BlackjackHand;
import SelectCourse2.YH.code.chap05.exercise0504.Card;
import SelectCourse2.YH.code.chap05.exercise0504.Deck;

import java.util.Scanner;

/**
 * 사용자가 블랙잭을 할 수 있는 프로그램을 작성하세요.
 * 이 게임은 카지노에서 진행되는 블랙잭의 간소화된 버전입니다.
 * 컴퓨터는 딜러 역할을 합니다.
 * 이전 연습문제와 마찬가지로, 프로그램은 Card.java, Deck.java, Hand.java, BlackjackHand.java에 정의된 클래스들이 필요합니다.
 * (이것은 지금까지 연습문제에서 나온 가장 긴 그리고 복잡한 프로그램입니다.)
 * <p>
 * 먼저 사용자가 한 게임을 진행하는 서브루틴을 작성해야 합니다.
 * 서브루틴은 사용자가 게임에서 이겼는지 여부를 나타내는 boolean 값을 반환해야 합니다.
 * 사용자가 이기면 true를 반환하고, 딜러가 이기면 false를 반환하세요.
 * 프로그램에는 Deck 클래스의 객체와 BlackjackHand 타입의 두 개 객체(딜러와 사용자 각각 하나씩)가 필요합니다.
 * 블랙잭의 일반적인 목적은 카드 손패 값이 가능한 한 21에 가깝게 만드는 것입니다(단, 21을 넘어서는 안 됩니다). 게임 진행 방식은 다음과 같습니다:
 * 처음에 각 플레이어 손패에 두 장의 카드를 배분합니다.
 * 딜러 손패 값이 이 시점에서 21이라면 딜러 승리
 * 그렇지 않다면 사용자 손패 값이 21인 경우 사용자 승리 ("블랙잭"으로 부릅니다.)
 * 동점일 경우 딜러 승리하므로 양 플레이어 모두 블랙잭일 경우도 딜러 승리
 * 게임 종료 상황 아니라면:
 * 사용자 카드 추가 기회 제공: 여기서 "Hit" 선택시 추가 카드 받게 되며 "Stand" 선택시 카드 받기 중단
 * Hit 선택 시: 21 초과 가능성 있으며 그런 경우 즉시 게임 종료 및 패배
 * Stand 선택 시: 게임 종료 전 딜러도 추가로 카드 받음
 * (딜러는 규칙만 준수하며 선택의 여지 없음. 딜러 손패 값이 16 이하인 경우만 Hit)
 * 승자 결정: 딜러가 21 초과시 사용자 승리, 그렇지 않고 딜러 총합이 사용자 총합 이상일 경우 딜러 승리,
 * 그 외에는 사용자 승리
 * <p>
 * 프로그래밍 주의사항: 서브루틴에서 언제든지 우승자를 알게 되면 "return true;" 또는 "return false;"를 통해 서브루틴을 종료하고 메인 프로그램으로 돌아갈 수 있습니다.
 * 너무 많은 변수가 서브루틴에 있지 않도록 userHand.getBlackjackValue()와 같은 함수 호출을 숫자가 사용되는 어디에서나 (출력문 또는 if문의 조건 등) 사용할 수 있습니다.
 * <p>
 * 사용자가 여러 게임의 블랙잭을 할 수 있는 메인 프로그램을 작성하세요.
 * 흥미롭게 하기 위해, 사용자에게 100달러를 주고 게임에 베팅할 수 있게 하세요. 만약 사용자가 지면 베팅한 금액을 사용자의 돈에서 뺍니다.
 * 만약 이기면 베팅한 금액만큼 돈을 추가로 줍니다.
 * 프로그램은 사용자가 종료하길 원하거나 돈이 바닥날 때까지 계속됩니다.
 */
public class Exercise0505 {

    private static final int BUST = 21;
    int bettingMoney = 0;

    public void playGame() {
        Deck deck = new Deck();
        deck.shuffle();

        BlackjackHand player = new BlackjackHand();
        BlackjackHand dealer = new BlackjackHand();
        boolean again = true;
        for (int i = 0; i < 2; i++) {
            player.addCard(deck.dealCard());
            dealer.addCard(deck.dealCard());
        }

        deckPrint(player, "player");

        while (again == true) {
            System.out.println("Do you want draw card? Hit : 1 || Stand : 2");
            try {
                boolean choice = pickHitStand();
                if (choice == true) {
                    again = true;
                    hit(deck, player, dealer);
                } else {
                    again = false;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + ", input again");
            }
        }
        deckPrint(dealer, "dealer");
        deckPrint(player, "player");
        if (winner(player, dealer)) {
            System.out.print("Winner is player");
        } else
            System.out.print("Winner is dealer");
    }

    public void deckPrint(BlackjackHand player, String playerName) {
        System.out.println(playerName + "value is \"" + player + "\" -> " + player.getBlackjackValue());
    }

    public void hit(Deck deck, BlackjackHand player1, BlackjackHand player2) {
        player1.addCard(deck.dealCard());
        player2.addCard(deck.dealCard());
        if(player1.getBlackjackValue() > BUST)
            System.out.println("player Bust, value is " + player1.getBlackjackValue());

        else if(player1.getBlackjackValue() > BUST)
            System.out.println("player Bust, value is" + player1.getBlackjackValue());
    }

    public boolean pickHitStand() {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        if (val == 1) {
            return true;
        } else if (val == 2) {
            return false;
        } else
            throw new IllegalArgumentException("wrong input");
    }

    public boolean winner(BlackjackHand player1, BlackjackHand player2) {
        if (player1.getBlackjackValue() >= player2.getBlackjackValue()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Exercise0505 exercise0505 = new Exercise0505();
        exercise0505.playGame();
    }
}
