import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//re
public class Ex05 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        String fileName = "ex05.txt"; 
        String bestAvr = HighAverage(fileName);
        System.out.println(bestAvr);
    }

    public static String HighAverage(String fileName) throws NumberFormatException, IOException {
       
            String one;
            FileReader fr=new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);


             String highStudent = "";
             double highAvr = 0; 

            while ((one = br.readLine()) != null) {
                String[] obj = one.split(" ");
                

                String name = obj[0];
                double sum = 0.0;
                int count = 0;

                for (int i = 1; i < obj.length; i++) {
    
                        int mark = Integer.parseInt(obj[i]);
                        sum += mark;
                        count++;
                   
                }

            
                double average = sum / count;

                if (average > highAvr) {
                    highAvr = average;
                    highStudent = name;
                }
            }
       return highStudent;
        }

        
    }

