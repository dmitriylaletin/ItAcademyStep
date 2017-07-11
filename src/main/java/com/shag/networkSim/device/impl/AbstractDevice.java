package com.shag.networkSim.device.impl;

import com.shag.networkSim.connection.Connection;
import com.shag.networkSim.network.Network;

abstract class AbstractDevice {

    private String name;
    private String data;
    private Connection connection;
    private Network network;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getData() { return data; }

    public void setData(String data) { this.data = data; }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

}
