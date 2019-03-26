package com.course.testng;

import org.testng.annotations.Test;

public class DependTest依赖测试 {
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }
    //如果test1执行失败了，test2依赖测试就会被忽略了
    //一般test1作为依赖，一般作为前置条件，比如test2买东西，test1就会先登录
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }


}
