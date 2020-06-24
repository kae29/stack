package com.education;

public class Stack {
    private int length;
    private char[] stack;
    private int top = -1; // stack top number

    Stack(int length) {
        this.length = length;
        stack = new char[length];
    }

    public void push(char value) {
        if (top+1 < length) {
            stack[top+1] = value;
            top = top+1; // top++
        }
    }

    public char pop() {
        if (isEmpty() != true) {
            top = top - 1;
            return stack[top+1];
        }
        return ' ';
    }

    private boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }
}
