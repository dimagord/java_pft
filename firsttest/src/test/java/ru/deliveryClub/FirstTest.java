package ru.deliveryClub;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends WebDriverSettings {

    @Test
    public void firstTest() {

        driver.get("http://www.google.com");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Google"));

    }
    @Test
    public void secondTest() {

        driver.get("http://www.google.com");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Google"));}


}
