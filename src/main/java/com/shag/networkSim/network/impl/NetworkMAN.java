package com.shag.networkSim.network.impl;

import com.shag.networkSim.network.Network;

public class NetworkMAN extends AbstractNetwork implements Network{

    public NetworkMAN(String networkName, int devicesLimit) {
        super(networkName, devicesLimit);
    }
}
