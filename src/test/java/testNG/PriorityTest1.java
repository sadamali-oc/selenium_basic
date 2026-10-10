package testNG;

import org.testng.annotations.Test;

public class PriorityTest1 {


    @Test(priority = 0)
    public void testLogin() {
        System.out.println("login");
    }

    @Test(priority = 1)
    public void testCreate() {

    }


    @Test(priority = 2, enabled = false)
    public void testEdit() {

    }

    @Test(priority = 3)
    public void testDelete() {

    }

    @Test(priority = 4)
    public void testLogout() {

    }


}
