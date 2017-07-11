package com.shag.networkSim.connection;

public interface Connection {

    Boolean connect(String IPAddress, String port);

    Boolean disconnect();

    String getIPAddress();

    String getPort();
}
