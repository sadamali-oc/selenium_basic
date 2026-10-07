import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsExample {

    WebDriver driver ;


    @BeforeMethod
    public  void windowsTestPage(){
        driver = new ChromeDriver();
        driver.get("https://www.leafground.com/window.xhtml");
    }


    @Test
    public  void windowsTest() throws InterruptedException {

        //click and confirm new window opens

        String  oldwindow = driver.getWindowHandle();
        System.out.println("Parent Window Handle is "+oldwindow);

        WebElement openButton = driver.findElement(By.xpath("//*[@id='j_idt88:new']/span"));
        openButton.click();
        Thread.sleep(3000);

        Set<String> handles = driver.getWindowHandles();
        System.out.println("Handles are "+handles.size());

        //first method - using foreach loop
        for (String newWindow : handles){

            System.out.println(newWindow);
            driver.switchTo().window(newWindow);
            System.out.println("Page Title is "+driver.getTitle());
        }

        driver.close();

        driver.switchTo().window(oldwindow);
        
        WebElement openButton1 = driver.findElement(By.xpath("//*[@id='j_idt88:new']/span"));
        boolean openButtonVisibility = openButton1.isDisplayed();
        System.out.println("Open Button visibility is "+openButtonVisibility);









    }

}

