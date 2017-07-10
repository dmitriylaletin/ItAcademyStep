package com.shag.connection;

public interface Connection {

    Boolean connect(String IPAddress, String port);

    Boolean disconnect();

    public String getIPAddress();

    public void setIPAddress(String IPAddress);

    public String getPort();

    public void setPort(String port);

}
