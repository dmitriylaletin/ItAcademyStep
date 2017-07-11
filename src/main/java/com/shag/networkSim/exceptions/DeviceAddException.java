package com.shag.networkSim.exceptions;

/**
 * Created by laletin on 10.07.17.
 */
public class DeviceAddException extends Exception {
    @Override
    public String toString() {
        return "Device network registration error: reached limit of devices that can be registered in this network";
    }
}
