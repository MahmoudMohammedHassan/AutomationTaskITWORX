package stepDefinition;

import Pages.AddNewCoursePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;



public class AddNewCourseSteps {

    AddNewCoursePage add = new AddNewCoursePage();

    @When("User navigates to the courses page")
    public void navigateToCourses(){
        add.coursesBtn().click();
        Assert.assertEquals("https://swinji.azurewebsites.net/Course#!/list/",Hooks.driver.getCurrentUrl());
    }

    @And("User Clicks Add Course button")
    public void addCourseClick() throws InterruptedException {
        add.addCourseBtn().click();
        Thread.sleep(1200);
        Assert.assertEquals("https://swinji.azurewebsites.net/Course#!/add", Hooks.driver.getCurrentUrl());
    }

    @And("user enters course basic info")
        public void enterCourseInfo() {
            add.courseName().sendKeys("Addition and Subtraction");
            Select selectSubject = new Select(add.subject());
            selectSubject.selectByVisibleText("Mathematics");
            Select selectGrade = new Select(add.grade());
            selectGrade.selectByVisibleText("3");
            add.teacherList().click();
            add.selectTeacher().click();
    }

    @And("user clicks create button")
        public void createCourseBtnClick() throws InterruptedException {
            add.createCourse().click();
            Thread.sleep(1500);
    }

    @And("user should find the created course")
        public void ValidateCourseCreation() {

        add.coursesBtn().click();
        Select selectSort = new Select(add.sortBy());
        selectSort.selectByVisibleText("Creation Date Descending");
        Assert.assertEquals("Addition and Subtraction",add.getCourses().get(1).getText());

    }
}
