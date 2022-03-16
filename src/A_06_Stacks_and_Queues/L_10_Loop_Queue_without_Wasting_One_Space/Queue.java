package A_06_Stacks_and_Queues.L_10_Loop_Queue_without_Wasting_One_Space;

public interface Queue<E> {

    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}
