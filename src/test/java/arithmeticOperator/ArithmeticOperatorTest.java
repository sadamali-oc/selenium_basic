
package arithmeticOperator;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ArithmeticOperatorTest {


    SoftAssert softAssert = new SoftAssert();

    @Test(priority = 0)
    public void testSum() {

        System.out.println("****** First Test case for Calculator Sum ******");
        System.out.println("First sum calculation");

        int actualValueSum1 = ArithmeticOperator.calSum(10, 22);

        System.out.println("Actual value sum is: " + actualValueSum1);

        softAssert.assertEquals(actualValueSum1, 2, "Failed to calculate sum");


        System.out.println("****** Second Test case for Calculator Subtraction ******");
        System.out.println("First subtraction calculation");

        int actualValueSub1 = ArithmeticOperator.calSum(20, 10);

        System.out.println("Actual value subtraction is: " + actualValueSub1);

        softAssert.assertEquals(actualValueSub1, 30, "Failed to calculate subtraction");
        softAssert.assertAll();

    }
}
