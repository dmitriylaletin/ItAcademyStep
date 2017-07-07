package com.shag.connection.impl;

import com.shag.connection.Connection;

public class ConnectionImpl implements Connection {

    private String IPAddress;
    private String port;

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
