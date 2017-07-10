package com.shag.network;

import com.shag.Exceptions.DeviceAddException;
import com.shag.device.Device;
import java.util.List;

public interface Network {


    void addDevice(Device device) throws DeviceAddException;

    Device getDevice(int index);

    boolean removeDevice(Device device);

    List<Device> getAllDevices();

    int getDevicesLimit();

    void setDevicesLimit(int devicesLimit);

    void clearNetwork();

    boolean pushData(Network network, String data);

    boolean getData(String data);

}
