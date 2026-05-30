package com.academy.zug_zug.Homework.ep23.SingleLinkedList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SingleLinkedList {
    private Node firstNode;
    private int size;

    public SingleLinkedList() {
        firstNode = null;
        size = 0;
    }

    public void add(Object value) {
        Node Node = new Node(value);
        Node.nextNode = null;
        if (size == 0) {
            firstNode = Node;
        } else {
            Node buf = firstNode;
            for (int i = 0; i < size; i++) {
                if (buf.nextNode != null)
                    buf = buf.nextNode;
            }
            buf.nextNode = Node;
        }
        size++;
    }

    public void add(int index, Object value) {
        if (index >= 0 && index <= size - 1) {
            Node node = new Node(value);
            Node buf = firstNode;
            for (int i = 0; i < index; i++) {
                if (buf.nextNode != null)
                    buf = buf.nextNode;
            }
            if (buf == firstNode) {
                node.nextNode = buf;
                firstNode = node;
            } else {
                node.nextNode = buf;
            }
            size++;
        } else {
            System.out.println("Пока без троу, но индекс неверный");
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
        Object value;

        public Node(Object value) {
            this.value = value;
        }
    }
}
