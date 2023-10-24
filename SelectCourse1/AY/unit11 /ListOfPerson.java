import java.io.PrintStream;
import java.lang.String;

public class ListOfPerson {
  Person people;
  ListOfPerson next;

  public ListOfPerson() {
    //this(null);
  }

  public ListOfPerson(Person p) {
    this.people = p;
  }

  public void insertPerson(ListOfPerson lis, Person person) {
    ListOfPerson gen = new ListOfPerson(person);
    if (lis == null) {
      lis = gen;
    }
    ListOfPerson tmp = lis;

    while (tmp.next != null) {
      tmp = tmp.next;
    }
    tmp.next = gen;
  }
  // if (n == a.length) {
  // Person[] b = new Person[a.length*2];
  // for (int i=0; i<a.length; i++)
  // b[i] = a[i];
  // a = b;
  // }
  // a[n] = p;
  // n++;

  public void deletePerson(ListOfPerson lis, Person person) {
    ListOfPerson pre;
    ListOfPerson tmp;

    if (lis == null) {
      return;
    }
    if (lis.next == null) {
      lis = null;
    } else {
      pre = lis;
      tmp = lis.next;
      while (tmp.next != null) {
        pre = tmp;
        tmp = tmp.next;
      }
      pre.next = null;
    } // pre노드는 마지막 노드의 이전노드가 되고 temp는 마지막 노드가 됨
    // if ((k >= 0) && (k < n)) {
    // for (int i = k; i < n; i++)
    // a[i] = a[i + 1];
    // n--;
    // }
    // if ((a.length > 10) && (n < a.length / 4)) {
    // Person[] b = new Person[a.length / 2];
    // for (int i = 0; i < n; i++)
    // b[i] = a[i];
    // a = b;
    // }
  }

  public void modifyPerson(ListOfPerson lis, String old, String ne) {
    ListOfPerson p = new ListOfPerson();
    p.next = lis;
    lis = p;

    while (p.next != null) {
      if (p.next.people.name.equals(old)) {
        p.next.people.name = ne;
        p = p.next;
      } else
        p = p.next;
    }
  }

  public void printPerson(ListOfPerson lis) {
    ListOfPerson p = lis;
    while (p != null) {
      System.out.println(p.people + " ");
      p = p.next;
    }
    System.out.println();
  }

  public int countCityPerson(ListOfPerson lis, String city) {
    int count = 0;
    while (lis != null) {
      if (lis.people.city.equals(city)) {
        count++;
      }
      lis = lis.next;
    }
    return count;
  }

  public double averageAge(ListOfPerson lis) {
    int count = 0;
    int sum = 0;
    while (lis != null) {
      count++;
      sum += lis.people.age;
      lis = lis.next;
    }
    return sum / count;
  }

  public static void main(String[] args) {

    Person p = new Person("jane", "davide", 23, "Paris");
    Person p2 = new Person("jul", "davide", 50, "Daegu");
    ListOfPerson lis = new ListOfPerson(p);

    // lis.insertPerson(lis, p);
    lis.insertPerson(lis, p2);

    lis.printPerson(lis);
    System.out.println(lis.countCityPerson(lis, "Daegu"));
    System.out.println(lis.averageAge(lis));

    lis.modifyPerson(lis, "jane", "Julia");
    lis.printPerson(lis);
  }
}
