import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Apartment {
    private int size;
    private String address;
    private String[] person=new String[10];
    private int personsize;

    public Apartment(int size,String address){
         this.size=size;
        this.address=address;
    }
    public Apartment(int size,String address,String[] person,int personsize){
        this.size=size;
        this.address=address;
        this.person=person;
        this.personsize=personsize;
    }
    public String getAddress() {
        return address;
    }

    public int getSize() {
        return size;
    }

    public String[] getPerson() {
        return person;
    }
    public int getPersonsize() {
        return personsize;
    }

    public void addPerson(String name){
        if(getPersonsize()>10)
        System.out.println("full");
        else
        person[personsize++]="name";
    }
    public void save(String filename) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(filename);
            pw.println(size);
            pw.println(address);
            pw.println(person.length);
            for (String p : person) {
                pw.println(p);
            }
       
        }
        public static Apartment read(BufferedReader br) throws IOException {
        String str = br.readLine();
        int size = Integer.parseInt(br.readLine());
        String address = br.readLine();

        Apartment apartment = new Apartment(size, address);

        int pCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < pCount; i++) {
            String p = br.readLine();
            apartment.addPerson(p);
        }

        return apartment;
        }    
    
public static void main(String[] args) throws IOException {
    Apartment ap=new Apartment(50, "Gwangju", args, 10);

    ap.addPerson("a");
    ap.addPerson("b");
    ap.save("ex08.txt");
    // ap.printInfo("ex08.txt");
    
}}

    

    //  public static Apartment read(BufferedReader reader) throws IOException {
    //     int size = Integer.parseInt(reader.readLine());
    //     String address = reader.readLine();
    //     int occupantsCount = Integer.parseInt(reader.readLine());

    //     Apartment apartment = new Apartment(size, address);

    //     
    //     }
