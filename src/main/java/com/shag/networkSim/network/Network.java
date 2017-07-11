package com.shag.networkSim.network;

import com.shag.networkSim.device.Device;

public interface Network {

    void addDevice(Device device);

    String getNetworkName();

    void getAllDevicesInfo();

    default boolean pushData (Device device, String data) {
        return false;
    }

    default boolean getData(Device device, String data) {
        return false;
    }

}
