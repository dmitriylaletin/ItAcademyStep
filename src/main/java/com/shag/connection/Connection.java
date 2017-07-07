package com.shag.connection;

public interface Connection {

    Boolean connect(String IPAddress, String port);

    Boolean disconnect();

}
