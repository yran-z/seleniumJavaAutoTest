package com.seleniumJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D://file//文档//chromedriver_win32 (1)//chromedriver.exe");


//        given().

        WebDriver driver=new ChromeDriver();
        driver.get("http://sso.ppmoney.com/cas/login?service=http://creditcard-sit.haomoney.com/creditcard/LDAPLogin");

        ((ChromeDriver) driver).findElementById("username");
    }
}
