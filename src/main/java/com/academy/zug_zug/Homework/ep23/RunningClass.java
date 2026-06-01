package com.academy.zug_zug.Homework.ep23;

import com.academy.zug_zug.Homework.ep23.DoubleLinkedList.DoubleLinkedList;
import com.academy.zug_zug.Homework.ep23.SingleLinkedList.SingleLinkedList;

public class RunningClass {
    private static final int SOME_VALUE_FIRST = 5;
    private static final int SOME_VALUE_SECOND = 25;
    private static final int SOME_VALUE_THIRD = 35;

    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        System.out.println("___________SingleNode__________");
        singleLinkedList.add(SOME_VALUE_FIRST);
        singleLinkedList.add(SOME_VALUE_SECOND);
        singleLinkedList.add(0, SOME_VALUE_THIRD);
        System.out.println(singleLinkedList.get(0));
        System.out.println(singleLinkedList.size());
        System.out.println(singleLinkedList.remove());
        System.out.println(singleLinkedList.remove(0));
        System.out.println(singleLinkedList);
        System.out.println("_______________________________");
        System.out.println("___________DoubleNode__________");
        doubleLinkedList.add(SOME_VALUE_FIRST);
        doubleLinkedList.add(SOME_VALUE_SECOND);
        doubleLinkedList.add(1, SOME_VALUE_THIRD);
        System.out.println(doubleLinkedList.get(0));
        System.out.println(doubleLinkedList.size());
        System.out.println(doubleLinkedList);
        System.out.println("_______________________________");
    }

}

