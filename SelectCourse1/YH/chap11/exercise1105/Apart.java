package chap11.exercise1105;

import java.util.Arrays;

public class Apart {
    private int roomSize;
    private String address;
    private ApartList lis;


    public Apart(int roomSize, String address, ApartList lis) {
        this.roomSize = roomSize;
        this.address = address;
        this.lis = lis;
    }

    public int countPerson() {
        ApartList copy = lis;
        int count = 0;
        while (copy != null) {
            count++;
            copy = copy.next;
        }
        copy = lis;
        return count;
    }

    public boolean checkFamily() {
        ApartList gen = new ApartList();
        gen.next = this.lis;
        lis = gen;
        while (gen.next != null) {
            if (!(lis.next.surename.equals(gen.next.surename))) {
                return false;
            }
            gen = gen.next;
        }
        lis = lis.next;
        return true;
    }

    public void whereLis() {
        System.out.println(lis);
    }

    @Override
    public String toString() {
        return "{roomSize = " + roomSize + ", address = " + address + ", residentName="
                + lis + "}";
    }

    public static void main(String[] args) {
        ApartList a1 = new ApartList("1", "a");
        ApartList a2 = new ApartList("2", "a");
        ApartList a3 = new ApartList("3", "a");
        ApartList a4 = new ApartList("4", "a");
        ApartList a5 = new ApartList("5", "a");
        ApartList a6 = new ApartList("6", "a");
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        a6.next = null;

        Apart apart = new Apart(10, "jeonju", a1);

        System.out.println(apart.countPerson());
        System.out.println(apart.checkFamily());
        apart.whereLis();


    }
}