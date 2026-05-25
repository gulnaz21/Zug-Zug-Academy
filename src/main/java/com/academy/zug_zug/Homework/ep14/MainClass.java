package com.academy.zug_zug.Homework.ep14;

import com.academy.zug_zug.Homework.ep14.SmartDevices.IoTDevice;
import com.academy.zug_zug.Homework.ep14.SmartDevices.SmartLight;
import com.academy.zug_zug.Homework.ep14.SmartDevices.SmartThermostat;

public class MainClass {
    private static final int ioTDeviceId = 5;
    private static final int smartLightId = 6;
    private static final int smartThermostatId = 7;
    private static final int smartThermostatTemp = 67;
    private static final int temperatureForSet = 52;
    private static final String iotDeviceName = "someDevice";
    private static final String smartLightName = "smartLight";
    private static final String smartThermostatName = "ThermostatSixSeven";

    public static void main(String[] args) {
        IoTDevice ioTDevice = new IoTDevice(ioTDeviceId, iotDeviceName);
        SmartLight smartLight = new SmartLight(smartLightId, smartLightName, false);
        SmartThermostat smartThermostat = new SmartThermostat(smartThermostatId, smartThermostatName, smartThermostatTemp);
        ioTDevice.performAction();
        smartLight.performAction();
        smartThermostat.performAction();
        smartThermostat.setTemperature(temperatureForSet);
        smartThermostat.performAction();
    }
}
