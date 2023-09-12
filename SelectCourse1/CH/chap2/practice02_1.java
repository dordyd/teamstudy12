package SelectCourse1.CH.chap2;

/**
 * practice02-1
 */
public class practice02_1 {
    public static void main(String[] args) {
        String myName = new String("김철환");
        System.out.println(myName.substring(0,1) + myName.substring(myName.length()-1));
    }
    
}

/*
 * 
 * 
     System.out.println("김철환".substring(0,1) + "김철환".substring("김철환".length()-1));
 * 
 */