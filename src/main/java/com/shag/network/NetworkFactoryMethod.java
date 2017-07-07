package com.shag.network;

import com.shag.network.impl.NetworkLAN;
import com.shag.network.impl.NetworkMAN;
import com.shag.network.impl.NetworkWAN;

public final class NetworkFactoryMethod {

    public final static Network getNetwork(String type) {
        if (ConnectionType.LAN.getType().equals(type)) {
            return new NetworkLAN();
        } else if (ConnectionType.MAN.getType().equals(type)) {
            return new NetworkMAN();
        } else if (ConnectionType.WAN.getType().equals(type)) {
            return new NetworkWAN();
        }
        return null;
    }

}
