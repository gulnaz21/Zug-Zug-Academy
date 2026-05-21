package com.academy.zug_zug.Homework.ep14;

public class SmartThermostat extends IoTDevice{
    int temp;
    public SmartThermostat(int id, String name,int temp) {
        super(id, name);
        this.temp = temp;
    }
    void setTemperature(int tempUp){
        this.temp = tempUp;
    }

    @Override
    public void performAction() {
        System.out.println("Установленная температура:" + this.temp);
    }
}
