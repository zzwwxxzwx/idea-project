package Test.listnode;

public class demo {
    public static void main(String[] args) {
        ListNode lt1 = new ListNode(3);
        ListNode lt2 = new ListNode(4,lt1);
        ListNode l1 = new ListNode(2,lt2);
        ListNode lk1 = new ListNode(5);
        ListNode lk2 = new ListNode(6,lk1);
        ListNode l2 = new ListNode(4,lk2);

        ListNode lr = addTwoNumbers(l1,l2);
        while (l1.next!=null){
            System.out.print(lr.val+",");
            l1=l1.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        ListNode lr=new ListNode(0);
        int carry = 0;
        while(l1.next!=null || l2.next!=null ){

            int l1Val = l1 != null ? l1.val:0;
            int l2Val = l2 != null ? l2.val:0;
            int sumVal = l1Val+l2Val+carry;
            carry=sumVal/10;
            sumVal-=10*carry;
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;

            ListNode lt=new ListNode(sumVal);
            lr.next=lt;
        }
        if(carry>0){
            lr.next=new ListNode(carry);
        }
        return lr;
    }
}
