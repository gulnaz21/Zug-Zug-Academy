package com.academy.zug_zug.Homework.ep14.SmartDevices;

public class SmartLight extends IoTDevice {
    private boolean lampStatus;

    public SmartLight(int id, String name, boolean lampStatus) {
        super(id, name);
        this.lampStatus = lampStatus;
    }

    @Override
    public void performAction() {
        String string = (lampStatus) ? "Лампа включена" : "Лампа выключена";
    }
}
