import java.io.PrintStream;

public class ListCDs {
    CD cd;
    ListCDs next;

    public ListCDs() {

    }

    public ListCDs(CD cd) {
        this.cd = cd;
    }

    public void insert(ListCDs lis, CD cd) {
        ListCDs gen = new ListCDs(cd);
        if (lis == null) {
            lis = gen;
        }
        ListCDs tmp = lis;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = gen;
    }

    public void delete(ListCDs lis) {
        ListCDs pre;
        ListCDs tmp;

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
    }

    public void print(ListCDs lis, PrintStream ps) {
        ListCDs p = lis;
        while (p != null) {
            ps.print(p.cd);
            p = p.next;
        }
        ps.println();
    }

    public int calculatePrice(ListCDs lis) {
        int sum = 0;
        while (lis != null) {
            sum += lis.cd.price;
            lis = lis.next;
        }
        return sum;
    }

    public void printCDAuthor(ListCDs lis) {
         while (lis != null) {
            System.out.println(lis.cd.author);
            lis = lis.next;
        }
    }

}
