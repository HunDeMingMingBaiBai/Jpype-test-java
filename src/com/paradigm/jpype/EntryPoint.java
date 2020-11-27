package com.paradigm.jpype;
import py4j.GatewayServer;

public class EntryPoint {

    private Test1 test;

    private Test2 test2;

    public EntryPoint() {
        test = new Test1();
    }

    public Test1 getTest() {
        return test;
    }

    public void setTest(Test1 test) {
        this.test = test;
    }

    public Test2 getTest2() {
        return test2;
    }

    public void setTest2(Test2 test2) {
        this.test2 = test2;
    }

    public static void main (String[] args) {
        GatewayServer gatewayServer = new GatewayServer(new EntryPoint());
        gatewayServer.start();
        System.out.println("Gateway Server Started");
    }

}
