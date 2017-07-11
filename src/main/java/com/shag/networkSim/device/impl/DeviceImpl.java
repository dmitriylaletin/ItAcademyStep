package com.shag.networkSim.device.impl;

import com.shag.networkSim.connection.Connection;
import com.shag.networkSim.device.Device;
import com.shag.networkSim.network.Network;

public class DeviceImpl extends AbstractDevice implements Device {

    public DeviceImpl(String name, Connection connection, Network network) {
        super.setName(name);
        super.setConnection(connection);
        super.setNetwork(network);
        network.addDevice(this);
    }

    public void sendByHTTP (Device reciever,  String data){
        System.out.println("Device " + this.getName() + " with IP: " + this.getConnection().getIPAddress()+
                " established connection to " + reciever.getName() +
                " with IP: " + reciever.getConnection().getIPAddress() + " successful \n ");
        this.request(reciever, data);
        String send = (request(reciever, data)) ? " bytes) have been sent " : "bytes) have not been sent";
        System.out.print("Data (volume " + data.length() + send);
        this.response(reciever, data);
        String recieved = (response(reciever, data)) ? "and have been recieved by " + reciever.getName() + " successful"
                : " and have not been recieved by" + reciever.getName();
        System.out.print(recieved);
    }

    public boolean request(Device device, String dataString) {
        return getNetwork().pushData(device, dataString);
    }

    public boolean response(Device device, String dataString) {
        return getNetwork().getData(device, dataString);
    }

    @Override
    public String toString() {
        return  "Device Name: " +
                super.getName() + "\n" +
                "Connection: " +
                super.getConnection().getPort() + " : " + super.getConnection().getIPAddress() + "\n" +
                "Registered in " + super.getNetwork().getClass().getSimpleName() +
                ": " + super.getNetwork().getNetworkName() + "\n";
    }
}
