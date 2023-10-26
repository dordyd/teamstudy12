class Algorithm {
    public static int calc(int first,int end,int n) {
        int result=0;
        switch (n) {
            case 1:
                for (int i = first; i < end; i++) {
                    result+=i;
                }
                case 2:
                for (int j = first; j < end; j++) {
                    result*=j;
                }
                break;
        
            default:
                break;
        }
        return result;
    }
}

public class Test {

    public static void main(String[] args) {
        int add1to10=Algorithm.calc(1,10,1);
        int mult1to10=Algorithm.calc(1,10,2);

        System.out.println("add: "+add1to10);
        System.out.println("mult: "+mult1to10);
    }
}
