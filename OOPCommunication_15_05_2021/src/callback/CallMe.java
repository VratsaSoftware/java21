package callback;

public class CallMe implements InterestingEvent {
    private EventNotifier en;

    public CallMe () {
        //подаваме this на EventNotifier
        //понеже CallMe е InterestingEvent
        en = new EventNotifier();
    }

    public void somethingInterestingHappened() {
        en.setSomethingHappened(true);
    }

    @Override
    public void checkForChange () {
        this.somethingInterestingHappened();
        en.doWork(this);
    }

    @Override
    public void interestingEvent () {
        System.out.println("Wow");
    }
    //...
}

