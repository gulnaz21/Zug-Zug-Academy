package com.academy.zug_zug.Homework.ep14;

public class IoTDevice {
    int id;
    String name;
    public IoTDevice(int id,String name){
        this.id = id;
        this.name = name;
    }
    public void performAction(){
        System.out.println("Something hapenning");
    }
}
