package com.shag.Exceptions;

/**
 * Created by laletin on 10.07.17.
 */
public class DeviceLimitException extends Exception {
    @Override
    public String toString() {
        return "Amount of devices can not be lower than 1";
    }
}
