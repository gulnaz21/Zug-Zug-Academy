package com.academy.zug_zug.Homework.ep23.DoubleLinkedList;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.NoSuchElementException;

@Slf4j
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

    public Object add(int index, Object value) {
        // Проверка диапазона индекса
        try {
            if (index < 0 || index > size) {
                throw new InvalidInputException("Передаваемый индекс не входит в диапазон индексов листа");
            }
        } catch (InvalidInputException exception) {
            return exception.toString();
        }

        Node node = new Node(value);

        // Случай 1: список пуст
        if (size == 0) {
            firstNode = node;
            lastNode = node;
            node.nextNode = null;
            node.prevNode = null;
        }
        // Случай 2: добавление в начало
        else if (index == 0) {
            node.nextNode = firstNode;
            node.prevNode = null;
            firstNode.prevNode = node;
            firstNode = node;
        }
        // Случай 3: добавление в конец
        else if (index == size) {
            node.prevNode = lastNode;
            node.nextNode = null;
            lastNode.nextNode = node;
            lastNode = node;
        }
        // Случай 4: добавление в середину
        else {
            Node current;

            // Оптимизация: идем с начала или с конца
            if (index < size / 2) {
                current = firstNode;
                for (int i = 0; i < index; i++) {
                    current = current.nextNode;
                }
            } else {
                current = lastNode;
                for (int i = size - 1; i > index; i--) {
                    current = current.prevNode;
                }
            }

            Node prevNode = current.prevNode;

            node.nextNode = current;
            node.prevNode = prevNode;
            prevNode.nextNode = node;
            current.prevNode = node;
        }

        size++;
        return value;
    }

    public Object get(int index) {
        try {
            if (index >= 0 && index <= size - 1) {
                Node buf;
                if (size / 2 >= index) {
                    buf = firstNode;
                    for (int i = 0; i < index; i++) {
                        buf = buf.nextNode;
                    }
                } else {
                    buf = lastNode;
                    for (int i = size - 1; i > index; i--) {
                        buf = buf.prevNode;
                    }
                }
                return buf.value;
            } else {
                throw new NoSuchElementException("Nechego vidat tebe brat");
                // log. не работает хз( повесли же аннотацию)
            }
        } catch (NoSuchElementException e) {
            return e.toString();
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

    @Setter
    @Getter
    private static class Node {
        private Node nextNode;
        private Node prevNode;
        private Object value;

        public Node(Object value) {
            this.value = value;
        }
    }
}
