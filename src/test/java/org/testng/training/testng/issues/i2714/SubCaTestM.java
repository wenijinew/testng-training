package org.testng.training.testng.issues.i2714;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class SubCaTestM extends CaTestM {
    static final String BEFORE_METHOD = "Sub [Before Method]";
    static final String AFTER_METHOD = "Sub [After Method]";

    public SubCaTestM() {
    }

    @BeforeMethod
    public void beforeMethod_Sub() {
        info(this + BEFORE_METHOD);
    }

    @AfterMethod(alwaysRun = true, groups = { "afterMethod" }, dependsOnGroups = { "beforeMethod" })
    public void afterMethod_Sub() {
        info(this + AFTER_METHOD);
    }

    @Test
    public void testTC1(){
        info(this + ": TC1");
    }
}
