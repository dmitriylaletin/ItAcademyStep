package com.shag.networkSim;

import com.shag.networkSim.connection.impl.ConnectionImpl;
import com.shag.networkSim.device.Device;
import com.shag.networkSim.device.impl.DeviceImpl;
import com.shag.networkSim.network.Network;
import com.shag.networkSim.network.NetworkFactoryMethod;

public class Main {

    public static void main(String [] args) {

        String data = "This is a test string that should be transferred as the data to another " +
                "selected device in one network";

        Network homeNetwork = NetworkFactoryMethod.getNetwork("LAN","homeNetwork", 2);

        Device macBook = new DeviceImpl("MacBook",
                new ConnectionImpl("255.255.255.1", "8088"), homeNetwork);
        Device iPhone = new DeviceImpl("iPhone",
                new ConnectionImpl("255.255.255.4", "8088"), homeNetwork);

        homeNetwork.getAllDevicesInfo();

        macBook.sendByHTTP(iPhone, data);
    }
}
