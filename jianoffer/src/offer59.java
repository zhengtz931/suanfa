import java.util.Deque;
import java.util.LinkedList;

public class offer59 {
    //单调队列
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || nums == null || k == 1)
            return nums;
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++)
        {
            while(!deque.isEmpty() && deque.peekLast() < nums[i])
            deque.removeLast();
            deque.addLast(nums[i]);
        }
        res[0] = deque.peekFirst();
        for (int i = k; i < nums.length;i++)
        {
            if (deque.peekFirst() == nums[i - k])
                deque.removeFirst();
            while(!deque.isEmpty() && deque.peekLast() < nums[i])
                deque.removeLast();
            deque.addLast(nums[i]);
            res[i - k + 1] = deque.peekFirst();
        }
        return res;
    }

    public static void main(String[] args) {
        offer59 o = new offer59();
        int[] nums = {1,2,3,4,5};
        int[] res = o.maxSlidingWindow(nums,1);
        for (int i = 0; i < res.length;i++)
        {
            System.out.print(res[i] +" ");
        }
    }
}
