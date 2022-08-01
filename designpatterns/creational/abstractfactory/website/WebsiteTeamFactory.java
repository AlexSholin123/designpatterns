package designpatterns.creational.abstractfactory.website;

import designpatterns.creational.abstractfactory.Developer;
import designpatterns.creational.abstractfactory.ProjectManager;
import designpatterns.creational.abstractfactory.ProjectTeamFactory;
import designpatterns.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebSitePM();
    }
}
