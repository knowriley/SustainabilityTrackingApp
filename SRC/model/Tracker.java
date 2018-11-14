package model;

import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public abstract class Tracker {
    private List<LocalDate> dates = new LinkedList<>(); // dates user earned points toward goal
    private int days; // count of dates since making goal

    public Tracker(){
        days = 1;
        dates.add(LocalDate.now());
    }

    public void updateDayCount(){
        days = days+1;
    }

    public void updateDatesList(){
        Date today = new Date();
        if (!dates.contains(LocalDate.now())) {
            dates.add(LocalDate.now());
        }
    }
}
