package A_06_Stacks_and_Queues.L_04_More_about_Leetcode;

public interface Stack<E> {

    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}
