package com.shag.serverSim.client.tcp;

import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/**
 * Created by Dmitriy Laletin
 * on 15 Июль 2017
 * at 14:00
 */
public class Main {

    private final  static String DEFAULT_HOST = "127.0.0.1";
    private final  static int DEFAULT_PORT = 8888;

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        ClientTCP clientTCP = new ClientTCPImpl();
        Socket socket = clientTCP.setSocket(DEFAULT_HOST, DEFAULT_PORT);
        OutputStream outputStream = clientTCP.setOutputStream(socket);
        clientTCP.send(outputStream);
    }

    }

