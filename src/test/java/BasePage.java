
package com.endava.stepdefs;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {

    WebDriver webDriver;

    @Before
    public void init(){
        webDriver = new ChromeDriver();
        webDriver.get("http://bhdtest.endava.com/petclinic/welcome");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @After
    public void tearDown(){
        webDriver.quit();
//     webDriver.get("http://bhdtest.endava.com/petclinic/owners");

    }



}

