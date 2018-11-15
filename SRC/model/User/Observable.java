package model.User;

import ui.Observer;

import java.util.List;

public abstract class Observable {
    private List<Observer> observers;

    public void addObserver(Observer o){
        if (o != null) {
            if (!observers.contains(o)) {
                observers.add(o);
            }
        }
    }

    public void notifyObservers(){
        for (Observer o : observers) {
            o.update();
        }
    }
}
