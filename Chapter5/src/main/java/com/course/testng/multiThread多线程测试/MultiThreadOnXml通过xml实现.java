package com.course.testng.multiThread多线程测试;

import org.testng.annotations.Test;

public class MultiThreadOnXml通过xml实现 {
    @Test
    public void test1(){
        System.out.printf("Thread Id:%s%n",Thread.currentThread().getId());
    }
     @Test
    public void test2(){
        System.out.printf("Thread Id:%s%n",Thread.currentThread().getId());
    }
     @Test
    public void test3(){
        System.out.printf("Thread Id:%s%n",Thread.currentThread().getId());
    }

}
