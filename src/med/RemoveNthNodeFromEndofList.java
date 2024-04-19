package med;

public class RemoveNthNodeFromEndofList {

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode removeNthFromEnd(ListNode head, int n) {


      int len = 0;

      ListNode tmp = head;

      while (tmp!=null){
          len++;
          tmp=tmp.next;
      }
      if(len == 1){
          head=null;
          return head;
      }
      tmp=head;
      ListNode lastNode = null;
      for(int index=0;index<=len-n;index++){
if(index==(len-n-1)){
    lastNode=tmp;
}else if(index == (len-n)){
    if(lastNode == null){
        head= tmp.next;
        break;
    }
    if(tmp.next!=null){
        lastNode.next = tmp.next;
    }else {
        lastNode.next=null;
    }
   break;
}


     tmp=tmp.next;
      }

     return head;
    }
}
