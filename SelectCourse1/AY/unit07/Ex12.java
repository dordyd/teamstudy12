import java.util.ArrayList;
import java.util.List;


public class Ex12 {
   
    private int size;
    private String address;
    private List<String> residents;

    public Ex12(int size, String address) {
        this.size = size;
        this.address = address;
        this.residents = new ArrayList<>();
    }

    public int getSize() {
        return size;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfResidents() {
        return residents.size();
    }

    public void addResident(String name) {
        if (residents.size() < 10) {
            residents.add(name);
        }
    }

    public String getResidentName(int number) {
        if (number >= 0 && number < residents.size()) {
            return residents.get(number);
        }
        return null;
    }

    public void removeResident(int number) {
        if (number >= 0 && number < residents.size()) {
            residents.remove(number);
           
            for (int i = number; i < residents.size(); i++) {

                residents.set(i, residents.get(i));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ex12 Address: ").append(address).append("\n");
        sb.append("Size: ").append(size).append(" square meters\n");
        sb.append("Number of Residents: ").append(getNumberOfResidents()).append("\n");
        sb.append("Residents:\n");
        for (int i = 0; i < residents.size(); i++) {
            sb.append(i).append(": ").append(residents.get(i)).append("\n");
        }
        return sb.toString();
    }
}


