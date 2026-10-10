package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest {

    String actualValue = "chamalka";


    @Test
    public void valuesEqualCheck(){

//        if(name.equals("nimal")){
//            System.out.println("name is equal");
//        }else {
//            System.out.println("name is not equal");
//        }
        String expectedValue = "chamalka";
        System.out.println("prior to the valueEqualCheck assertion ");
        Assert.assertEquals(actualValue,expectedValue,"value miss matched");
        System.out.println("After valuesEqualCheck assertion ");


        }



    }


