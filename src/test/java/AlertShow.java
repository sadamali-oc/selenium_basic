import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertShow {

    WebDriver driver;


    @BeforeMethod
    public  void alertTest(){
        driver = new ChromeDriver();
        driver.get("https://www.leafground.com/alert.xhtml");
    }

    @Test
    public void alertShowTest(){

        //Alert Simple Dialog

        WebElement alertCheck = driver.findElement(By.id("j_idt88:j_idt91"));
        alertCheck.click();
        Alert element = driver.switchTo().alert();
        element.accept();








    }
}
