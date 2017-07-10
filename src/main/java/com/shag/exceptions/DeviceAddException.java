package com.shag.exceptions;

/**
 * Created by laletin on 10.07.17.
 */
public class DeviceAddException extends Exception {
    @Override
    public String toString() {
        return "Device adding error: reached limit of devices";
    }
}
