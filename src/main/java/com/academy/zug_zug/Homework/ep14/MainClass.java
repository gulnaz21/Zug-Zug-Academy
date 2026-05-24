package com.academy.zug_zug.Homework.ep14;

public class MainClass {
    public static void main(String [] args){
        IoTDevice ioTDevice = new IoTDevice(5, "someDevice");
        SmartLight smartLight = new SmartLight(6,"smartLight", false);
        SmartThermostat smartThermostat = new SmartThermostat(7,"ThermostatSixSeveen",67);
        ioTDevice.performAction();
        smartLight.performAction();
        smartThermostat.performAction();
        smartThermostat.setTemperature(52);
        smartThermostat.performAction();
    }
}
