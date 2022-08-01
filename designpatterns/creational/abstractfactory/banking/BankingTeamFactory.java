package designpatterns.creational.abstractfactory.banking;

import designpatterns.creational.abstractfactory.Developer;
import designpatterns.creational.abstractfactory.ProjectManager;
import designpatterns.creational.abstractfactory.ProjectTeamFactory;
import designpatterns.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
