/*
 * Name : Toufiqul Islam
 * Roll : 1910876107
 * Session : 2018-2019
 *
 * */

public class BinaryObserver extends Observer {

    BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        ObserverPatternDemo.binary.setText( Integer.toBinaryString(subject.getState()));
    }
}
