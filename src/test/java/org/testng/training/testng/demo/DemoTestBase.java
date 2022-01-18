package org.testng.training.testng.demo;

public abstract class DemoTestBase {
    protected void info(Object object){
        LogUtils.info(object);
    }

    public String toString(){
        return "[" + this.getClass().getSimpleName() + "]";
    }
}
