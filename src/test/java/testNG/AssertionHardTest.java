package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionHardTest {


    String actualValue = "chamalka";


    @Test(priority = 0)
    public void valuesEqualCheck() {

//        if(name.equals("nimal")){
//            System.out.println("name is equal");
//        }else {
//            System.out.println("name is not equal");
//        }

        String expectedValue = "chamalka";
        System.out.println("prior to the valueEqualCheck assertion ");
        Assert.assertEquals(actualValue, expectedValue, "value miss matched");
        System.out.println("After valuesEqualCheck assertion ");
    }


    @Test(priority = 1)
    public void valueNotEqualCheck() {

        String expectedValue = "chamalka sadamali";
        System.out.println("prior to the valueNotEqualCheck assertion ");
        Assert.assertNotEquals(actualValue, expectedValue, "value miss matched");
        System.out.println("After  valuesNotEqualCheck assertion ");

    }

    @Test(priority = 2)
    public void trueConditionCheck() {
        System.out.println("prior to the trueConditionCheck assertion ");
        Assert.assertEquals(actualValue, "chamalka", "value miss matched");
        System.out.println("After  trueConditionCheck assertion ");
    }

    @Test(priority = 3)
    public void falseConditionCheck() {
        System.out.println("prior to the falseConditionCheck assertion ");
        Assert.assertFalse(actualValue.isBlank(), "value miss matched");
        System.out.println("After  falseConditionCheck assertion ");
    }








}






