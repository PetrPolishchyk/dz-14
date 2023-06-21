package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQAWebtables extends AbstractPageObject {

    private By addButton = By.xpath("//button[@id='addNewRecordButton']");
    private By firstNameField = By.xpath("//div[@id='firstName-wrapper']//input");
    private By lastNameField = By.xpath("//div[@id='lastName-wrapper']//input");
    private By emailField = By.xpath("//div[@id='userEmail-wrapper']//input");
    private By ageField = By.xpath("//div[@id='age-wrapper']//input");
    private By salaryField = By.xpath("//div[@id='salary-wrapper']//input");
    private By departmentField = By.xpath("//div[@id='department-wrapper']//input");
    private By submitButton = By.xpath("//div[@class='mt-4 justify-content-end row']//button");
    private By createdElement = By.xpath("//div[@class='rt-tbody']/div[4]//div[@role='row']/div[1]");
    private By editButton = By.xpath("//div[@class='rt-tbody']/div[4]//div[@class='action-buttons']/span[@class='mr-2']");
    private By deleteButton = By.xpath("//div[@class='rt-tbody']/div[4]//div[@class='action-buttons']/span[@id='delete-record-4']");

    public DemoQAWebtables(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/webtables");
    }

    public void clickOnAddButton(){
        getElement(addButton).click();
    }
    public void setFirstName(String firstName){
        getElement(firstNameField).clear();
        getElement(firstNameField).sendKeys(firstName);
    }
    public void setLastName(String lastName){
        getElement(lastNameField).sendKeys(lastName);
    }
    public void setEmail(String email){
        getElement(emailField).sendKeys(email);
    }
    public void setAge(String age){
        getElement(ageField).sendKeys(age);
    }
    public void setSalary(String salary){
        getElement(salaryField).sendKeys(salary);
    }
    public void setDepartment(String department){
        getElement(departmentField).sendKeys(department);
    }
    public void clickOnSubmitButton(){
        getElement(submitButton).click();
    }
    public String getFirstNameOfCreatedElement(){
        return getElement(createdElement).getText();
    }
    public void clickOnEditButton(){
        getElement(editButton).click();
    }
    public void clickOnDeleteButton(){
        getElement(deleteButton).click();
    }

}
