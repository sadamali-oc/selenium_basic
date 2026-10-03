import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioCheckBox {

    WebDriver driver;

    @BeforeMethod
    public  void radioCheckButtonCheck(){
        driver = new ChromeDriver();
    }

    @Test
    public  void radioTests(){

        driver.get("https://www.leafground.com/radio.xhtml");

        //find the default select radio button
       boolean chromeradioButton = driver.findElement(By.id("j_idt87:console2:0")).isSelected();
        boolean firefoxradioButton = driver.findElement(By.id("j_idt87:console2:1")).isSelected();
        boolean safariradioButton = driver.findElement(By.id("j_idt87:console2:2")).isSelected();
        boolean edgeradioButton = driver.findElement(By.id("j_idt87:console2:3")).isSelected();

        if (chromeradioButton){
            String chrome = driver.findElement(By.xpath("//label[@for='j_idt87:console2:0']")).getText();;
            System.out.println("The default selected radio button is "+chrome);
        }else if (firefoxradioButton){
            String firefox = driver.findElement(By.xpath("//label[@for='j_idt87:console2:1']")).getText();
            System.out.println("The default selected radio button is "+firefox);
        } else if (safariradioButton){
            String safari = driver.findElement(By.xpath("//label[@for='j_idt87:console2:2']")).getText();
            System.out.println("The default selected radio button is "+safari);
        } else if (edgeradioButton){
             String edgeraio = driver.findElement(By.xpath("//label[@for='j_id87:console2:3']")).getText();
             System.out.println("The default selected radio button is "+edgeraio);
        }










        //select the age group(only if not selected)


    }


    @Test
    public  void checkBoxTests(){
        driver.get("https://www.leafground.com/checkbox.xhtml");

    }



}
