package com.shag.networkSim.network.impl;

import com.shag.networkSim.network.Network;

public class NetworkWAN extends AbstractNetwork implements Network {

    public NetworkWAN(String networkName, int devicesLimit) {
        super(networkName, devicesLimit);
    }
}
