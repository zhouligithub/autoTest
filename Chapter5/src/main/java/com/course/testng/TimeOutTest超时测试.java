package com.course.testng;

import org.testng.annotations.Test;

public class TimeOutTest超时测试 {
    @Test(timeOut = 3000)//单位为毫秒值
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }
    @Test(timeOut = 3000)//单位为毫秒值
    public void testFailed() throws InterruptedException {
        Thread.sleep(4000);
    }
}
