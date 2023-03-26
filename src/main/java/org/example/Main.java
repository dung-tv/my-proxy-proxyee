package org.example;

import com.github.monkeywie.proxyee.proxy.ProxyConfig;
import com.github.monkeywie.proxyee.proxy.ProxyType;
import com.github.monkeywie.proxyee.server.HttpProxyServer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Proxy listen: 0.0.0.0:9999");
        new HttpProxyServer()
                .proxyConfig(new ProxyDynamicHost())
                .start(9999);
    }
}