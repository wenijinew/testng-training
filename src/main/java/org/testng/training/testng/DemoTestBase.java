package org.testng.training.testng;

public abstract class DemoTestBase {
    protected void info(Object object){
       System.out.println(object);
    }

    public String toString(){
        return "[" + this.getClass().getSimpleName() + "]";
    }
}
