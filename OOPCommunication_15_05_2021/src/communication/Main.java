package communication;

import callback.CallMe;
import callback.EventNotifier;
import callback.InterestingEvent;

public class Main {
    public static void main(String[] args) {
//        for (Day day : Day.values()) {
//            System.out.println(day);
//        }
//
//        Day day1 = Day.valueOf("MONDAY");
//        Day day2 = Day.MONDAY;
//        System.out.println(day1 == day2);
//
//        Day wednesday = Day.WEDNESDAY;
//        switch (wednesday) {
//            case MONDAY -> {
//                System.out.println("Mondays are tough");
//                break;
//            }
//            case TUESDAY -> {
//                System.out.println("Tuesdays are tougher");
//                break;
//            }
//            case WEDNESDAY -> {
//                System.out.println("Wednesdays are so-so");
//                break;
//            }
//            case THURSDAY -> {
//                System.out.println("Almost Friday");
//                break;
//            }
//            case FRIDAY -> {
//                System.out.println("Fridays are good");
//                break;
//            }
//            default -> System.out.println("Weekends are great");
//        }
//
//        Day friday = Day.FRIDAY;
//        System.out.println(friday.getDescription());
//
//        Engine engine = new Electric();
//        Car car = new Car(engine);
//        car.igniteEngine();

        InterestingEvent event = new CallMe();
        event.checkForChange();

    }

}
