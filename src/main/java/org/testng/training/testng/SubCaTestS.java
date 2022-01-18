package org.testng.training.testng;

public class SubCaTestS extends CaTestS{
    public SubCaTestS() {
    }

    @Override
    public void initMe(){
        initMeInSubclass="I am initied!";
    }
}
