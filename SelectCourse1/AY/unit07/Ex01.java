public class Ex01{
    static double scalarProduct(double[] A, double[] B){
        double C=0;
        for(int i=0; i<A.length; i++){
            C+=A[i]*B[i];
            
        }
        return C;
    }
    public static void main(String[] args) {
        
    }
}