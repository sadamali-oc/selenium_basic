package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionSoftTest {

    SoftAssert softAssert = new SoftAssert();

    String actualValue = "chamalka";


    @Test(priority = 0)
    public void valuesEqualCheck() {
        String expectedValue = "chamalka sadamali";
        System.out.println("prior to the valueEqualCheck assertion ");
        softAssert.assertEquals(actualValue, expectedValue, "value miss matched");
        System.out.println("After valuesEqualCheck assertion ");
        softAssert.assertAll();
    }


    @Test(priority = 1)
    public void valueNotEqualCheck() {

        String expectedValue = "chamalka sadamali";
        System.out.println("prior to the valueNotEqualCheck assertion ");
        softAssert.assertNotEquals(actualValue, expectedValue, "value miss matched");
        System.out.println("After  valuesNotEqualCheck assertion ");
//        softAssert.assertAll();

    }

    @Test(priority = 2)
    public void trueConditionCheck() {
        System.out.println("prior to the trueConditionCheck assertion ");
        softAssert.assertTrue(actualValue.equals("chamalka"), "value miss matched");
        System.out.println("After  trueConditionCheck assertion ");
//        softAssert.assertAll();
    }

    @Test(priority = 3)
    public void falseConditionCheck() {
        System.out.println("prior to the falseConditionCheck assertion ");
        softAssert.assertFalse(actualValue.isBlank(), "value miss matched");
        System.out.println("After  falseConditionCheck assertion ");
//        softAssert.assertAll();
    }


}






