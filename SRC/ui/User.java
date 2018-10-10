package ui;

import Interfaces.Loadable;
import Interfaces.Saveable;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// NOTES: maybe add a "goals" functionality(set, track, remove, etc)??
// What about a new class User manager so I can have a list of Users
// what about a list of passions/CareCause board?

public class User{
    private String name;
    private int foodPoints;
    private int transportationPoints;
    private int educationPoints;
    private int clothesPoints;
    private int totalPoints;
    private List accomplishments;

    public User(){
        name = "";
        accomplishments = new ArrayList();
        totalPoints = 0;
        foodPoints = 0;
        transportationPoints = 0;
        clothesPoints = 0;
        educationPoints = 0;
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
    public int getTotalPoints(){
        return this.totalPoints;
    }

    public String getName(){
        return this.name;
    }

    public List getAccomplishments(){
        return this.accomplishments;
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

    public void setEducationPoints(int educationPoints) {
        this.educationPoints = educationPoints;
    }

    public void setAccomplishments(String accomplishments) {
        this.accomplishments = accomplishments;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
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
}