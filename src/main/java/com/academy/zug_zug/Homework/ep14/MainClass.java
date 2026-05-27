package com.academy.zug_zug.Homework.ep14;

import com.academy.zug_zug.Homework.ep14.SmartDevices.IoTDevice;
import com.academy.zug_zug.Homework.ep14.SmartDevices.SmartLight;
import com.academy.zug_zug.Homework.ep14.SmartDevices.SmartThermostat;

public class MainClass {
    private static final int IOT_DEVICE_ID = 5;
    private static final int SMART_LIGHT_ID = 6;
    private static final int SMART_THERMOSTAT_ID = 7;
    private static final int SMART_THERMOSTAT_TEMP = 67;
    private static final int TEMPERATURE_FOR_SET = 52;
    private static final String SOME_DEVICE = "someDevice";
    private static final String SMART_LIGHT = "smartLight";
    private static final String SMART_THERMOSTAT_NAME = "ThermostatSixSeven";

    public static void main(String[] args) {
        IoTDevice ioTDevice = new IoTDevice(IOT_DEVICE_ID, SOME_DEVICE);
        SmartLight smartLight = new SmartLight(SMART_LIGHT_ID, SMART_LIGHT, false);
        SmartThermostat smartThermostat = new SmartThermostat(SMART_THERMOSTAT_ID, SMART_THERMOSTAT_NAME, SMART_THERMOSTAT_TEMP);
        ioTDevice.performAction();
        smartLight.performAction();
        smartThermostat.performAction();
        smartThermostat.setTemperature(TEMPERATURE_FOR_SET);
        smartThermostat.performAction();
    }
}
