public class ListNode {
    String info;
    ListNode next;

    public ListNode() {
        this.info = null;
        this.next = null;
    }
    
    public ListNode(String info) {
        this.info = info;
        this.next = null;
    }
    
    public ListNode(String info, ListNode next) {
        this.info = info;
        this.next = next;
    }
    
    public String getData() {
        return this.info;
    }
 
}