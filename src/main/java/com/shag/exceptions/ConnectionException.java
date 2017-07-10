package com.shag.exceptions;

/**
 * Created by laletin on 10.07.17.
 */
public class ConnectionException extends Exception {
    @Override
    public String toString() {
        return "Connection established error: IPAddress and/or port is not set";
    }
}
