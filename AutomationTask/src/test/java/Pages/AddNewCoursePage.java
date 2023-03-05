package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hooks;

import java.util.List;

public class AddNewCoursePage {
    public WebElement coursesBtn(){
        return Hooks.driver.findElement(By.id("btnMyCoursesList"));
    }

    public WebElement addCourseBtn(){

        return Hooks.driver.findElement(By.id("btnListAddCourse"));
    }

    public WebElement courseName(){

        return Hooks.driver.findElement(By.id("txtCourseName"));
    }
    public WebElement subject(){
        return Hooks.driver.findElement(By.id("courseSubject"));
    }

    public WebElement grade(){
        return Hooks.driver.findElement(By.id("courseGrade"));
    }

    public WebElement teacherList(){
       return Hooks.driver.findElement(By.xpath("//*[@id=\"teacherOnBehalf\"]/div[@class=\"ui-select-match\"]/span[@class=\"btn btn-default form-control ui-select-toggle\"]/span[@class=\"ui-select-placeholder text-muted\"]"));
    }

    public WebElement selectTeacher(){
        return Hooks.driver.findElement(By.id("ui-select-choices-row-0-0"));
    }

    public WebElement createCourse(){
        return Hooks.driver.findElement(By.id("btnSaveAsDraftCourse"));
    }

    public WebElement sortBy(){
        return Hooks.driver.findElement(By.id("CoursesOrderBy"));
    }

    public List<WebElement> getCourses(){
        return Hooks.driver.findElements(By.id("lnkListCourseSelcted"));
    }

}
