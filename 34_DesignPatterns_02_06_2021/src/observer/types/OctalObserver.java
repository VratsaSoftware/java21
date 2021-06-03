package observer.types;

import observer.Observer;
import observer.Subject;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        super.subject = subject;
        super.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}