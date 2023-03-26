package org.example;

import com.github.monkeywie.proxyee.proxy.ProxyConfig;
import com.github.monkeywie.proxyee.proxy.ProxyType;

public class ProxyDynamicHost extends ProxyConfig {
    @Override
    public String getHost() {
        return NetworkIP.getWifiIp();
    }

    @Override
    public ProxyType getProxyType() {
        return ProxyType.HTTP;
    }

    @Override
    public int getPort() {
        return 8282;
    }
}
