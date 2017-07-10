package com.shag;

import com.shag.connection.Connection;
import com.shag.connection.impl.ConnectionImpl;
import com.shag.device.Device;
import com.shag.device.impl.DeviceImpl;
import com.shag.network.Network;
import com.shag.network.NetworkFactoryMethod;

public class Main {

    public static void main(String [] args) {

        Network network = NetworkFactoryMethod.getNetwork("LAN", 5);

        Connection connection1 = new ConnectionImpl("8080","255.255.255.1");
        Connection connection2 = new ConnectionImpl("8080","255.255.255.2");
        Connection connection3 = new ConnectionImpl("8080","255.255.255.3");
        Connection connection4 = new ConnectionImpl("8080","255.255.255.4");
        Connection connection5 = new ConnectionImpl("8080","255.255.255.5");

        Device device1 = new DeviceImpl("Macbook", connection1, network);
        Device device2 = new DeviceImpl("PC", connection2, network);
        Device device3 = new DeviceImpl("iPad", connection3, network);
        Device device4 = new DeviceImpl("iPhone", connection4, network);
        Device device5 = new DeviceImpl("SmartTV", connection5, network);

        network.addDevice(device1);
        network.addDevice(device2);
        network.addDevice(device3);
        network.addDevice(device4);
        network.addDevice(device5);

        System.out.println(network.getDevice(3).toString());
        System.out.println(network.getDevice(1).toString());
        System.out.println(network.getDevice(5).toString());

    }
}
