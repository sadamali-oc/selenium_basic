package parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelMethodTest {

    @Test(priority = 0)
    public void openGoogle() {

        System.out.println("========== Google Test ==========");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.quit();

    }

    @Test(priority = 1)
    public void openEdge() {
        System.out.println("========== Edge Test ==========");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");
        driver.quit();


    }

}
