package SelectCourse1.YH.chap2;

public class Practice01 {
    public static void main(String[] args) {
        String myName = "kimyounho";

        System.out.println(myName.substring(0, 3).concat(" ").concat(myName.substring(3, myName.length())));
        System.out.println(myName.substring(0, 1).concat(" ").concat(myName.substring(myName.length()-1, myName.length())));
        String firstName = myName.substring(0,3);
        String lastName = myName.substring(3,myName.length());
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
    }
}
