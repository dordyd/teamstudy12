public class LinkedList {

    public LinkedList() {

    }

    public void insertBefore(ListNode pre, String info) {
        ListNode gen = new ListNode(info);
        gen.next = pre.next;

        pre.next = gen;
    }

    public void insertAfter(ListNode lis, String info) {
        ListNode gen = new ListNode(info);
        if (lis == null) {
            lis = gen;
        }
        ListNode tmp = lis;

        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = gen;
    }

    public void deleteNode(ListNode lis, String info) {
        ListNode pre = lis;
        ListNode tmp = lis.next;

        if (info.equals(pre.getData())) {
            lis = pre.next;
            pre.next = null;
        } else {
            while (tmp != null) {
                if (info.equals(tmp.getData())) {
                    if (tmp.next == null) {
                        pre.next = null;
                    } else {
                        pre.next = tmp.next;
                        tmp.next = null;
                    }
                    break;
                } else {

                    pre = tmp;
                    tmp = tmp.next;
                }
            }
        }
    }

    public void deleteNode(ListNode lis) {
        ListNode pre;
        ListNode tmp;

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

    public ListNode searchNode(ListNode lis, String info) {
        ListNode tmp = lis;

        while (tmp != null) {

            if (info.equals(tmp.getData())) {
                return tmp;
            } else {

                tmp = tmp.next;
            }
        }

        return tmp;
    }

    public void reverseList(ListNode lis) {
        ListNode next = lis;
        ListNode current = null;
        ListNode pre = null;

        while (next != null) {
            pre = current;
            current = next;
            next = next.next;
            current.next = pre;
        }

        lis = current;
    }

    public void printList(ListNode lis) {
        ListNode tmp = lis;

        while (tmp != null) {
            System.out.print(tmp.getData() + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        ListNode a = new ListNode();
        // ListNode b = new ListNode("B", c);
        ListNode c = new ListNode("C", null);
        LinkedList linkedList = new LinkedList();

        linkedList.insertBefore(a, "sun");
        linkedList.insertAfter(a, "mon");
        linkedList.insertAfter(a, "tue");
        linkedList.insertAfter(a, "wed");
        linkedList.insertAfter(a, "thu");
        linkedList.insertAfter(a, "fri");
        linkedList.insertAfter(a, "sat");
        linkedList.printList(a);

        String str = "mon";
        System.out.println(linkedList.searchNode(a, str).getData());

        linkedList.deleteNode(a, linkedList.searchNode(a, "mon").getData());
        linkedList.printList(a);

        linkedList.reverseList(a);
        linkedList.printList(a);
    }

}
