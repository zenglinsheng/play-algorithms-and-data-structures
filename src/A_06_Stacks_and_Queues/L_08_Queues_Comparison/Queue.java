package A_06_Stacks_and_Queues.L_08_Queues_Comparison;

public interface Queue<E> {

    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}
