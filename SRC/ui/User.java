package ui;

import Exceptions.NoEasyGoalException;
import Exceptions.TooManyGoalsException;
import model.Accomplishment;
import model.Goal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// NOTES: maybe add a "goals" functionality(set, track, remove, etc)??
// what about a list of passions/CareCause board?

public class User{
    private String name;
    private List<Goal> goals;
    private List<Accomplishment> accomplishments;
    private int foodPoints;
    private int transportationPoints;
    private int educationPoints;
    private int clothesPoints;
    private int totalPoints;


    public User(){
        name = "";
        goals = new ArrayList<Goal>();
        accomplishments = new ArrayList<>();
        totalPoints = 0;
        foodPoints = 0;
        transportationPoints = 0;
        clothesPoints = 0;
        educationPoints = 0;
    }

    public void updateAccomplishment(Accomplishment a) {
        this.addFoodPoints(a.getPointValue()); // TODO: this line needs to be TYPE SPECIFIC, not just food
        this.addTotalPoints(a.getPointValue());
        this.accomplishments.add(a);
    }

    public void addGoal(Goal g) throws TooManyGoalsException, NoEasyGoalException{
        if (g.getPointGoal() <= 0) {
            throw new NoEasyGoalException();
        }
        if (goals.size() >= 3){
            throw new TooManyGoalsException();
        }
        goals.add(g);
    }

    public void addFoodPoints(int points){
        this.foodPoints = foodPoints + points;
    }

    public void addTransportationPoints(int points){
        this.transportationPoints = transportationPoints + points;
    }

    public void addClothesPoints(int points){
        this.clothesPoints = clothesPoints + points;
    }

    public void addEducationPoints(int points){
        this.transportationPoints = transportationPoints + points;
    }

    public void addTotalPoints(int points){
        this.totalPoints = totalPoints + points;
    }

    //GETTERS
    public String getName(){
        return this.name;
    }
    public List<Goal> getGoals() { return this.goals; }
    public List<Accomplishment> getAccomplishments(){ return this.accomplishments; }
    public int getTotalPoints(){
        return this.totalPoints;
    }
    public int getFoodPoints(){
        return this.foodPoints;
    }
    public int getTransportationPoints(){
        return this.transportationPoints;
    }
    public int getClothesPoints(){
        return this.clothesPoints;
    }
    public int getEducationPoints(){
        return this.educationPoints;
    }


    //SETTERS
    public void setName(String name){
        this.name = name;
    }
    public void setAccomplishments(List<Accomplishment> accomplishments) {
        this.accomplishments = accomplishments; }
    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }
    public void setFoodPoints(int foodPoints) {
        this.foodPoints = foodPoints;
    }
    public void setTransportationPoints(int transportationPoints) {
        this.transportationPoints = transportationPoints;
    }
    public void setClothesPoints(int clothesPoints) { this.clothesPoints = clothesPoints; }
    public void setEducationPoints(int educationPoints) {
        this.educationPoints = educationPoints;
    }

}

