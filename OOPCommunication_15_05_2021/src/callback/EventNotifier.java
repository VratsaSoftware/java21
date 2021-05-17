package callback;

public class EventNotifier {
    private boolean somethingHappened;

    public EventNotifier() {
        // все още нищо не е станало
        somethingHappened = false;
    }

    public void doWork(InterestingEvent ie) {
        // проверяваме предитатът, който може да е променен
        //на друго място в кода
        if (somethingHappened) {
            // сигнализираме за промяната
            ie.interestingEvent();
        }
        // друг код
    }

    public void setSomethingHappened(boolean somethingHappened) {
        this.somethingHappened = somethingHappened;
    }
}





