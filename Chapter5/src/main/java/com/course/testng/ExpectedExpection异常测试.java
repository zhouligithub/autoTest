package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedExpection异常测试 {
    /**
     *什么时候会用到异常测试
     *在我们期望结果为某一个异常的时候
     *比如：我们传入了某些不合法的参数，程序抛除了异常
     *也就是说我的预期结果就是这个异常
     */
    //这是一个测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExpectionFailed(){
        System.out.println("这是一个失败的异常测试");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExpectionSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }



}
