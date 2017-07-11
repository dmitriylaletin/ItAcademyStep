package com.shag.networkSim.network.impl;

import com.shag.networkSim.device.Device;
import com.shag.networkSim.network.Network;

public class NetworkLAN extends AbstractNetwork implements Network {

    public NetworkLAN(String networkName, int devicesLimit) {
       super(networkName, devicesLimit);
    }

    @Override
    public boolean pushData(Device device, String data) {
        boolean isSuccessed = false;
        if ((getAllDevices().contains(device)) && (data != null)) {
            isSuccessed = true;
            setConnection(device.getConnection());
            device.setData(data);
        }
        return isSuccessed;
    }

    @Override
    public boolean getData(Device device, String data) {
        boolean isSuccessed = false;
        if ((device.getData().equals(data) && (getConnection().equals(device.getConnection())))) {
            isSuccessed = true;
        }
        return isSuccessed;
    }
}