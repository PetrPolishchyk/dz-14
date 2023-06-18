package tests;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.DemoQAElements;

public class testClickMe extends BaseTest{
    @Test
    @Description("Te test of checking of received text correctness")
    public void testOfClickButtonCorrectness(){
        DemoQAElements demoQAElements = new DemoQAElements(driver);
        demoQAElements.clickOnButtonElement();
        demoQAElements.clickOnClickMeElement();
        String resultText = demoQAElements.getAppearedTextOfElement();

        Assert.assertEquals(resultText, "You have done a dynamic click", "The received text is not correct");
        System.out.println(resultText);
    }
}
