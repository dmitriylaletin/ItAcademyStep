package com.shag.serverSim.client.tcp;

import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Dmitriy Laletin
 * on 15 Июль 2017
 * at 13:59
 */
public interface ClientTCP {

    Socket setSocket(String host, int port);

    OutputStream setOutputStream(Socket socket);

    void send(OutputStream outputStream);
}
