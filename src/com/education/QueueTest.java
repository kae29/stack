package com.education;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void push1() {
        Queue queue = new Queue(5);

        assertTrue(queue.push('1'));
        assertTrue(queue.push('2'));
        assertTrue(queue.push('3'));
        assertTrue(queue.push('4'));
        assertTrue(queue.push('5'));
        assertFalse(queue.push('6'));
    }

    @Test
    void push2() {
        Queue queue = new Queue(5);

        assertTrue(queue.push('1'));
        assertTrue(queue.push('2'));
        assertTrue(queue.push('3'));
        assertTrue(queue.push('4'));
        assertTrue(queue.push('5'));
        assertEquals('1',queue.pop());
        assertEquals('2',queue.pop());
        assertEquals('3',queue.pop());
        assertEquals('4',queue.pop());
        assertEquals('5',queue.pop());
        assertEquals(' ',queue.pop());
    }

    @Test
    void push3() {
        Queue queue = new Queue(5);

        assertTrue(queue.push('1'));
        assertTrue(queue.push('2'));
        assertTrue(queue.push('3'));
        assertTrue(queue.push('4'));
        assertTrue(queue.push('5'));
        assertEquals('1',queue.pop()); // queue состоит из: 2345
        assertTrue(queue.push('1')); // queue состоит из: 23451
        assertEquals('2',queue.pop());
        assertEquals('3',queue.pop());
        assertEquals('4',queue.pop());
        assertEquals('5',queue.pop());
        assertEquals('1',queue.pop());
        assertEquals(' ',queue.pop());
    }
}