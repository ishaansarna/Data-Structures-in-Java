import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListStack<T> implements Iterable<T> {
    LinkedList<T> list = new LinkedList<>();

    LinkedListStack() {
    }

    LinkedListStack(T element) {
        push(element);
    }

    public int size() {
        return list.size();
    }

    public void push(T element) {
        list.addLast(element);
    }

    public T pop() {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        return list.removeLast();
    }

    public T peek() {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        return list.getLast();
    }

    public int search(T element) {
        return list.lastIndexOf(element);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
