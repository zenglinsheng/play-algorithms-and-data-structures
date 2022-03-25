package A_08x_Linked_List.L_02_LC206_Reverse_Linked_List;

class Solution {

    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}