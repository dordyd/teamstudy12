import java.util.ArrayList;
import java.util.List;

//다시 해야함
public class Apartment {

    private int size;
    private String address;
    private ListOfPerson p;

    public Apartment(int size, String address, ListOfPerson p) {
        this.size = size;
        this.address = address;
        this.p = p;
    }

    public int getSize() {
        return size;
    }

    public String getAddress() {
        return address;
    }

    public void addResident(String name) {
        if (size < 10) {
            p.insertPerson(p, null);
        }
    }

    // public void removeResident(int num) {
    // if (num >= 0 && num < residents.size()) {
    // residents.remove(num);

    // for (int i = num; i < residents.size(); i++) {

    // residents.set(i, residents.get(i));
    // }
    // }
    // }
    public int countPersons(Apartment apar) {
        int count = 0;
        while (apar.p.next != null) {
            count++;
            //apar.p.next=apar.p.next.next;
        }
        return count;
    }

    public boolean checkFamily(Apartment apar, String s) {
        while (apar.p.next != null) {
            if (apar.p.people.firstName != s)//equal써야함 안그러면 false
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Apartment Address: ").append(address).append("\n");
        sb.append("Size: ").append(size).append(" square meters\n");
        // sb.append("Number of Residents:
        // ").append(getNumberOfResidents()).append("\n");
        sb.append("Residents:\n");
        // for (int i = 0; i < residents.size(); i++) {
        // sb.append(i).append(": ").append(residents.get(i)).append("\n");
        // }
        return sb.toString();
    }
}
