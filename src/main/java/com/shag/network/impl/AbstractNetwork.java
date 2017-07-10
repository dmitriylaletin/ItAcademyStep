package com.shag.network.impl;

import com.shag.network.Network;

/**
 * Created by laletin on 10.07.17.
 */

abstract class AbstractNetwork implements Network{

    private int devicesLimit;

    public int getDevicesLimit() {return devicesLimit;}

    public void setDevicesLimit(int devicesLimit) {this.devicesLimit = devicesLimit;}

}
