package SelectCourse1.CH.chap11;

public class Apartment {
    private int size;
    // ArrayList<Person> person = new ArrayList<>();
    PersonList person;
    private String address;
    private int personCount;

    public Apartment(int size, String address) {
        this.size = size;
        this.address = address;
        personCount = 0;
    }

    public String getAddress() {
        return address;
    }

    public int getSize() {
        return size;
    }

    public int getPerson() {
        return personCount;
    }

    public void addPerson(String name, String surname, int age) {
        person = ListOfPersons.insert(person, new Person(name, surname, personCount, age));
        personCount++;
    }

    public String getPersonName(int num) {
        PersonList tmp = person;
        for (int i = 0; i < personCount - num; i++) {
            tmp = tmp.next;
        }

        return tmp.info.name;
    }

    public void removePerson(int num) {
        PersonList tmp = person;
        if (num >= personCount) {
            return;
        }
        for (int i = 0; i < personCount - num; i++) {
            tmp = tmp.next;
        }
        ListOfPersons.delete(person, tmp.info);
        personCount--;
    }

    @Override
    public String toString() {
        PersonList tmp = person;
        String str = "아파트 크기 : " + size + "\n주소 : " + address + "\n";
        while (tmp != null) {
            str += tmp.info.toString() + "\n";
            tmp = tmp.next;
        }
        return str;
    }

    public int countPersons() {
        PersonList tmp = person;
        int count = 0;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }
        return count;
    }

    public boolean checkFamily() {
        PersonList tmp = person;
        String surname = person.info.surname;
        while (tmp != null) {
            if (!surname.equals(tmp.info.surname)) {
                return false;
            }
            tmp = tmp.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Apartment apart = new Apartment(10, "address");
        apart.addPerson("one", "sur", 16);
        apart.addPerson("two", "sur", 16);
        apart.addPerson("three", "sur", 16);
        apart.addPerson("four", "sur", 16);
        System.out.println(apart);
        System.out.println(apart.getPersonName(2));
        apart.removePerson(2);
        System.out.println(apart);
        System.out.println(apart.checkFamily());
        System.out.println(apart.countPersons());
    }
}
