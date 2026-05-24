package com.academy.zug_zug.Homework.ep14;

public class SmartLight extends IoTDevice{
    boolean lampStatus;
    public SmartLight(int id, String name, boolean lampStatus) {
        super(id, name);
        this.lampStatus = lampStatus;
    }

    @Override
    public void performAction() {
        if(lampStatus){
            System.out.println("Лампа включена");
        }
        else
            System.out.println("Лампа выключена");
    }
}
