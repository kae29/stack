package com.education;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @org.junit.jupiter.api.Test
    void pushPopTest() {
        Stack stack = new Stack(5);
        stack.push('1');
        stack.push('2');
        stack.push('3');
        stack.push('4');
        stack.push('5');
        stack.push('6');

        assertEquals('5', stack.pop());
        assertEquals('4', stack.pop());
        assertEquals('3', stack.pop());
        assertEquals('2', stack.pop());
        assertEquals('1', stack.pop());
        assertEquals(' ', stack.pop());
    }
}