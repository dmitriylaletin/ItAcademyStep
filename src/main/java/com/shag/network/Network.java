package com.shag.network;

import com.shag.Exceptions.DeviceAddException;
import com.shag.device.Device;

import java.util.List;

public interface Network {


    void addDevice(Device device) throws DeviceAddException;

    Device getDevice(int index);

    boolean removeDevice(Device device);

    List<Device> getAllDevices();

    void clearNetwork();

    boolean pushData();

    boolean getData();

}
