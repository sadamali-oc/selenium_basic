import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxExample {

    WebDriver driver;

    @BeforeMethod
    public  void openLinkTestPage() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.leafground.com/input.xhtml;jsessionid=node01utr0p36b0knfjiyzs5kz1uw950808.node0");
        Thread.sleep(3000);
    }

    @Test
    public  void textBoxTests(){

        //Type your name
        WebElement name = driver.findElement(By.id("j_idt88:name"));
        name.sendKeys("chamalka sadamali");

        //append country to this city
        WebElement country = driver.findElement(By.id("j_idt88:j_idt91"));
        country.sendKeys("galle");

        //verify if text box is disabled
        boolean enabled = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
        System.out.println("Is text box is enabled : "+enabled);

        //clear the typed text
        //*[@id="j_idt88:j_idt95"]
        WebElement cleartext = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt95']"));
        cleartext.clear();

        //retrive the typed text
        WebElement getTest = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt97']"));
        String value = cleartext.getAttribute("value");
        System.out.println(value);

        //type email and tab. confirm control moved to next element
        WebElement email = driver.findElement(By.id("j_idt88:j_idt99"));
        email.sendKeys("chamalkasandamali@gmail.com" + Keys.TAB +
                "confirmed control move to next element");









//
//        driver.quit();
    }
}
