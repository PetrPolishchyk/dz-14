package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQAElements extends AbstractPageObject{

    private By buttons = By.xpath("//div[@class='element-list collapse show']//li[@id='item-4']");
    private By clickMeButton = By.xpath("//div[@class='col-12 mt-4 col-md-6']//button[text()='Click Me']");
    private By appearedText = By.xpath("//div[@class='col-12 mt-4 col-md-6']//p[text()='You have done a dynamic click']");
    private String temp;

    public DemoQAElements(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/elements");
    }

    public void clickOnButtonElement(){
        getElement(buttons).click();
    }
    public void clickOnClickMeElement(){
        getElement(clickMeButton).click();
    }
    public String getAppearedTextOfElement(){
        return getElement(appearedText).getText();
    }

}
