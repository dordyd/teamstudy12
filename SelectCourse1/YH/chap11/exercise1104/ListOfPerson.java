package chap11.exercise1104;

public class ListOfPerson {
    Person person;
    ListOfPerson next;

    public static int length(ListOfPerson lis) {
        int count = 0;
        while (lis != null) {
            count++;
            lis = lis.next;
        }

        return count;
    }

    private static ListOfPerson firstInsert(ListOfPerson lis, Person person) {
        lis.person = person;

        return lis;
    }

    public static ListOfPerson insert(ListOfPerson lis, Person person) {
        if (ListOfPerson.length(lis) == 1 && lis.person == null) {
            return ListOfPerson.firstInsert(lis, person);
        }
        ListOfPerson gen;
        ListOfPerson p = new ListOfPerson();
        gen = lis;
        p.person = person;


        while (gen.next != null) {
            gen = gen.next;
        }

        gen.next = p;
        p.next = null;

        return lis;
    }

    public static ListOfPerson delete(ListOfPerson lis, Person person) {
        ListOfPerson gen = new ListOfPerson();
        gen.next = lis;
        lis = gen;

        while (gen.next != null) {
            if (gen.next.person.equals(person)) {
                gen.next = gen.next.next;
                return lis.next;
            }
            gen = gen.next;
        }
        return lis.next;
    }

    public static ListOfPerson modification(ListOfPerson lis, Person oldPerson, Person newPerson) {
        ListOfPerson gen = lis;
        while (gen != null) {
            if (oldPerson.equals(gen.person)) {
                gen.person = newPerson;
            }

            gen = gen.next;
        }
        return lis;
    }

    public static void print(ListOfPerson lis) {
        while (lis != null) {
            System.out.println(lis.person);
            lis = lis.next;
        }
        System.out.println();
    }

    public static int liveCityCount(ListOfPerson lis, String city) {
        int count = 0;
        while (lis != null) {
            if (lis.person.getCity().equals(city)) {
                count++;
            }
            lis = lis.next;
        }
        return count;
    }

    public static float averageAge(ListOfPerson lis) {
        int count = ListOfPerson.length(lis);
        float sumAge = 0.0f;
        while (lis != null) {
            sumAge += lis.person.getAge();
            lis = lis.next;
        }

        return sumAge / count;
    }


    public static void main(String[] args) {
        Person p1 = new Person("p1", "kim", 25, "jeonju");
        Person p2 = new Person("p2", "kim", 25, "icsan");
        Person p3 = new Person("p3", "byeon", 25, "gwanju");
        Person p4 = new Person("p4", "lee", 25, "daejeon");

        ListOfPerson lis = new ListOfPerson();
        lis = ListOfPerson.insert(lis, p1); // 얘는 상관이 없음. 왜냐 인덱스를 마지막에만 추가하기때문에
        lis = ListOfPerson.insert(lis, p2);
        lis = ListOfPerson.insert(lis, p3);
        lis = ListOfPerson.insert(lis, p4);

        ListOfPerson.print(lis);

        lis = ListOfPerson.delete(lis, p1); // 맨 앞의 주소값이 바뀌게 된다면, lis = 으로 새로 바꿔야함.
        ListOfPerson.print(lis);

        Person p5 = new Person("p5", "lee", 25, "mokpo");
        ListOfPerson.modification(lis, p2, p5);
        ListOfPerson.print(lis);

        System.out.println("averageAge = " + ListOfPerson.averageAge(lis));
        System.out.println("gwanju count = " + ListOfPerson.liveCityCount(lis, "gwanju"));
    }
}
