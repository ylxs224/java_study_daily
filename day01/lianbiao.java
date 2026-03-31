package day01;

import java.util.*;

class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
    }
}

class Solution {
    public ArrayList<Integer> listnodeToVector(ListNode head) {
        ArrayList<Integer> result = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            result.add(current.val);
            current = current.next;
        }
        return result;
    }
}

public class lianbiao {
    public static ListNode createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] data = {1,1,4,5,1,4};
        ListNode head = createLinkedList(data);
        Solution s = new Solution();
        System.out.println(s.listnodeToVector(head));
    }
}