package model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Tracker {
    private Goal goal;
    private List<Date> dates = new LinkedList<Date>(); // dates user earned points toward goal
    private int days; // count of dates since making goal

    public Tracker(Goal g){
            this.goal = g;
        }

    public void updateDays(){
        days = days+1;
    }

    public void updateDates(){
        Date today = new Date();
        if (!dates.contains(today)) {
            dates.add(today);
        }
    }
}
