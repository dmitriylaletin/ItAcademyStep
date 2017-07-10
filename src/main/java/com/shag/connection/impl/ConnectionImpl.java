package com.shag.connection.impl;

import com.shag.exceptions.ConnectionException;
import com.shag.connection.Connection;

public class ConnectionImpl implements Connection {

    private String port;
    private String IPAddress;

    public ConnectionImpl(String port, String IPAddress) {

        try {
            if ((IPAddress == null) || (port == null)) {throw new ConnectionException();}
            this.IPAddress = IPAddress;
            this.port = port;
        } catch (ConnectionException e){System.out.println(e.toString());}
    }

    public String getIPAddress() {
        return IPAddress;
    }

    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    public String getPort() { return port; }

    public void setPort(String port) { this.port = port; }

    public Boolean connect(String IPAddress, String port) {

        if ((this.IPAddress.equals(IPAddress))&&(this.port.equals(port))) return true;
        else return false;
    }

    public Boolean disconnect() {
        return null;
    }
}
