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

public class User implements Loadable, Saveable{
    String name;
    int foodPoints;
    int transportationPoints;
    int educationPoints;
    int clothesPoints;
    int totalPoints;
    List accomplishments;

    public User(){ //TODO: Do I want my constructor to take parameters or have fields?
        name = "";
        accomplishments = new ArrayList();
        totalPoints = 0;
        foodPoints = 0;
        transportationPoints = 0;
        clothesPoints = 0;
        educationPoints = 0;
    }


    @Override
    // TODO: How do I also save a list (ex: accomplishments): think about how u want it written then write it
    public void save(String filename) throws IOException {
        PrintWriter printWriter = new PrintWriter(filename, "UTF-8");

             printWriter.println(this.name + ";" + String.valueOf(this.totalPoints) + ";" + String.valueOf(this.foodPoints) + ";" +
                     String.valueOf(this.transportationPoints) + ";" + String.valueOf(this.clothesPoints) + ";" +
                     String.valueOf(this.educationPoints));

        printWriter.close();
    }

    @Override
    public User load(String filename) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filename));
        for (String line : lines) {
            ArrayList<String> partsOfLine = split(line);
            this.name = partsOfLine.get(0);
            this.totalPoints = Integer.parseInt(partsOfLine.get(1));
            this.foodPoints = Integer.parseInt(partsOfLine.get(2));
            this.transportationPoints = Integer.parseInt(partsOfLine.get(3));
            this.clothesPoints = Integer.parseInt(partsOfLine.get(4));
            this.educationPoints = Integer.parseInt(partsOfLine.get(5));
        }
        return null;
    }

    public static ArrayList<String> split(String line){
        String[] splits = line.split(";");
        return new ArrayList<>(Arrays.asList(splits));
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

    public int getTotalPoints(){
        return this.totalPoints;
    }


}