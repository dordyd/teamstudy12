import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStreamReader;

//re
public class Ex02 {
    public static void main(String[] args) throws IOException {
        System.out.println(avr());
    }
    public static double avr() throws IOException{
    
    

    InputStreamReader is=new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);

    
    double arr[]={0};
    int i=0;
    double sum=0;
    
    while(true){
        if(arr[i]==0)
        break;

    arr[i]=br.read();
    i++;
    }
    for(int j=0; j<i; j++){
        sum+= arr[i];
    }
    return sum/i;
    


    }
    
}