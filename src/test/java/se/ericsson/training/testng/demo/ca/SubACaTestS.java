package se.ericsson.training.testng.demo.ca;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import se.ericsson.training.testng.demo.Constants;

public class SubACaTestS extends SubCaTestS{
    @Test(groups = Constants.GROUP_CA1)
    public void testTC1() {
        info(this + ":TC1");
    }

    @Test(groups = Constants.GROUP_CA2)
    public void testTC2() {
        info(this + ":TC2");
    }

    @Override
    @BeforeSuite(groups = Constants.GROUP_CA1)
    public void beforeSuite() {
        super.beforeSuite();
    }

    @Override
    @AfterSuite(groups = Constants.GROUP_CA1)
    public void afterSuite() {
        super.afterSuite();
    }
}
