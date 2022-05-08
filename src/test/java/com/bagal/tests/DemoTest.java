package com.bagal.tests;

import org.testng.annotations.Test;

import static com.bagal.config.ConfigFactoryReader.getConfig;

public class DemoTest {
    @Test
    public void demoTest(){
        System.out.println("ConfigFactoryReader.getConfig().browser() = " + getConfig().browser());
        System.out.println("getConfig().explicitTimeout() = " + getConfig().explicitTimeout());
        System.out.println("getConfig().url() = " + getConfig().url());
        System.out.println("getConfig().names() = " + getConfig().names());

    }
}
