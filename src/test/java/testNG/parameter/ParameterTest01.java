package testNG.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest01 {

    @Test
    @Parameters({"value1","value2"})
    public  void sum(int v1, int v2){
        int finalsum = v1+v2;
        System.out.println("The final sum is "+finalsum);
    }




}
