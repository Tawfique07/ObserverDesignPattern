/*
 * Name : Toufiqul Islam
 * Roll : 1910876107
 * Session : 2018-2019
 *
 * */

public class OctalObserver extends Observer {
    OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        ObserverPatternDemo.octal.setText( Integer.toOctalString(subject.getState()));
    }
}
