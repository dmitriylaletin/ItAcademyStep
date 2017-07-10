package com.shag.connection.impl;

import com.shag.Exceptions.ConnectionException;
import com.shag.connection.Connection;

public class ConnectionImpl implements Connection {

    private String IPAddress;
    private String port;

    public ConnectionImpl(String IPAddress, String port) throws ConnectionException {

        if ((IPAddress == null)||(port == null)) {
            throw new ConnectionException();
        }

        this.IPAddress = IPAddress;
        this.port = port;
    }

    public String getIPAddress() {
        return IPAddress;
    }

    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Boolean connect(String IPAddress, String port) {
        return null;
    }

    public Boolean disconnect() {
        return null;
    }

}
