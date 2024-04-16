package med;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CopyListwithRandomPointer {


    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }


    public Node copyRandomList1(Node head) {
        if(head ==null){
            return null;
        }
        List<Node> list =new LinkedList<>();
        List<Node> oldlist =new LinkedList<>();
        Node tmp = head;
        Node newHead = new Node(head.val);
        list.add(newHead);
        oldlist.add(head);
        Node  newTmp =newHead;
        while(tmp.next != null){
            tmp=tmp.next;
            oldlist.add(tmp);
            newTmp.next=new Node(tmp.val);
            newTmp=newTmp.next;
            list.add(newTmp);
        }
        for(int index=0;index<oldlist.size();index++){
         if(oldlist.contains(oldlist.get(index).random)){
             int randInt=oldlist.indexOf(oldlist.get(index).random);
             list.get(index).random=list.get(randInt);
         }


        }

        return newHead;
    }
    public Node copyRandomList(Node head) {
        if(head ==null){
            return null;
        }
       Node tmp = head;
        Map<Node,Node> map = new HashMap<>();

        while (tmp!=null){
            map.put(tmp,new Node(tmp.val));
            tmp=tmp.next;
        }
        tmp=head;
        while (tmp!=null){
            map.get(tmp).next= map.get(tmp.next);
            map.get(tmp).random = map.get(tmp.random);
            tmp=tmp.next;
        }




        return map.get(head);
    }
}




