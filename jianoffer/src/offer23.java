public class offer23 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
    public ListNode reverseList(ListNode head) {
        ListNode next = new ListNode(-1);
        ListNode pre = null;
        while(head != null)
        {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
    public ListNode initListNode(int[] nums)
    {
        if (nums.length == 0 || nums == null)
            return null;
        ListNode head = new ListNode(-1);
        ListNode node = head;
        for (int i = 0; i < nums.length; i++)
        {
            node.next = new ListNode(nums[i]);
            node = node.next;
        }
        return head.next;
    }
    public static void main(String[] args) {
    offer23 o = new offer23();
    int[] nums = {1,2,3,4};
    ListNode head =  o.initListNode(nums);
    head = o.reverseList(head);
    ListNode node = head;
    while(node != null)
    {
        System.out.print(node.val + " ");
        node = node.next;
    }
    }
}
