import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class RadioCheckBox {

    WebDriver driver;

    @BeforeMethod
    public void radioCheckButtonCheck() {
        driver = new ChromeDriver();
    }

    @Test
    public void radioTests() {

        driver.get("https://www.leafground.com/radio.xhtml");

        // Find the default selected radio button

        boolean chromeRadioButton =
                driver.findElement(By.id("j_idt87:console2:0")).isSelected();

        boolean firefoxRadioButton =
                driver.findElement(By.id("j_idt87:console2:1")).isSelected();

        boolean safariRadioButton =
                driver.findElement(By.id("j_idt87:console2:2")).isSelected();

        boolean edgeRadioButton =
                driver.findElement(By.id("j_idt87:console2:3")).isSelected();


        if (chromeRadioButton) {

            String chrome = driver.findElement(
                    By.xpath("//label[@for='j_idt87:console2:0']")
            ).getText();

            System.out.println(
                    "The default selected radio button is " + chrome
            );

        } else if (firefoxRadioButton) {

            String firefox = driver.findElement(
                    By.xpath("//label[@for='j_idt87:console2:1']")
            ).getText();

            System.out.println(
                    "The default selected radio button is " + firefox
            );

        } else if (safariRadioButton) {

            String safari = driver.findElement(
                    By.xpath("//label[@for='j_idt87:console2:2']")
            ).getText();

            System.out.println(
                    "The default selected radio button is " + safari
            );

        } else if (edgeRadioButton) {

            String edge = driver.findElement(
                    By.xpath("//label[@for='j_idt87:console2:3']")
            ).getText();

            System.out.println(
                    "The default selected radio button is " + edge
            );
        }


        // Select age group only if it is not already selected

        WebElement myAgeGroup =
                driver.findElement(By.id("j_idt87:age:1"));

        if (!myAgeGroup.isSelected()) {

            driver.findElement(
                    By.xpath("//label[@for='j_idt87:age:1']")
            ).click();
        }
    }


    @Test
    public void checkBoxTests() {

        driver.get("https://www.leafground.com/checkbox.xhtml");

        // Find all checkbox input elements

        List<WebElement> checkBoxList = driver.findElements(
                By.xpath("//table[@id='j_idt87:basic']//input")
        );


        // Select all checkboxes except "Others"

        for (WebElement checkbox : checkBoxList) {

            String checkboxId = checkbox.getAttribute("id");

            // Find the label associated with this checkbox

            WebElement label = driver.findElement(
                    By.xpath("//label[@for='" + checkboxId + "']")
            );

            String labelText = label.getText();

            // Do not select "Others"

            if (!labelText.equals("Others")) {

                // Select only if it is not already selected

                if (!checkbox.isSelected()) {
                    label.click();
                }
            }
        }


        // Verify checkbox selected status

        for (WebElement checkbox : checkBoxList) {

            String checkboxId = checkbox.getAttribute("id");

            WebElement label = driver.findElement(
                    By.xpath("//label[@for='" + checkboxId + "']")
            );

            String labelText = label.getText();

            boolean checkboxStatus = checkbox.isSelected();

            System.out.println(
                    labelText +
                            " selected status: " +
                            checkboxStatus
            );
        }
    }
}