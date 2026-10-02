import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonExample {

    WebDriver driver;

    @BeforeMethod
    public  void openLinkTestPaage(){

        driver = new ChromeDriver();
        driver.get("https://www.leafground.com/button.xhtml");

    }


    @Test
    public  void checkButton(){

        //click and confirm the title
//        WebElement title = driver.findElement(By.xpath("//span[normalize-space()='Click']"));
//        title.click();

        WebElement title = driver.findElement(By.id("j_idt88:j_idt90"));
        title.click();
        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("Actual title is equal to expected title");
        }else {
            System.out.println("Actual title is not equal to expected title");
        }

//        Assert.assertEquals(driver.getTitle(),"Dashboard");

        //finding the position of the submit button

        driver.navigate().back();
        WebElement positionButton = driver.findElement(By.id("j_idt88:j_idt94"));
        Point xyPoint = positionButton.getLocation();
        int x = xyPoint.getX();
        int y =xyPoint.getY();
        System.out.println("Position button coordinates are: " + x + " " + y);


        //finding the save button color

        WebElement buttonColor = driver.findElement(By.id("j_idt88:j_idt96"));
        String color = buttonColor.getCssValue("background-color");
        System.out.println("Color is " + color);


        //finding the height and the width of the button
        WebElement buttonSize = driver.findElement(By.id("j_idt88:j_idt98"));
       int  height  = buttonSize.getSize().getHeight();
       int width  = buttonSize.getSize().getWidth();
        System.out.println("Button size are: " + width + " " + height);













    }




}
