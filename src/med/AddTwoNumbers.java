package med;


import java.sql.SQLOutput;

public class AddTwoNumbers {


       class ListNode {
          int val;
        ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
           int l1Len=0;
        ListNode temp1 =l1;
           while(temp1!=null){
              temp1=temp1.next;
               l1Len++;
           }
        int l2Len=0;
        ListNode temp2 =l2;
        while(temp2!=null){
            temp2=temp2.next;
            l2Len++;
        }
        System.out.println(l1Len);
        System.out.println(l2Len);
        int add=0;
         if(l1Len>=l2Len){
             ListNode loopL1 =l1;
             ListNode loopL2 =l2;
             for(int index=0;index<l1Len;index++){


                 if(loopL2==null){
                     int l1val = loopL1.val;
                     int sum = l1val+add;
                     loopL1.val=sum%10;
                     if(sum/10==1){
                         add=1;
                     }else {
                         add=0;
                     }
                     if(index == l1Len-1){

                     }else {
                         loopL1=loopL1.next;
                     }


                 }else {
                     int l1val = loopL1.val;
                     int l2val = loopL2.val;
                     int sum = l1val+l2val+add;
                     loopL1.val=sum%10;
                     if(sum/10==1){
                         add=1;
                     }else {
                         add=0;
                     }
                     if(index == l1Len-1){

                     }else {
                         loopL1=loopL1.next;
                     }
                     loopL2=loopL2.next;
                 }
             }

           if(add==1){
                 loopL1.next=new ListNode(1);
             }
             return l1;

         }else {

             ListNode loopL1 =l1;
             ListNode loopL2 =l2;
             for(int index=0;index<l2Len;index++){


                 if(loopL1==null){
                     int l2val = loopL2.val;
                     int sum = l2val+add;
                     loopL2.val=sum%10;
                     if(sum/10==1){
                         add=1;
                     }else {
                         add=0;
                     }
                     if(index == l2Len-1){

                     }else {
                         loopL2=loopL2.next;
                     }


                 }else {
                     int l1val = loopL1.val;
                     int l2val = loopL2.val;
                     int sum = l1val+l2val+add;
                     loopL2.val=sum%10;
                     if(sum/10==1){
                         add=1;
                     }else {
                         add=0;
                     }
                     if(index == l2Len-1){

                     }else {
                         loopL2=loopL2.next;
                     }
                     loopL1=loopL1.next;
                 }
             }

             if(add==1){
                 loopL2.next=new ListNode(1);
             }
             return l2;
         }
    }
}
