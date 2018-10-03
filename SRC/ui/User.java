package ui;

import Interfaces.Loadable;
import Interfaces.Saveable;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User implements Loadable, Saveable{
    String name;
    int foodPoints;
    int transportationPoints;
    int educationPoints;
    int clothesPoints;
    int totalPoints;
    List accomplishments;
    private List<User> listofUser;

    public User(){
        name = "test";
        accomplishments = new ArrayList();
        totalPoints = 0;
        foodPoints = 0;
        transportationPoints = 0;
        clothesPoints = 0;
        educationPoints = 0;
    }


    @Override
    public void save(String filename) throws IOException {
        FileWriter fileWriter = new FileWriter(filename);
        PrintWriter printWriter = new PrintWriter(fileWriter);

             printWriter.println("this.name" + ";" + String.valueOf(this.totalPoints) + ";" + String.valueOf(this.foodPoints) + ";" +
                     String.valueOf(this.transportationPoints) + ";" + String.valueOf(this.clothesPoints) + ";" +
                     String.valueOf(this.educationPoints));

        printWriter.close();
    }

    @Override
    public void load(String filename) throws IOException {
        FileWriter fileWriter = new FileWriter(filename);
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

        fileWriter.close();
    }

    public static ArrayList<String> split(String line){
        String[] splits = line.split(";");
        return new ArrayList<>(Arrays.asList(splits));
    }
}