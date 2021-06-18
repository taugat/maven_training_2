package fr.lernejo.tester;

import fr.lenerjo.tester.api.TestMethod;

public class SomeLernejoTests {

    @TestMethod
    public void ok(){

    }
    @TestMethod
    public void ko(){

    }
    public void none(){
        throw new IllegalStateException();
    }
}
