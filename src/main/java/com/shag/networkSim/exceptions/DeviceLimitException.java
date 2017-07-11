package com.shag.networkSim.exceptions;

/**
 * Created by laletin on 10.07.17.
 */
public class DeviceLimitException extends Exception {
    @Override
    public String toString() {
        return "Device limit error: Amount of devices can not be lower than 1";
    }
}
