package com.shag.device.impl;

import com.shag.connection.Connection;
import com.shag.device.Device;
import com.shag.network.Network;

public class DeviceImpl extends AbstractDevice implements Device {

    public DeviceImpl(Connection connection, Network network) {
        super.setConnection(connection);
        super.setNetwork(network);
    }

    public boolean request() {
        return false;
    }

    public boolean response() {
        return false;
    }

    @Override
    public String toString() {
        return "Connection: \n" +
                super.getConnection() + "\n" +
                "Network: \n" +
                super.getNetwork();
    }

}
