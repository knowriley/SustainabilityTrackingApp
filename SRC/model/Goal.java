package model;

public class Goal {
    String type;
    int pointsEarnedSoFar;
    int pointGoal;

    public Goal(String type, int pointGoal) {
        this.type = type;
        this.pointGoal = pointGoal;
        pointsEarnedSoFar = 0;
    }

    //GETTERS
    public String getType(){ return type; }
    public int getPointGoal(){ return pointGoal; }
    public int getPointsEarnedSoFar(){ return pointsEarnedSoFar; }
}
