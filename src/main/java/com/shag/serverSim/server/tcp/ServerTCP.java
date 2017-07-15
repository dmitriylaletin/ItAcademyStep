package com.shag.serverSim.server.tcp;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Dmitriy Laletin
 * on 15 Июль 2017
 * at 14:01
 */
public interface ServerTCP {

    ServerSocket setServerSocket(int port);

    Socket setSocket(ServerSocket serverSocket);

    InputStream setInputStream(Socket socket);

    void listen(InputStream inputStream);
}
