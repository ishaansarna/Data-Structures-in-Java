import java.util.LinkedList;

public class Stack<T> implements Iterable<T> {
    LinkedList<T> list = new LinkedList<T>();

    Stack() { };

    Stack(T element) {
        push(element);
    }

    public int size() {
        return list.size();
    }

    public void push (T element) {

    }
}
