package A_07_Linked_List.L_06_Implement_Stack_in_LinkedList;

public interface Stack<E> {

    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}
