package designpatterns.creational.abstractfactory.banking;

import designpatterns.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer writes Java code...");
    }
}
