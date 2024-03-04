package easy;


  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int x) {
         val = x;
          next = null;
      }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode head1=new ListNode(3);
        ListNode head2=new ListNode(2);
        ListNode head3=new ListNode(0);
        ListNode head4=new ListNode(-4);
head1.next=head2;
head2.next=head3;
head3.next=head4;
head4.next=head1;
        hasCycle(head1);

    }
    public static boolean hasCycle(ListNode head) {

        ListNode slow = head;

        ListNode fast = head;
        while (fast!=null && fast.next!=null){

            slow =slow.next;
            fast = fast.next.next;
            if(slow == fast){

                return true;

            }

        }

        return false;
    }
}
