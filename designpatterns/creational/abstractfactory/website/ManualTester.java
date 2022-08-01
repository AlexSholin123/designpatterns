package designpatterns.creational.abstractfactory.website;

import designpatterns.creational.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester test website...");
    }
}
