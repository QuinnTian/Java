package xyz.log.impl;



public class TestHelloWorld {
    public static void main(String[] args) {
        TimeBookProxy timeBookProxy = new TimeBookProxy(new TimeBook());
        timeBookProxy.doAuditing("张三");
    }
}
