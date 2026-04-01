import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Day02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ListNode head = vectorToListnode(arr);
        System.out.println(listnodeToVector(head));
    }

    public static ListNode vectorToListnode(int[] arr) {
        // write code here
        if(arr==null||arr.length==0)return null;
        ListNode head = new ListNode(arr[0]);
        ListNode p=head;
        for(int i=1;i<arr.length;i++){
            ListNode q = new ListNode(arr[i]);
            p.next = q;
            p=q;
        }
        return head;
    }

    public static ArrayList<Integer> listnodeToVector(ListNode head) {
        ArrayList<Integer> result = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            result.add(current.val);
            current = current.next;
        }
        return result;
    }
}
