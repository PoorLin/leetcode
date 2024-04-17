package med;

import java.util.HashMap;
import java.util.Map;

public class ReverseLinkedList2 {
      public class ListNode {
          int val;
          ListNode next;

          ListNode() {
          }

          ListNode(int val) {
              this.val = val;
          }
      }

    public ListNode reverseBetween(ListNode head, int left, int right) {

        Map<Integer,ListNode> map =new HashMap<>();
        ListNode tmp =head;
        int index=1;
        while(tmp!=null){
            map.put(index,tmp);
            tmp=tmp.next;
            index++;
        }

        if(right == left){
            return head;
        }else {
            int loop = right - left+1;
            int runTimes = (loop/2);
            System.out.println(runTimes);
          for(int nowIndex=0;nowIndex<runTimes;left++,right--,nowIndex++){
              int tmpLefVal = map.get(left).val;
              map.get(left).val=map.get(right).val;
              map.get(right).val=tmpLefVal;
          }


        }
          return head;
    }
    }
