package A_06x_Stacks_and_Queues.L_02_LC225_Implement_Stack_using_Queues;

import java.util.LinkedList;
import java.util.Queue;

// 自己实现的只基于一个queue
public class MyStack5 {

    private Queue<Integer> q;

    public MyStack5() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
    }

    public int pop() {
        if (q.size() == 1)
            return q.remove();

        int size = q.size();
        for (int i = 0;i < size - 1;i ++) {
            q.add(q.remove());
        }

        return q.remove();
    }

    public int top() {
        int ret = this.pop();
        this.push(ret);
        return ret;
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
