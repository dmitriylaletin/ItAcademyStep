package com.shag.network.impl;

import com.shag.device.Device;
import com.shag.network.Network;

import java.util.ArrayList;
import java.util.List;

public class NetworkLAN implements Network {

    private List<Device> devices = new ArrayList<Device>();

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
