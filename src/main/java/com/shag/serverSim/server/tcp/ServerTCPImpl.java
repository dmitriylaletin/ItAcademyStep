package com.shag.serverSim.server.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Dmitriy Laletin
 * on 18 Июль 2017
 * at 19:24
 */
public class ServerTCPImpl implements ServerTCP {

   private final static Logger LOGGER = Logger.getLogger(ServerTCP.class.getName());

    @Override
    public ServerSocket setServerSocket(int port) {
        ServerSocket server = null;
        try {
            server = new ServerSocket(port);
            LOGGER.log(Level.INFO, "Server has been created on port" + port);
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "Server has not been created on port" + port);
            e.printStackTrace();
        }
        return server;
    }

    @Override
    public Socket setSocket(ServerSocket serverSocket) {
        Socket fromserver = null;
        try {
            serverSocket.accept();
            LOGGER.log(Level.INFO, "Client server socket has caught");
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "Client server socket has not been caught");
            e.printStackTrace();
        }
        return fromserver;
    }

    @Override
    public InputStream setInputStream(Socket socket) {
        InputStream in = null;
        try {
        in = socket.getInputStream();
        LOGGER.log(Level.INFO, "Input stream has been set");
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "Input stream has not been set");
           e.printStackTrace();
        }
        return in;
    }

    @Override
    public void listen(InputStream inputStream) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String ln = null;
        try {
           while ((ln = reader.readLine()) != null) {
              System.out.println(ln);
               System.out.flush();
            }
       } catch (IOException e) {
            LOGGER.log(Level.WARNING, "Error while message reading");
            System.exit(-1);
        }
    }
}
