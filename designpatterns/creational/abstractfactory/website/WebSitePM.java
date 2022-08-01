package designpatterns.creational.abstractfactory.website;

import designpatterns.creational.abstractfactory.ProjectManager;

public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
