package A_06_Stacks_and_Queues.L_02_Array_Stack;

public interface Stack<E> {

    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}
