package designpatterns.behavioral.observer;

public class JobSearch {

    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        Observer firstSubscriber = new Subscriber("Peter Doe");
        Observer secondSubscriber = new Subscriber("David Romanov");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Java Position");

        jobSite.removeVacancy("Third Java Position");

        Observer thirdSubscriber = new Subscriber("Alex Mower");

        jobSite.addObserver(thirdSubscriber);

        jobSite.addVacancy("Fourth Java Position");
    }
}
