public class Ex01 {

    public static void printCapitalized(String s) {
        String sArr[] = s.split(" ");

        for (int i = 0; i < sArr.length; i++) {
            char current = sArr[i].charAt(0);
            current = Character.toUpperCase(current);
            System.out.print(current + sArr[i].substring(1) + " ");
        }

    }

    public static void main(String[] args) {
        String s = "my macbook gone dead";

        printCapitalized(s);
    }
}