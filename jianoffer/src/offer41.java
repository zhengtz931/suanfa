import java.util.PriorityQueue;

public class offer41 {
    PriorityQueue<Integer> queue1;
    PriorityQueue<Integer> queue2;
    public offer41() {
        //小根堆
        queue1 = new PriorityQueue<>();
        //大根堆
        queue2 = new PriorityQueue<>((x,y)->(y - x));
    }

    public void addNum(int num) {
    if(queue1.size() > queue2.size())
    {
        queue1.add(num);
        queue2.add(queue1.poll());
    }
    else
    {
        queue2.add(num);
        queue1.add(queue2.poll());
    }
    }

    public double findMedian() {
        if (queue1.size() == queue2.size())
        {
            double queue1peek = queue1.peek();
            double queue2peek = queue2.peek();
            double reasult = (queue1peek + queue2peek)/2;
            return reasult;
        }
        else
        {
            if (queue1.size() > queue2.size())
                return queue1.peek();
            else
                return queue2.peek();
        }

    }

    public static void main(String[] args) {
        offer41 object = new offer41();
       object.addNum(1);
       object.addNum(2);
       object.addNum(3);
       System.out.println(object.findMedian());
    }
}
