package SelectCourse1.CH.chap7;

public class Person {
    private String name;
    private int number;

    public Person(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void deleteNum() {
        number--;
    }

    @Override
    public String toString() {
        return (number + 1) + "번 " + name;
    }
}
