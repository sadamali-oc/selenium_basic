package annotation;

import org.testng.annotations.*;

public class AnnotationHierarchyExample {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("========== Before Suite ==========");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("========== Before Test ==========");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("========== Before Class ==========");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("---------- Setup: Before Test Method ----------");
    }

    @Test
    public void test01() {
        System.out.println("********** Executing Test Case: test01 **********");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("---------- Teardown: After Test Method ----------");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("========== After Class ==========");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("========== After Test ==========");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("========== After Suite ==========");
    }
}