package com.academy.zug_zug.Homework.ep15;

import com.academy.zug_zug.Homework.ep15.TestClasses.LoginTest;
import com.academy.zug_zug.Homework.ep15.TestClasses.PaymentTest;
import com.academy.zug_zug.Homework.ep15.TestClasses.ProductSearchTest;
import com.academy.zug_zug.Homework.ep15.TestClasses.TestScenario;

public class MainClass {
    public static void main(String[] args) {
        LoginTest loginTest = new LoginTest();
        PaymentTest paymentTest = new PaymentTest();
        ProductSearchTest productSearchTest = new ProductSearchTest();

        TestScenario[] objects = new TestScenario[]{loginTest, paymentTest, productSearchTest};
        for (int i = 0; i <= objects.length - 1; i++)
            objects[i].runTest();
    }
}
