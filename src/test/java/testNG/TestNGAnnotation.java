package testNG;

import org.testng.annotations.Test;

public class TestNGAnnotation {


    public static void main(String[] args) {
        System.out.println("You done well");

        TestNGAnnotation testing = new TestNGAnnotation();
        testing.withoutTestNG();
    }

    public void withoutTestNG() {
        System.out.println("chamalka sadamali with out TestNG");
    }

    @Test
    public void test() {
        System.out.println("chamalka TestNG learn");
    }


}
