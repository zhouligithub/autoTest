package com.course.testng.paramter参数化测试;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {
    @Test
    @Parameters({"name","age"})
    public void paramTest(String name,int age){
        System.out.println(name+age);
    }
}
