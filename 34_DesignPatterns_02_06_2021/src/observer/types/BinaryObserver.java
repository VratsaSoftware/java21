package observer.types;

import observer.Observer;
import observer.Subject;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        super.subject = subject;
        super.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
}