class Solution {
    
    private ListNode reverseLL(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode last = reverseLL(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
    
    public int getDecimalValue(ListNode head) {
        head = reverseLL(head);
        
        int result = 0;
        int power = 0;

        while(head != null) {
            if(head.val == 1) {
                result += Math.pow(2, power);
            }
            power++;
            head = head.next;
        }

        return result;
    }
}