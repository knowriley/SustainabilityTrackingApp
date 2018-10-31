package ui;

import Exceptions.NoEasyGoalException;
import Exceptions.TooManyGoalsException;
import model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// NOTES: maybe add a "goals" functionality(set, track, remove, etc)??
// what about a list of passions/CareCause board?

public class User{
    private String name;
    private List<Goal> goals;
    //private List<Accomplishment> accomplishments;
    private Map<Accomplishment, List<Accomplishment>> accomplishments = new HashMap<>();
    private int foodPoints;
    private int transportationPoints;
    private int clothesPoints;
    private int wastePoints;
    private int educationPoints;
    private int totalPoints;

    private static Food foodKey = new Food("food", 0, "key");
    private static Transportation transportationKey = new Transportation("transportation", 0, "key");
    private static Clothes clothesKey = new Clothes("clothes", 0, "key");
    private static Waste wasteKey = new Waste("waste", 0, "key");
    private static Education educationKey = new Education("education", 0, "key");


    public User(){
        name = "";
        goals = new ArrayList<Goal>();
        accomplishments.put(foodKey, new ArrayList<>());
        accomplishments.put(transportationKey, new ArrayList<>());
        accomplishments.put(clothesKey, new ArrayList<>());
        accomplishments.put(wasteKey, new ArrayList<>());
        accomplishments.put(educationKey, new ArrayList<>());
        totalPoints = 0;
        foodPoints = 0;
        transportationPoints = 0;
        clothesPoints = 0;
        wastePoints = 0;
        educationPoints = 0;
    }

    public void updateAccomplishments(Accomplishment a) {
        if (a.getType().equals("food")){
            updateFoodAccomplishments(a);
        }
        if (a.getType().equals("transportation")) {
            updateTransportationAccomplishments(a);
        }
        if (a.getType().equals("clothes")) {
            updateClothesAccomplishments(a);
        }
        if (a.getType().equals("waste")) {
            updateWasteAccomplishments(a);
        }
        if (a.getType().equals("education")) {
            updateEducationAccomplishments(a);
        }
    }

    private void updateEducationAccomplishments(Accomplishment a) {
        this.addEducationPoints(a.getPointValue());
        this.addTotalPoints(a.getPointValue());
        List<Accomplishment> educationAccomplishments = accomplishments.get(educationKey);
        educationAccomplishments.add(a);
    }

    private void updateWasteAccomplishments(Accomplishment a) {
        this.addWastePoints(a.getPointValue());
        this.addTotalPoints(a.getPointValue());
        List<Accomplishment> wasteAccomplishments = accomplishments.get(wasteKey);
        wasteAccomplishments.add(a);
    }

    private void updateClothesAccomplishments(Accomplishment a) {
        this.addClothesPoints(a.getPointValue());
        this.addTotalPoints(a.getPointValue());
        List<Accomplishment> clothesAccomplishments = accomplishments.get(clothesKey);
        clothesAccomplishments.add(a);
    }

    private void updateTransportationAccomplishments(Accomplishment a) {
        this.addTransportationPoints(a.getPointValue());
        this.addTotalPoints(a.getPointValue());
        List<Accomplishment> transportationAccomplishments = accomplishments.get(transportationKey);
        transportationAccomplishments.add(a);
    }

    private void updateFoodAccomplishments(Accomplishment a) {
        this.addFoodPoints(a.getPointValue());
        this.addTotalPoints(a.getPointValue());
        List<Accomplishment> foodAccomplishments = accomplishments.get(foodKey);
        foodAccomplishments.add(a);
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

    public void removeGoal(Goal g) {
        goals.remove(g);
    }


    public void addTotalPoints(int points){
        this.totalPoints = totalPoints + points;
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

    public void addWastePoints(int points){
        this.wastePoints = wastePoints + points;
    }

    public void addEducationPoints(int points){
        this.transportationPoints = transportationPoints + points;
    }


    //GETTERS
    public String getName(){ return this.name; }
    public List<Goal> getGoals() { return this.goals; }
    public Map<Accomplishment, List<Accomplishment>>  getAccomplishments(){ return this.accomplishments; }
    public int getTotalPoints(){ return this.totalPoints; }
    public int getFoodPoints(){ return this.foodPoints; }
    public int getTransportationPoints(){ return this.transportationPoints; }
    public int getClothesPoints(){ return this.clothesPoints; }
    public int getWastePoints(){ return this.wastePoints; }
    public int getEducationPoints(){ return this.educationPoints; }


    //SETTERS
    public void setName(String name){ this.name = name; }
    public void setGoals(List<Goal> goals) {
        this.goals = goals;
    }
    public void setAccomplishments(Map<Accomplishment, List<Accomplishment>> accomplishments) {
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

