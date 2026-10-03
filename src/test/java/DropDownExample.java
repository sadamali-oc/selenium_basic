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
    }


    @Test
    public  void checkDropDown() throws InterruptedException {

        driver.get("https://www.leafground.com/select.xhtml;jsessionid=node01lkvliguiv77cxoln2egrrt591024521.node0");


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
        WebElement dropdown = driver.findElement(By.xpath(" //div[@id='j_idt87:country']"));
        dropdown.click();
        List<WebElement> listofDropDown2values = driver.findElements(By.xpath("//div[@id='j_idt87:country_items']/li"));
        for (WebElement element:listofDropDown2values){
            String dropDownValue = element.getText();
            if(dropDownValue.equals("USA")){
                element.click();
                break;
            }
        }


    }



    //google search - pick a value from suggestions

    @Test
    public void googleSearchDropDown() {
        driver.get("https://www.google.com/");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("chamalka_obadage");

        // Get Google search suggestions
        List<WebElement> suggestions = driver.findElements(
                By.xpath("//ul[@role='listbox']//li")
        );

        for (WebElement suggestion : suggestions) {
            String suggestionText = suggestion.getText();

            System.out.println(suggestionText);

            if (suggestionText.equalsIgnoreCase("chamalka obadage")) {
                suggestion.click();
                break;
            }
        }
    }






}
