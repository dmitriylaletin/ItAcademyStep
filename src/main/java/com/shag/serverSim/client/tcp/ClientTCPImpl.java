package com.shag.serverSim.client.tcp;

import com.shag.serverSim.server.tcp.ServerTCP;

import java.io.*;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Dmitriy Laletin
 * on 18 Июль 2017
 * at 19:30
 */
public class ClientTCPImpl implements ClientTCP {

    private final static Logger LOGGER = Logger.getLogger(ServerTCP.class.getName());

    @Override
    public Socket setSocket(String host, int port) {
        Socket socket = null;
        try {
            socket = new Socket(host, port);
            LOGGER.log(Level.INFO, "Socket has been created on host " + host + " on port " + port);
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "Socket has not been created on host " + host + " on port " + port);
            e.printStackTrace();
        }
        return socket;
    }

    @Override
    public OutputStream setOutputStream(Socket socket) {
        OutputStream out = null;
        try {
            out = socket.getOutputStream();
            LOGGER.log(Level.INFO, "OutStream stream has been set");
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "OutputStream stream has not been set");
            e.printStackTrace();
        }
        return out;
    }

    @Override
    public void send(OutputStream outputStream) {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
         String clientData = null;
        try {
            while ((clientData = reader.readLine()) != null) {
                if (clientData.equalsIgnoreCase("exit")) {
                    System.out.println("Do you want to stop stream ? Y/N");
                    if ((reader.readLine()).equals("Y")) break;
                    else continue;
                }
                writer.write(clientData + "\n");
                writer.flush();
          }
       } catch (IOException e) {
            LOGGER.log(Level.WARNING, "Error while message recording");
           System.exit(-1);
      }
    }
}

