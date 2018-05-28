package xyz.log.aop.action;

import xyz.log.aop.impl.TimeBookInterface;

public class TimeBook implements TimeBookInterface {
    @Override
    public void doAuditing(String name) {
        //审核数据相关代码
    }
}
