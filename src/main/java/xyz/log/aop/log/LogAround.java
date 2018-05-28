package xyz.log.aop.log;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * interceptor around通知会在joint point 前后运行
 */
public class LogAround implements MethodInterceptor {
    private Logger logger = Logger.getLogger(this.getClass().getName());

    /**
     * 负责输出日志的代码
     * @param methodInvocation 可以获得方法名称、程序传入的参数Object[]
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
            logger.log(Level.INFO, methodInvocation.getArguments()[0] + "开始审核数据");
        try {
            //.proceed()可以执行被调用的方法
            Object result = methodInvocation.proceed();
            //返回值是被调用方法的返回值
            return result;

        } finally {
            logger.log(Level.INFO, methodInvocation.getArguments()[0] + "审核数据结束");
        }


    }
}
