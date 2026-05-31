package com.academy.zug_zug.Homework.ep23.DoubleLinkedList;

import java.util.NoSuchElementException;

public class DoubleLinkedList {
    private Node firstNode;
    private Node lastNode;
    private int size;

    public DoubleLinkedList() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    public void add(Object value) {
        Node node = new Node(value);
        if (size == 0) {
            node.prevNode = null;
            node.nextNode = null;
            firstNode = node;
            lastNode = node;
        } else {
            Node buf = lastNode;
            buf.nextNode = node;
            lastNode = node;
            node.prevNode = buf;
            node.nextNode = null;
        }
        size++;
    }

    public void add(int index, Object value) {
        if (size == 0 && index == 0) {
            Node node = new Node(value);
            lastNode = node;
            firstNode = node;
            node.nextNode = null;
            node.prevNode = null;
            size++;
        } else {
            if (index >= 0 && index <= size - 1) {
                Node node = new Node(value);
                Node buf;
                if (index == 0 && size == 1) {// Логика если добавляем в лист, где 1 нода
                    buf = firstNode;
                    firstNode = node;
                    lastNode = buf;
                    node.prevNode = null;
                    node.nextNode = buf;
                } else if (index == 0) { // Логика если добавляем в самое начало, где как минимум 2 ноды есть уже
                    buf = firstNode;
                    firstNode = node;
                    node.prevNode = null;
                    node.nextNode = buf;
                    buf.prevNode = node; // Добавил, логика исправлена получается
                } else if (index == size - 1) { // Логика если добавляем в самый конец
                    buf = lastNode;
                    lastNode = node;
                    buf.nextNode = node;
                    node.nextNode = null;
                    node.prevNode = buf;
                } else { //Логика, если добавляем в середину листа
                    buf = firstNode;
                    Node addingBuf;
                    for (int i = 0; i < index; i++) {
                        buf = buf.nextNode;
                    }
                    addingBuf = buf.prevNode;
                    addingBuf.nextNode = node;
                    node.nextNode = buf;
                    node.prevNode = addingBuf;
                }
                size++;
            } else {
                System.out.println("ochepyatka");
            }
        }
    }

    public Object get(int index) {
        try {
            if (index >= 0 && index <= size - 1) {
                if (size / 2 >= index) {
                    Node buf = firstNode;
                    for (int i = 0; i < index; i++) {
                        buf = buf.nextNode;
                    }
                    return buf.value;
                } else {
                    Node buf = lastNode;
                    for (int i = size - 1; i > index; i--) {
                        buf = buf.prevNode;
                    }
                    return buf.value;
                }
            } else {
                throw new NoSuchElementException("Nechego vidat tebe brat");
            }
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node buf = firstNode;
        for (int i = 0; i < size; i++) {
            sb.append(buf.value);
            if (i < size - 1) {
                sb.append(", ");
            }
            buf = buf.nextNode;
        }

        sb.append("]");
        return sb.toString();
    }

    private static class Node {
        Node nextNode;
        Node prevNode;
        Object value;

        public Node(Object value) {
            this.value = value;
        }
    }
}
