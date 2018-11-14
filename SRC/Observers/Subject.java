package Observers;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();

    public void notifyObservers(){
        for (Observer o : observers) {
            o.update(this);
        }
    }

    public void addObserver(Observer o) {
        if (o != null) {
            if (!observers.contains(o)) {
            observers.add(o);
            }
        }
    }

}
