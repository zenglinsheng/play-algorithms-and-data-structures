package A_07_Linked_List.L_07_Implement_Queue_in_LinkedList;

public interface Queue<E> {

    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}
