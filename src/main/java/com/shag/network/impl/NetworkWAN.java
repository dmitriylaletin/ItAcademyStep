package com.shag.network.impl;

import com.shag.Exceptions.DeviceAddException;
import com.shag.Exceptions.DeviceLimitException;
import com.shag.connection.Connection;
import com.shag.device.Device;
import com.shag.network.Network;

import java.util.ArrayList;
import java.util.List;

public class NetworkWAN extends AbstractNetwork {


    public NetworkWAN(int devicesLimit) throws DeviceLimitException{
        if (devicesLimit < 1) throw new DeviceLimitException();
        setDevicesLimit(devicesLimit);
    }

    private String dataString;

    private int devicesLimit;

    private Connection connection;

    private List<Device> devices = new ArrayList<Device>();


    public int getDevicesLimit() {return devicesLimit;}

    public void setDevicesLimit(int devicesLimit) {this.devicesLimit = devicesLimit;}

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void addDevice(Device device) throws DeviceAddException {
        if (devices.size() >= devicesLimit) throw new DeviceAddException();
        devices.add(device);
    }

    public Device getDevice(int index) {
        return devices.get(index);
    }

    public List<Device> getAllDevices() {
        return null;
    }

    public boolean removeDevice(Device device) {
        return devices.remove(device);
    }


    public void clearNetwork() {
        devices.clear();
    }

    @Override
    public boolean pushData(Network network, String data) {
        return false;
    }

    @Override
    public boolean getData(Network network, String data) {
        return false;
    }
}
