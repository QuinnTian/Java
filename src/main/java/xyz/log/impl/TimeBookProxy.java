package xyz.log.impl;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * Java代理类
 * 用来实现日志输出
 */
public class TimeBookProxy {
    private Logger logger = Logger.getLogger(this.getClass().getName());

    private TimeBookInterface timeBookInterface;
    //在该类中针对前面的接口编程，而不针对具体的类
    public TimeBookProxy(TimeBookInterface timeBookInterface){
        this.timeBookInterface = timeBookInterface;
    }
    //实际业务的处理
    public  void  doAuditing(String name){
        logger.log(Level.INFO,name+"开始审核数据");
        timeBookInterface.doAuditing(name);
        logger.log(Level.INFO,name+"审核数据结束");
    }

}
