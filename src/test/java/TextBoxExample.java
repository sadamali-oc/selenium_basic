import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxExample {

    WebDriver driver;

    @BeforeMethod
    public  void openLinkTestPage(){
        driver = new ChromeDriver();
        driver.get("https://www.leafground.com/link.xhtml");
    }

    @Test
    public  void textBoxTests(){

        //Type your name
        driver.findElement(By.)

        driver.quit();
    }
}
