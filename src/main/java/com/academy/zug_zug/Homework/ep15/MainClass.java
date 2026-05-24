package com.academy.zug_zug.Homework.ep15;

interface TestScenario {
    void runTest();
}

public class MainClass {
    public static void main(String[] args) {
        TestScenario[] objects = new TestScenario[]{new LoginTest(), new PaymentTest(), new ProductSearchTest()};
        for (int i = 0; i <= objects.length - 1; i++)
            objects[i].runTest();
    }
}
