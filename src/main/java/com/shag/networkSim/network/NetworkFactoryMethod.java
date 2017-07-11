package com.shag.networkSim.network;

import com.shag.networkSim.network.impl.NetworkLAN;
import com.shag.networkSim.network.impl.NetworkMAN;
import com.shag.networkSim.network.impl.NetworkWAN;

public final class NetworkFactoryMethod {

    public final static Network getNetwork(String type, String name, int devicesLimit) {
        if (ConnectionType.LAN.getType().equals(type)) {
            return new NetworkLAN(name, devicesLimit);
        } else if (ConnectionType.MAN.getType().equals(type)) {
            return new NetworkMAN(name, devicesLimit);
        } else if (ConnectionType.WAN.getType().equals(type)) {
            return new NetworkWAN(name, devicesLimit);
        }
        return null;
    }
}
