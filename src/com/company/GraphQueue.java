package com.company;

class GraphQueue {
    private int[] array;
    private int size = 10;
    private int head;
    private int tail;
    private int count;

    GraphQueue() {
        array = new int[size];
        head = 0;
        tail = -1;
        count = 0;
    }

    void insert(int value) {
        if (tail == size - 1) {
            tail = -1;
        }

        array[++tail] = value;
        count++;
    }

    int remove() {
        if (head == size) {
            head = 0;
        }

        count--;
        return array[head++];
    }

    boolean isEmpty() {
        return count == 0;
    }

    int getArraySize() {
        int counter = 0;
        int arrSize;
        for (int value : array) {
            if (value == 0) {
                counter++;
            }
        }
        arrSize = size - (counter - 1);
        return arrSize;
    }
}