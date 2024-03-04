package easy;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode returnList1=new ListNode(1);
        ListNode returnList2=new ListNode(2);
        ListNode returnList3=new ListNode(4);
returnList1.next=returnList2;
returnList2.next=returnList3;

        ListNode returnList11=new ListNode(1);
        ListNode returnList22=new ListNode(3);
        ListNode returnList33=new ListNode(4);
        returnList11.next=returnList22;
        returnList22.next=returnList33;
        mergeTwoLists(returnList1,returnList11);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 ==null && list2==null){
            return null;
        }
       ListNode returnList=new ListNode();
ListNode tmpList=returnList;
        while (list1!=null || list2!=null){
            if(list1 ==null){
                tmpList.val=list2.val;
                if(list2.next!=null){
                    tmpList.next=new ListNode();
                    tmpList= tmpList.next;
                }
                list2=list2.next;
            } else if (list2 == null) {
                tmpList.val=list1.val;
                if(list1.next!=null){
                    tmpList.next=new ListNode();
                    tmpList= tmpList.next;
                }
                list1=list1.next;
            }else {

                if (list1.val>list2.val){
                    tmpList.val=list2.val;
                    tmpList.next=new ListNode();
                    tmpList= tmpList.next;
                    list2=list2.next;
                }else {
                    tmpList.val=list1.val;
                    tmpList.next=new ListNode();
                    tmpList= tmpList.next;
                    list1=list1.next;
                }


            }


        }
       return returnList;



    }
}
