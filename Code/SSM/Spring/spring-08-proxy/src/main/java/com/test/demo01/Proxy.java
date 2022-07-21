package com.test.demo01;

public class Proxy {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host){
        this.host = host;
    }

    public void rent(){
        host.rent();
    }

}
