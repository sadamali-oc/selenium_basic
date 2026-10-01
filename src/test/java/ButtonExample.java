import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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







    }




}
