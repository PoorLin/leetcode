package med;

import java.util.LinkedList;
import java.util.List;

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


    public Node copyRandomList(Node head) {
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
}




