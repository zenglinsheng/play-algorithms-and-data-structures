package A_06_Stacks_and_Queues.L_07_Implementation_of_Loop_Queue;

public interface Queue<E> {

    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}
