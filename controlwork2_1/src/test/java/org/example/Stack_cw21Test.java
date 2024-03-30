package org.example;

import junit.framework.TestCase;

import java.util.EmptyStackException;

public class Stack_cw21Test extends TestCase {

    public void testPush() {
        Stack_cw21<Integer> stack = new Stack_cw21<>();
        stack.push(17);
        stack.push(69);
        assertEquals(Integer.valueOf(69),stack.pop());

    }

    public void testIsEmpty() {
        Stack_cw21<Integer> stack = new Stack_cw21<>();
        assertTrue(stack.isEmpty());
        stack.push(17);
        assertFalse(stack.isEmpty());
    }

    public void testPop() {
        Stack_cw21<Integer> stack = new Stack_cw21<>();
        try {
            stack.pop();
            fail("Ошибочка. Стек пуст");
        } catch (EmptyStackException ignored) {

        }
    }
}