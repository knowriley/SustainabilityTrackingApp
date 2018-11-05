package model.User;

import model.Accomplishment.Accomplishment;

// NOTES: maybe add a "goals" functionality(set, track, remove, etc)??
// what about a list of passions/CareCause board?

public class User{
    private String name;
    private UserGoals goals;
    private UserAccomplishments accomplishments;
    private int foodPoints;
    private int transportationPoints;
    private int clothesPoints;
    private int wastePoints;
    private int educationPoints;
    private int totalPoints;


    public User(){
        name = "";
        goals = new UserGoals(this);
        accomplishments = new UserAccomplishments(this);
        totalPoints = 0;
        foodPoints = 0;
        transportationPoints = 0;
        clothesPoints = 0;
        wastePoints = 0;
        educationPoints = 0;
    }

    public void updateFoodPoints(Accomplishment a) {
        addFoodPoints(a.getPointValue());
        addTotalPoints(a.getPointValue());
    }

    public void updateTransportationPoints(Accomplishment a) {
        addTransportationPoints(a.getPointValue());
        addTotalPoints(a.getPointValue());
    }

    public void updateClothesPoints(Accomplishment a) {
        addClothesPoints(a.getPointValue());
        addTotalPoints(a.getPointValue());
    }

    public void updateWastePoints(Accomplishment a) {
        addWastePoints(a.getPointValue());
        addTotalPoints(a.getPointValue());
    }

    public void updateEducationPoints(Accomplishment a) {
        addEducationPoints(a.getPointValue());
        addTotalPoints(a.getPointValue());
    }


    private void addTotalPoints(int points){
        this.totalPoints = totalPoints + points;
    }

    private void addFoodPoints(int points){
        this.foodPoints = foodPoints + points;
    }

    private void addTransportationPoints(int points){
        this.transportationPoints = transportationPoints + points;
    }

    private void addClothesPoints(int points){
        this.clothesPoints = clothesPoints + points;
    }

    private void addWastePoints(int points){
        this.wastePoints = wastePoints + points;
    }

    private void addEducationPoints(int points){
        this.transportationPoints = transportationPoints + points;
    }


    //GETTERS
    public String getName(){ return this.name; }
    public UserGoals getGoals() { return this.goals; }
    public UserAccomplishments  getAccomplishments(){ return this.accomplishments; }
    public int getTotalPoints(){ return this.totalPoints; }
    public int getFoodPoints(){ return this.foodPoints; }
    public int getTransportationPoints(){ return this.transportationPoints; }
    public int getClothesPoints(){ return this.clothesPoints; }
    public int getWastePoints(){ return this.wastePoints; }
    public int getEducationPoints(){ return this.educationPoints; }


    //SETTERS
    public void setName(String name){ this.name = name; }
    public void setGoals(UserGoals goals) {
        this.goals = goals;
    }
    public void setAccomplishments(UserAccomplishments accomplishments) {
        this.accomplishments = accomplishments;
    }
    public void setFoodPoints(int foodPoints) {
        this.foodPoints = foodPoints;
    }
    public void setTransportationPoints(int transportationPoints) {
        this.transportationPoints = transportationPoints;
    }
    public void setClothesPoints(int clothesPoints) {
        this.clothesPoints = clothesPoints;
    }
    public void setWastePoints(int wastePoints) {
        this.wastePoints = wastePoints;
    }
    public void setEducationPoints(int educationPoints) {
        this.educationPoints = educationPoints;
    }
    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

}

