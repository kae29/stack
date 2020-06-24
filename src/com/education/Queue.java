package com.education;

public class Queue {
    private int length;
    private char[] queue;

    Queue(int length) {
        this.length = length;
        queue = new char[length];
    }

    /**
     * Функция добавления элемента в очередь
     * @param value - добавляемый элемент в очередь
     * @return true - элемент успешно добавлен
     *         false - очередь заполнена, невозможно добавить
     */
    public boolean push(char value) {
        return true;
    }

    /**
     * Функция вытаскивания элемента из очереди
     * @return первый элемент из очереди
     *         ' ' - очередь пуста
     */
    public char pop() {
        return ' ';
    }
}
