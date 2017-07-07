package com.shag.device.impl;

import com.shag.connection.Connection;
import com.shag.network.Network;

abstract class AbstractDevice {

    private Connection connection;
    private Network network;

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
