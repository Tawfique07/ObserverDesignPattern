/*
 * Name : Toufiqul Islam
 * Roll : 1910876107
 * Session : 2018-2019
 *
 * */

public class HexObserver extends Observer {
    HexObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        ObserverPatternDemo.hex.setText( Integer.toHexString(subject.getState()).toUpperCase());
    }
}
