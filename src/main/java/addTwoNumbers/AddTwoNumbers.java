package addTwoNumbers;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
 * order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean overflow;
        int toAdd = l1.val + l2.val;
        overflow = toAdd >= 10;
        toAdd = overflow ? toAdd - 10 : toAdd;
        ListNode res = new ListNode(toAdd);
        ListNode resIt = res;
        while (l1.next != null && l2.next != null) {
            l1 = l1.next;
            l2 = l2.next;
            toAdd = overflow ? l1.val + l2.val + 1 : l1.val + l2.val;
            overflow = toAdd >= 10;
            toAdd = overflow ? toAdd - 10 : toAdd;
            resIt.next = new ListNode(toAdd);
            resIt = resIt.next;
        }
        while (l1.next != null) {
            l1 = l1.next;
            toAdd = overflow ? l1.val + 1 : l1.val;
            overflow = toAdd >= 10;
            toAdd = overflow ? toAdd - 10: toAdd;
            resIt.next = new ListNode(toAdd);
            resIt = resIt.next;
        }
        while (l2.next != null) {
            l2 = l2.next;
            toAdd = overflow ? l2.val + 1 : l2.val;
            overflow = toAdd >= 10;
            toAdd = overflow ? toAdd - 10: toAdd;
            resIt.next = new ListNode(toAdd);
            resIt = resIt.next;
        }
        if(overflow) {
            resIt.next = new ListNode(1);
        }

        return res;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}