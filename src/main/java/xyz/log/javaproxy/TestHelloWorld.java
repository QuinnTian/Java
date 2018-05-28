package xyz.log.javaproxy;




public class TestHelloWorld {
    public static void main(String[] args) {
        //实现对日志的重用
        LogProxy logProxy = new LogProxy();
        TimeBookInterface timeBookProxy = (TimeBookInterface) logProxy.bind(new TimeBook());
        timeBookProxy.doAuditing("张三");
    }
}
