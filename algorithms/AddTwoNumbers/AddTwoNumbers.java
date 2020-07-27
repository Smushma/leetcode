/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String list1 = "";
        String list2 = "";
        
        while (l1 != null) {
            list1 += Integer.toString(l1.val);
            l1 = l1.next;
        }
        
        while (l2 != null) {
            list2 += Integer.toString(l2.val);
            l2 = l2.next;
        }
        
        int int1 = Integer.parseInt(new StringBuilder(list1).reverse().toString());
        int int2 = Integer.parseInt(new StringBuilder(list2).reverse().toString());
        String list3 = new StringBuilder(Integer.toString(int1 + int2)).reverse().toString();
        
        System.out.println(list3);
        
        ListNode result = new ListNode(0);
        ListNode curr = result;
        for (int i = 0; i < list3.length(); i++){
            String conv = Character.toString(list3.charAt(i));
            curr.next = new ListNode(Integer.parseInt(conv));
            curr = curr.next;
        }
        
        return result.next;
    }
}