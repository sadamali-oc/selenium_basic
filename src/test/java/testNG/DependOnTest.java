package testNG;

import org.testng.annotations.Test;

public class DependOnTest {


    @Test()
    public  void oLevel(){
        System.out.println("olevel TestNG learn");
    }

    @Test(priority = 1,dependsOnMethods = "oLevel")
    public  void aLevel(){
        System.out.println("alevel TestNG learn");
    }

    @Test(priority = 2 , dependsOnMethods = {"oLevel", "aLevel"})
    public  void campus(){
        System.out.println("campus TestNG learn");
    }
}
