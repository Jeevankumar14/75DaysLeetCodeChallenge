/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hs = new HashSet<>();
        ListNode current_node = head;
        while (current_node != null) {
            if (hs.contains(current_node)) {
                return true;
            }
            hs.add(current_node);
            current_node = current_node.next;
        }
        return false;
    }
}