package org.example;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class NetworkIP {
    private static final String DEFAULT_GATEWAY = "Default Gateway";

    public static String getWifiIp() {
        if (Desktop.isDesktopSupported()) {
            try {
                Process process = Runtime.getRuntime().exec("netsh interface ipv4 show addresses \"Wi-Fi\"");

                try (BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(process.getInputStream()))) {

                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        if (line.trim().startsWith(DEFAULT_GATEWAY)) {
                            String ipAddress = line.substring(line.indexOf(":") + 1).trim();
                            return ipAddress;
                        }

                    }
                    return line;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
