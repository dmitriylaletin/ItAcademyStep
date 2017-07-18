package com.shag.serverSim.server.tcp;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

/**
 * Created by Dmitriy Laletin
 * on 15 Июль 2017
 * at 14:02
 */
public class Main {

    private final  static String DEFAULT_HOST = "127.0.0.1";
    private final  static int DEFAULT_PORT = 8888;

    private static final Logger LOGGER = Logger.getLogger(com.shag.serverSim.client.tcp.Main.class.getName());

    public static void main(String[] args) {

        ServerTCP serverTCP = new ServerTCPImpl();
        ServerSocket serverSocket = serverTCP.setServerSocket(DEFAULT_PORT);
        Socket clientSocket = serverTCP.setSocket(serverSocket);
        InputStream inputStream = serverTCP.setInputStream(clientSocket);
        serverTCP.listen(inputStream);

        System.out.println("Something");
    }
}
