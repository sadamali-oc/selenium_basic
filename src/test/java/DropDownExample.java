import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;


public class DropDownExample {

    WebDriver driver;


    @BeforeMethod
    public  void DropDown(){
        driver = new ChromeDriver();
        driver.get("https://www.leafground.com/select.xhtml;jsessionid=node01lkvliguiv77cxoln2egrrt591024521.node0");
    }


    @Test
    public  void checkDropDown() throws InterruptedException {

        //ways of select values in basic dropdown
        WebElement selectValues = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        Select  select = new Select(selectValues);
        select.selectByIndex(1);
        Thread.sleep(3000);
        select.selectByVisibleText("Playwright");


        //get the number of dropdown options
        //generics
        List<WebElement> listOptions = select.getOptions();
        int numberOfOptions = listOptions.size();
        System.out.println("Number of options are: " + numberOfOptions);
        for (WebElement element : listOptions){
            System.out.println(element.getText());
        }

        //using sendkeys select dropdown value

        selectValues.sendKeys("Puppeteer");

        //selecting values in a bootstrap dropdown
        












    }
}
