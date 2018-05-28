package xyz.log.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.log.aop.impl.FinanceInterface;
import xyz.log.aop.impl.TimeBookInterface;

public class TestHelloWorld {
    public static void main(String[] args) {
        //通过application context 获取XML
        ApplicationContext actx = new ClassPathXmlApplicationContext("classpath:SpringConfig.xml");
        TimeBookInterface timeBookProxy = (TimeBookInterface) actx.getBean("logProxy");
        FinanceInterface financeProxy = (FinanceInterface) actx.getBean("logProxy1");
        timeBookProxy.doAuditing("张三");
        financeProxy.doCheck("李四");
    }
}
