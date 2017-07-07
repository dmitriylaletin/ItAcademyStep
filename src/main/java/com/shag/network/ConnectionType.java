package com.shag.network;

public enum ConnectionType {

    LAN("LAN", 1),
    MAN("MAN", 2),
    WAN("WAN", 3);

    private String connectionType;
    private int numericConnectionType;

    ConnectionType(String connectionType, int numericConnectionType) {
        this.connectionType = connectionType;
        this.numericConnectionType = numericConnectionType;
    }

    public String getType() {
        return this.connectionType;
    }

    public int getNumericType() {
        return this.numericConnectionType;
    }

}
