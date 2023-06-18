package tests;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.DemoQAWebtables;

public class testAddEmployee extends BaseTest{
    private String firstName = "Oleg";

    @Test
    @Description("Adding of a new employee to the list")
    public void testNewElement(){
        DemoQAWebtables demoQAWebtables = new DemoQAWebtables(driver);
        //add a new element
        demoQAWebtables.clickOnAddButton();
        demoQAWebtables.setFirstName(firstName);
        demoQAWebtables.setLastName("Kyprianov");
        demoQAWebtables.setEmail("kypoleg@gmail.com");
        demoQAWebtables.setAge("35");
        demoQAWebtables.setSalary("3000");
        demoQAWebtables.setDepartment("QA");
        demoQAWebtables.clickOnSubmitButton();
        //checking of created element
        Assert.assertEquals(demoQAWebtables.getFirstNameOfCreatedElement(), firstName, "The element was created with wrong name");
        //editing of created element
        demoQAWebtables.clickOnEditButton();
        demoQAWebtables.setFirstName("Ivan");
        demoQAWebtables.clickOnSubmitButton();
        //checking of updated element
        Assert.assertEquals(demoQAWebtables.getFirstNameOfCreatedElement(), "Ivan", "The element was updated with wrong name");
        //delete of created element
        demoQAWebtables.clickOnDeleteButton();
        //check of correct deleting
        Assert.assertEquals(demoQAWebtables.getFirstNameOfCreatedElement(), " ", "The element was not deleted");
    }
}
