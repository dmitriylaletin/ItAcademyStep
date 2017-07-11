package com.shag.networkSim.connection.impl;

import com.shag.networkSim.exceptions.ConnectionException;
import com.shag.networkSim.connection.Connection;

public class ConnectionImpl implements Connection {

    private String port;
    private String IPAddress;

    public ConnectionImpl(String IPAddress, String port) {

        try {
            if ((IPAddress == null) || (port == null)) {throw new ConnectionException();}
            connect(IPAddress, port);
        } catch (ConnectionException e){
            System.out.println(e.toString());
            System.exit(0);}
    }

    public String getIPAddress() {
        return IPAddress;
    }

    public String getPort() { return port; }

    public Boolean connect(String IPAddress, String port) {

        if  ((IPAddress == null) || (port == null)) return false;
        this.IPAddress = IPAddress;
        this.port = port;
        return true;
    }

    public Boolean disconnect() {
        this.IPAddress = null;
        this.port = null;
        return true;
    }
}
