

package testNG.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest02{

    @Test
    @Parameters({"value1","value2"})
    public  void diff(int v1, int v2){
        int finaldiff = v1-v2;
        System.out.println("The difference of the given value is:"+finaldiff);
    }




}
