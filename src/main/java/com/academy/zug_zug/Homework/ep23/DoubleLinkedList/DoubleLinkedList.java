package com.academy.zug_zug.Homework.ep23.DoubleLinkedList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
        if (size == 0) {
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
                if (index == 0 && size == 1) {
                    buf = firstNode;
                    firstNode = node;
                    lastNode = buf;
                    node.prevNode = null;
                    node.nextNode = buf;
                } else if (index == 0) {
                    buf = firstNode;
                    firstNode = node;
                    node.prevNode = null;
                    node.nextNode = buf;
                } else if (index == size - 1) {
                    buf = lastNode;
                    lastNode = node;
                    buf.nextNode = node;
                    node.nextNode = null;
                    node.prevNode = buf;
                } else {
                    buf = firstNode;
                    for (int i = 0; i < index; i++) {
                        buf = buf.nextNode;
                    }
                    buf.prevNode.nextNode = node;
                    node.prevNode = buf.prevNode;
                    node.nextNode = buf;

                }
                size++;
            } else {
                System.out.println("ochepyatka");
            }
        }
    }

    public Object get(int index) {
        if (index >= 0 && index <= size - 1) {
            Node buf = firstNode;
            for (int i = 0; i < index; i++) {
                buf = buf.nextNode;
            }
            return buf.value;
        } else {
            System.out.println("Пока без троу, но индекс неверный");
            return null;
        }
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
