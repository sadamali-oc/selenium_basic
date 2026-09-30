import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.List;

public class LinkExample {


    WebDriver driver = new ChromeDriver();


    @BeforeMethod
    public  void openLinTestPage(){
//        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/link.xhtml");

    }


    @Test
    public void listTest (){

        //Take me to dashboard

        WebElement homeLink = driver.findElement(By.linkText("Go to Dashboard"));
        homeLink.click();
        driver.navigate().back();

        //find my destination

        WebElement wheretoGo = driver.findElement(By.partialLinkText("Find the URL"));
        String path = wheretoGo.getAttribute("href");
        System.out.println("This is the find destination :" +path);


        //Am I broken Link
        WebElement brokenLink = driver.findElement(By.linkText("Broken?"));
        brokenLink.click();
        String title = driver.getTitle();
        if(title.contains("404")){
            System.out.println("This is the 404 link");
        }else {
            System.out.println("Not broken");
        }

        driver.navigate().back();


        //Duplicate Link
        WebElement homeLink1 = driver.findElement(By.linkText("Go to Dashboard"));

        homeLink1.click();
        driver.navigate().back();



        //Count page Links

        List<WebElement> countfullpageLinks  = driver.findElements(By.tagName("a"));
        int pageLinkCount = countfullpageLinks.size();
        System.out.println("Total page links: " + pageLinkCount);



        //count layout links

        WebElement layoutElement = driver.findElement(By.className("layout-main-content"));
        layoutElement.findElement(By.tagName("a"));
        List<WebElement> layoutLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total layout links: " + layoutLinks.size());














        driver.close();




    }
}
