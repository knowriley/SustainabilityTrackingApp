package model;

public class Goal {
    GoalTracker tracker;
    Type type;
    int pointsEarnedSoFar;
    int pointGoal;

    public Goal(Type type, int pointGoal) {
        this.tracker = new GoalTracker(this);
        this.type = type;
        this.pointGoal = pointGoal;
        pointsEarnedSoFar = 0;
    }

    public void setPointGoal(int i){
        pointGoal = i;
    }

    //GETTERS
    public Type getType(){ return type; }
    public int getPointGoal(){ return pointGoal; }
    public int getPointsEarnedSoFar(){ return pointsEarnedSoFar; }
}
