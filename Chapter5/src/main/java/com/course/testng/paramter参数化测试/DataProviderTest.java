package com.course.testng.paramter参数化测试;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println(name+age);
    }
    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o=new Object[][]{
                {"lufei",16},
                {"suolong",17},
                {"xiangjishi",18}
        };

        return o;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1中的"+name+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2中的"+name+age);
    }
    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result=null;
        if (method.getName().equals("test1")){
            result=new Object[][]{
                    {"lufei1", 26},
                    {"suolong1", 27},
            };
        }else if (method.getName().equals("test2")) {
            result = new Object[][]{
                    {"lufei2", 36},
                    {"suolong2", 37},
            };
        }
        return result;
    }

}
