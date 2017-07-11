package com.shag.networkSim.network.impl;

import com.shag.networkSim.connection.Connection;
import com.shag.networkSim.device.Device;
import com.shag.networkSim.exceptions.DeviceAddException;
import com.shag.networkSim.exceptions.DeviceLimitException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by laletin on 10.07.17.
 */

abstract class AbstractNetwork {

    private String networkName;

    private int devicesLimit;

    private Connection connection;

    private List<Device> devices = new ArrayList<Device>();

    public AbstractNetwork() {}

    public AbstractNetwork (String networkName, int devicesLimit) {
        try {
            if (devicesLimit < 1) throw new DeviceLimitException();
            setNetworkName(networkName);
            setDevicesLimit(devicesLimit);
        } catch (DeviceLimitException e) {
            System.out.println(e.toString());
            System.exit(0);
        }
    }

    public String getNetworkName() { return networkName; }

    public void setNetworkName(String networkName) { this.networkName = networkName; }

    public int getDevicesLimit() { return devicesLimit; }

    public void setDevicesLimit(int devicesLimit) { this.devicesLimit = devicesLimit; }

    public Connection getConnection() {return connection;}

    public void setConnection(Connection connection) {
        this.connection = connection;
    }


    public void addDevice(Device device) {
        try {
            if (devices.size() >= getDevicesLimit()) throw new DeviceAddException();
            devices.add(device);
        } catch (DeviceAddException e){
            System.out.println(e.toString());
            System.exit(0);}
    }

    public Device getDevice(int index) { return devices.get(index - 1); }

    public boolean removeDevice(Device device) {
        return devices.remove(device);
    }

    public List<Device> getAllDevices() { return devices; }

    public void getAllDevicesInfo() {
        System.out.println("Network " + this.getClass().getSimpleName() + " has " + devices.size() + " registered devices: \n");
        for (Device device : getAllDevices()) {
            System.out.println(device.toString() + "\n");
        }
    }

    public void clearNetwork() { devices.clear(); }
}
