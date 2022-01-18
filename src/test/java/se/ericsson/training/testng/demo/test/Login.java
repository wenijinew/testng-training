package se.ericsson.training.testng.demo.test;

import org.testng.annotations.*;

public class Login{

    @Test(priority=2)
    public void verifyLogoIsPresent(){
        System.out.println("P2: LoginLogo");
    }

    @Test(priority=1)
    public void verifyEmailIsPresent(){
        System.out.println("P1: LoginEmail");
    }

    @Test(priority=5)
    public void verifyPasswordIsPresent(){
        System.out.println("P5: LoginPassword");

    }

    @Test(priority=6)
    public void verifySubmitIsPresent(){
        System.out.println("P6:LoginSubmit");

    }

    @AfterSuite
    public void logout(){
        System.out.println("AfterSuite: User Logged out");
    }

}
