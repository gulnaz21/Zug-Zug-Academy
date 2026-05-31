package com.academy.zug_zug.Homework.ep23.SingleLinkedList;

import lombok.Getter;

import java.util.NoSuchElementException;

public class SingleLinkedList {
    private Node firstNode;
    private int size;

    public SingleLinkedList() {
        firstNode = null;
        size = 0;
    }

    public void add(Object value) {
        Node Node = new Node(value);
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

    public String remove(int index) {
        try {
            if (size == 0 || index > size - 1 || index < 0) {
                throw new NoSuchElementException("Нету элементов, что ты планируешь удалить то? Дядь");
            }
        } catch (NoSuchElementException exception) {
            return exception.toString();
        }
        try {
            if (index == 0 && size == 1) {
                this.remove();
            } else if (index == 0 && size > 1) {
                int s = (Integer) firstNode.value;
                firstNode = firstNode.nextNode;
                size--;
                return String.valueOf(s);
            } else {
                int s;
                Node node = firstNode;
                Node prevNode = null;

                for (int i = 0; i < index; i++) {
                    prevNode = node;
                    node = node.nextNode;
                }
                s = (Integer) node.value;
                assert prevNode != null;
                prevNode.nextNode = node.nextNode;
                node = null;
                size--;
                return String.valueOf(s);
            }
        } catch (IndexOutOfBoundsException exception) {
            return "Error brat";
        }
        return "";
    }

    public String remove() {
        try {
            if (size == 0) {
                throw new NoSuchElementException("Нету элементов, что ты планируешь удалить то? Дядь");
            }
        } catch (NoSuchElementException exception) {
            return "";
        }
        if (size == 1) {
            Node buf = firstNode;
            int s = (Integer) firstNode.value;
            firstNode = null;
            buf = null;
            size--;
            return String.valueOf(s);
        } else {
            Node buf = firstNode.nextNode;
            int s = (Integer) firstNode.value;
            firstNode = buf;
            size--;
            return String.valueOf(s);
        }
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

    public int size() {
        return size;
    }

    private static class Node {
        @Getter
        Node nextNode;
        Object value;

        public Node(Object value) {
            this.value = value;
            nextNode = null;
        }
    }
}
