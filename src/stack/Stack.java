package stack;

import java.util.EmptyStackException;

class Stack<T> {
    private Node<T> top;

    public Stack() {
        this.top = null;
    }

    void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
    }

    boolean isEmpty() {
        return top == null;
    }

    T pop() {
        if (isEmpty())
            throw new EmptyStackException();
        T data = top.data;
        top = top.next;
        return data;
    }

    void print() {
        if (isEmpty())
            throw new EmptyStackException();
        Node<T> curr = top;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
