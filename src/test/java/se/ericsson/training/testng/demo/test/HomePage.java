package se.ericsson.training.testng.demo.test;

import org.testng.annotations.*;
public class HomePage {

    @BeforeSuite
    public void login(){
        System.out.println("BeforeSuite: User Logged in");
    }

    @Test(priority=2)
    public void verifyLogoIsPresent(){
        System.out.println("P2: Logo");
    }

    @Test(priority=1)
    public void verifyEmailIsPresent(){
        System.out.println("P1: Email");
    }

    @Test(priority=3)
    public void verifyPasswordIsPresent(){
        System.out.println("P3: Passwor");
    }

    @Test(priority=4)
    public void averifySubmitIsPresent(){
        System.out.println("P4: Submit");
    }
}
