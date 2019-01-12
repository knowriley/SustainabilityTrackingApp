package model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

//IDEAS:
// - tracker for percentage vegan (how often do you eat vegan a day?
// - tracker for percentage vegetarian
// - make trackers based on goals (aka new goal = new tracker)

public abstract class Tracker {
    private Set<LocalDate> dates = new HashSet<>(); // dates user earned points toward goal
    private int days; // count of dates since making goal

    public Tracker(){
        days = 1;
        dates.add(LocalDate.now());
    }

    public void updateDayCount(){
        days = days+1;
    }

    public void updateDatesList(){
            dates.add(LocalDate.now());
    }
}
