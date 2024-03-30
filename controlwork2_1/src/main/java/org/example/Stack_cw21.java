package org.example;

import java.util.EmptyStackException;

public class Stack_cw21<T> {
    private Node<T> top;

    public Stack_cw21() {
        this.top = null;
    }

    public void push(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    public static void main(String[] args) {
        Stack_cw21<Integer> stack = new Stack_cw21<>();
        stack.push(17);
        stack.push(69);
        stack.push(52);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
