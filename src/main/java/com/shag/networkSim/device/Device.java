package com.shag.networkSim.device;

import com.shag.networkSim.connection.Connection;

public interface Device {

    void sendByHTTP (Device reciever,  String data);

    boolean request(Device device, String dataString);

    boolean response(Device device, String dataString);

    String getName();

    String getData();

    void setData(String data);

    Connection getConnection();

}
