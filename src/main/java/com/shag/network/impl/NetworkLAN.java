package com.shag.network.impl;

import com.shag.connection.Connection;
import com.shag.exceptions.DeviceAddException;
import com.shag.exceptions.DeviceLimitException;
import com.shag.device.Device;
import com.shag.network.Network;
import java.util.ArrayList;
import java.util.List;

public class NetworkLAN extends AbstractNetwork implements Network {

    private Connection connection;

    private List<Device> devices = new ArrayList<Device>();

    public NetworkLAN(int devicesLimit) {
        try {
        if (devicesLimit < 1) throw new DeviceLimitException();
            setDevicesLimit(devicesLimit);
        } catch (DeviceLimitException e){System.out.println(e.toString());}
    }
    public Connection getConnection() {return this.connection;}

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void addDevice(Device device) {
        try {
            if (this.devices.size() >= getDevicesLimit()) throw new DeviceAddException();
            this.devices.add(device);
        } catch (DeviceAddException e){System.out.println(e.toString());}
    }

    public Device getDevice(int index) {return devices.get(index - 1);}

    public boolean removeDevice(Device device) {
        return devices.remove(device);
    }

    public List<Device> getAllDevices() {return devices;}

    public void clearNetwork() {devices.clear();}

    @Override
    public boolean pushData(Device device, String data) {
            return true;
    }

    @Override
    public boolean getData(String data) {
        return false;
    }
}