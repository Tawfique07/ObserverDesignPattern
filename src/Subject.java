/*
 * Name : Toufiqul Islam
 * Roll : 1910876107
 * Session : 2018-2019
 *
 * */

import java.util.ArrayList;
import java.util.List;

class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    int getState() {
        return state;
    }
    void setState(int state){
        this.state = state;
        notifyAllObservers();
    }
    void attach(Observer observer){
        observers.add(observer);
    }

    private void notifyAllObservers(){
        for(Observer observer : observers){
            observer.update();
        }
    }
}
