/*class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}*/

public class Day04 {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        System.out.println("===== 迭代法反转前 =====");
        printList(head1);
        ListNode newHead1=reverseList(head1);
        System.out.println("===== 迭代法反转后 =====");
        printList(newHead1);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
        System.out.println("===== 递归法反转前 =====");
        printList(head2);
        ListNode newHead2=reserseListRecursive(head2);
        System.out.println("===== 递归法反转后 =====");
        printList(newHead2);
    }

    public static void printList(ListNode head){
        ListNode curr = head;
        while(curr!=null){
            System.out.print(curr.val+" -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // 方法1：迭代法反转链表（新手首选，时间O(n)，空间O(1)）
    public static ListNode reverseList(ListNode head){
        // 前驱节点，初始为null（新链表的尾节点）
        ListNode prev = null;
        // 当前节点，初始为头节点
        ListNode curr = head;

        // 遍历链表，逐个反转指针
        while (curr != null) {
            // 保存当前节点的下一个节点（防止断链）
            ListNode nextTemp = curr.next;
            // 反转当前节点的指针：指向前驱节点
            curr.next = prev;
            // 前驱节点后移：变成当前节点
            prev = curr;
            // 当前节点后移：变成之前保存的下一个节点
            curr = nextTemp;
        }
        // 遍历结束后，prev就是新的头节点
        return prev;
    }

    // 方法2：递归法反转链表（进阶，时间O(n)，空间O(n)，递归栈）
    public static ListNode reserseListRecursive(ListNode head){
        // 递归终止条件：空链表或只有一个节点，直接返回
        if (head == null || head.next == null) {
            return head;
        }

        // 递归反转后面的链表，得到新的头节点
        ListNode newHead = reserseListRecursive(head.next);
        // 反转当前节点和下一个节点的指针
        head.next.next = head;
        // 断开当前节点的原指针，防止环
        head.next = null;
        // 返回新的头节点
        return newHead;
    }
}
