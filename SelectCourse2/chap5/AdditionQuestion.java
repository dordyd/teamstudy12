import java.util.Random;
import java.util.Scanner;

import textio.TextIO;

interface IntQuestion {
    public String getQuestion();

    public int getCorrectAnswer();
}

class Question {
    static class SubtractionQuestion implements IntQuestion {
        private int a, b;

        public SubtractionQuestion() {
            a = (int) (Math.random() * 50 + 1);
            b = (int) (Math.random() * 50);

            if (b > a) {
                int temp = a;
                a = b;
                b = temp;
            }
        }

        public String getQuestion() {
            return a + " - " + b + " ?";
        }

        public int getCorrectAnswer() {
            return a - b;
        }
    }
}

public class AdditionQuestion {

    private int a, b; // The numbers in the problem.

    public AdditionQuestion() { // constructor
        a = (int) (Math.random() * 50 + 1);
        b = (int) (Math.random() * 50);
    }

    public String getQuestion() {
        return +a + " + " + b + " ?";
    }

    public int getCorrectAnswer() {
        return a + b;
    }

    public int getnCorrectAnswer() {
        return a - b;
    }

}
