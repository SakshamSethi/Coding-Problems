class Solution {
    public int getDecimalValue(ListNode head) {
        int size = getSize(head), result = 0;
        ListNode temp = head;
        while(temp != null){
            result += temp.val * Math.pow(2, --size );
            temp = temp.next;
        }
        return result;
    }
    int getSize(ListNode head){
        if(head == null) return 0;
        return 1 + getSize(head.next);
    }
}