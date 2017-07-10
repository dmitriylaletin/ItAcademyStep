package com.shag.network;

import com.shag.Exceptions.DeviceAddException;
import com.shag.Exceptions.DeviceLimitException;
import com.shag.network.impl.NetworkLAN;
import com.shag.network.impl.NetworkMAN;
import com.shag.network.impl.NetworkWAN;

public final class NetworkFactoryMethod {

    public final static Network getNetwork(String type, int devicesLimit) throws DeviceAddException, DeviceLimitException{
        if (ConnectionType.LAN.getType().equals(type)) {
            return new NetworkLAN(devicesLimit);
        } else if (ConnectionType.MAN.getType().equals(type)) {
            return new NetworkMAN(devicesLimit);
        } else if (ConnectionType.WAN.getType().equals(type)) {
            return new NetworkWAN(devicesLimit);
        }
        return null;
    }

}
