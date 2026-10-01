import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
        WebElement title = driver.findElement(By.id())


    }




}
