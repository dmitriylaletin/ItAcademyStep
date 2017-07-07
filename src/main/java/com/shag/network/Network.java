package com.shag.network;

import com.shag.device.Device;

import java.util.List;

public interface Network {

    void addDevice(Device device);

    Device getDevice(int index);

    boolean removeDevice(Device device);

    List<Device> getAllDevices();

    void clearNetwork();

    boolean pushData();

    boolean getData();

}
