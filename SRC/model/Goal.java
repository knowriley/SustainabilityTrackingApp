package model;

public class Goal {
    Tracker tracker;
    String type;
    int pointsEarnedSoFar;
    int pointGoal;

    public Goal(String type, int pointGoal) {
        this.tracker = new Tracker(this);
        this.type = type;
        this.pointGoal = pointGoal;
        pointsEarnedSoFar = 0;
    }

    //GETTERS
    public String getType(){ return type; }
    public int getPointGoal(){ return pointGoal; }
    public int getPointsEarnedSoFar(){ return pointsEarnedSoFar; }
}
