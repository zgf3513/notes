package com.test.demo04;

import com.test.demo02.Host;
import com.test.demo02.Rent;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        ProxyInvocationHandler pih = new ProxyInvocationHandler(); // 设置要代理的对象
        pih.setObj(host);
        // 动态生成代理类
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();

    }
}
