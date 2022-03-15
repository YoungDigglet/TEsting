package pl.testeroprogramowania;


import org.testng.annotations.*;

public class BaseTest {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I`m running before suite");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("I`m runnig before class");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("I`m running after Suite");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("I`m running after class");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println(("I`m running before test"));
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I`m running before method");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("I`m running after test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("I`m running after method");
    }
}