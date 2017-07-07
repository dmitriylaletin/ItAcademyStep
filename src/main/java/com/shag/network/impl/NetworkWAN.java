package com.shag.network.impl;

import com.shag.connection.Connection;
import com.shag.device.Device;
import com.shag.network.Network;

import java.util.ArrayList;
import java.util.List;

public class NetworkWAN implements Network {

    private Connection connection;
    private List<Device> devices = new ArrayList<Device>();

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public Device getDevice(int index) {
        return devices.get(index);
    }

    public boolean removeDevice(Device device) {
        return devices.remove(device);
    }

    public List<Device> getAllDevices() {
        return null;
    }

    public void clearNetwork() {
        devices.clear();
    }

    public boolean pushData() {
        return false;
    }

    public boolean getData() {
        return false;
    }

}
