package com.shag.device.impl;

import com.shag.connection.Connection;
import com.shag.device.Device;
import com.shag.network.Network;

public class DeviceImpl extends AbstractDevice implements Device {

    public DeviceImpl(String name, Connection connection, Network network) {
        super.setName(name);
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
        return  "Device Name: " +
                super.getName() + "\n" +
                "Connection: " +
                super.getConnection().getPort() + " : " + super.getConnection().getIPAddress() + "\n" +
                "Network: " +
                super.getNetwork().getClass().getSimpleName() + "\n";
    }

}
