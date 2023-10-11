package chap11.exercise1105;

public class ApartList {
    String name;
    String surename;
    ApartList next;

    public ApartList() {
    }

    public ApartList(String name, String surename) {
        this.name = name;
        this.surename = surename;
    }

    @Override
    public String toString() {
        String str = "";
        str = str + name + ", " + surename + " ";
        ApartList next1 = this.next;
        while (next1 != null) {
            str = str + name + ", " + surename + " ";
            next1 = next1.next;
        }
        return str;
    }
}
