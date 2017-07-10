package com.shag.network.impl;

import com.shag.Exceptions.DeviceAddException;
import com.shag.Exceptions.DeviceLimitException;
import com.shag.connection.Connection;
import com.shag.device.Device;
import com.shag.network.Network;

import java.util.ArrayList;
import java.util.List;

public class NetworkLAN implements Network {

    private Connection connection;

    private int devicesLimit;

    private List<Device> devices = new ArrayList<Device>();

    public NetworkLAN(int devicesLimit) throws DeviceLimitException {

        if (devicesLimit < 1) throw new DeviceLimitException();
        this.devicesLimit = devicesLimit;
    }

    public int getDevicesLimit() {return devicesLimit;}

    public void setDevicesLimit(int devicesLimit) {this.devicesLimit = devicesLimit;}

    public Connection getConnection() {return connection;}

    public void setConnection(Connection connection) {this.connection = connection;}

    public void addDevice(Device device) throws DeviceAddException{

        if (devices.size() + 1 > devicesLimit) throw new DeviceAddException();
        devices.add(device);
    }

    public Device getDevice(int index) {
        return devices.get(index);
    }

    public boolean removeDevice(Device device) {
        return devices.remove(device);
    }

    public List<Device> getAllDevices() {
        return devices;
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
