package com.course.testng.multiThread多线程测试;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion通过注解实现多线程 {
    @Test(invocationCount =10,threadPoolSize = 5)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id:%s%n",Thread.currentThread().getId());
    }
}
