package A_08x_Linked_List.L_03_LC206_Reverse_Linked_List;

class Solution {

    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null)
            return head;

        ListNode rev = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return rev;
    }
}