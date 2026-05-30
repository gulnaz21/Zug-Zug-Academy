package com.academy.zug_zug.Homework.ep23;

import com.academy.zug_zug.Homework.ep23.DoubleLinkedList.DoubleLinkedList;
import com.academy.zug_zug.Homework.ep23.SingleLinkedList.SingleLinkedList;

public class RunningClass {
    private static final int someValueFirst = 5;
    private static final int someValueSecond = 25;
    private static final int someValueThird = 35;

    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        System.out.println("___________SingleNode__________");
        singleLinkedList.add(someValueFirst);
        singleLinkedList.add(someValueSecond);
        singleLinkedList.add(0, someValueThird);
        System.out.println(singleLinkedList.get(0));
        System.out.println(singleLinkedList.getSize());
        System.out.println("_______________________________");
        System.out.println("___________DoubleNode__________");
        doubleLinkedList.add(someValueFirst);
        doubleLinkedList.add(someValueSecond);
        doubleLinkedList.add(0, someValueThird);
        System.out.println(doubleLinkedList.get(0));
        System.out.println(doubleLinkedList.getSize());
        System.out.println("_______________________________");
    }

}

