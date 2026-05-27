package com.academy.zug_zug.Homework.ep14.SmartDevices;

public class SmartThermostat extends IoTDevice {
    private int temp;

    public SmartThermostat(int id, String name, int temp) {
        super(id, name);
        this.temp = temp;
    }

    public void setTemperature(int tempUp) {
        this.temp = tempUp;
    }

    @Override
    public void performAction() {
        System.out.println("Установленная температура:" + temp);
    }
}
