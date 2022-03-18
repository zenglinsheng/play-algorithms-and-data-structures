package leetcode;

/**
 * @Auther: zls
 * @Date: 2022/3/16 16:28
 * @Description:
 */
public class Solution {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null)
            return head;

        // 1.创建虚拟头结点
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        // 2.找到要翻转节点的前一个节点leftNode
        ListNode leftNode = dummyHead;
        for (int i = 0;i < left - 1;i ++) {
            leftNode = leftNode.next;
        }

        // 3.翻转[left,right]区间的链表
        ListNode cur = leftNode.next;
        ListNode pre = null;
        int count = right - left + 1;
        for (int i = 0;i < count;i ++) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        // 4.将翻转之前的头结点,即翻转后的尾节点指向right+1处的节点(cur)
        leftNode.next.next = cur;
        // 5.将leftNode指向翻转后的节点pre
        leftNode.next = pre;

        return dummyHead.next;
    }

    // [1,2] [3]       mid=1  i=1  j=0  2
    // [1,2] [3,4]     mid=2  i=1  j=0  3
    // [1,2] [3,4,5]   mid=2  i=1  j=0  3
    // [1,2] [3,4,5,6] mid=3  i=1  j=1  4
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mid = (nums1.length + nums2.length) / 2;

        int i = 0;
        int j = 0;
        while (i + j + 1 <= mid) {
            if (i == nums1.length - 1) {
                j++;
                continue;
            }

            if (j == nums2.length - 1) {
                i++;
                continue;
            }

            if (nums1[i] < nums2[j]) {
                i ++;
            } else {
                j ++;
            }
        }

        if ((nums1.length + nums2.length) % 2 == 1) {
            return (float)Math.max(nums1[i], nums2[j]);
        }

        if (Math.abs(i - j) == 1)
            return (float)(nums1[i] + nums2[j]) / 2;

        return (float)i > j ? (nums1[i] + nums1[i - 1]) : (nums1[j] + nums1[j - 1]);
    }

    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length == 0) {
            return 0;
        }

        if (nums1.length == 0) {
            return nums2.length % 2 == 0 ? (float) (nums2[nums2.length / 2] + nums2[nums2.length / 2 - 1]) / 2 : (float) nums2[nums2.length / 2];
        }

        if (nums2.length == 0) {
            return nums1.length % 2 == 0 ? (float) (nums1[nums1.length / 2] + nums1[nums1.length / 2 - 1]) / 2 : (float) nums1[nums1.length / 2];
        }

        int len = (nums1.length + nums2.length) / 2 + 1;

        int[] nums3 = new int[len];
        int k = 0;
        int i = 0;
        int j = 0;
        for (int a = 0;a < len;a ++) {

            if (nums1[i] < nums2[j]) {
                nums3[k ++] = nums1[i ++];
            } else {
                nums3[k ++] = nums2[j ++];
            }

            if (i == nums1.length) {
                while (k < len) {
                    nums3[k ++] = nums2[j ++];
                }
                break;
            }
            if (j == nums2.length) {
                while (k < len) {
                    nums3[k ++] = nums1[i ++];
                }
                break;
            }
        }

        if ((nums1.length + nums2.length) % 2 == 0)
            return (float) (nums3[len - 1] + nums3[len -2]) / 2;
        else
            return (float) nums3[len - 1];
    }


    public static void main(String[] args) {
        double medianSortedArrays = findMedianSortedArrays2(new int[]{}, new int[]{2});
        System.out.println(medianSortedArrays);
    }

}
