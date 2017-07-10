package com.shag.network.impl;

import com.shag.Exceptions.DeviceAddException;
import com.shag.connection.Connection;
import com.shag.device.Device;
import com.shag.network.Network;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by laletin on 10.07.17.
 */

abstract class AbstractNetwork implements Network{

    private int devicesLimit;

    public int getDevicesLimit() {return devicesLimit;}

    public void setDevicesLimit(int devicesLimit) {this.devicesLimit = devicesLimit;}

}
