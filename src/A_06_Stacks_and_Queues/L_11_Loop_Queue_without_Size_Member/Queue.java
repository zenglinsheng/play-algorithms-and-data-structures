package A_06_Stacks_and_Queues.L_11_Loop_Queue_without_Size_Member;

public interface Queue<E> {

    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}
