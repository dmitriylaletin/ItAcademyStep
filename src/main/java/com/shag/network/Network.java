package com.shag.network;

import com.shag.connection.Connection;
import com.shag.device.Device;
import java.util.List;

public interface Network {

    void addDevice(Device device);

    public Connection getConnection();

    public void setConnection(Connection connection);

    Device getDevice(int index);

    boolean removeDevice(Device device);

    List<Device> getAllDevices();

    int getDevicesLimit();

    void setDevicesLimit(int devicesLimit);

    void clearNetwork();

    boolean pushData(Device device, String data);

    boolean getData(String data);

}
