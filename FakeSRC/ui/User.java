package ui;

import model.Points;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class User implements Points {
    String name;
    int foodPoints;
    int transportationPoints;
   // int educationPoints;
   // int clothesPoints;
    int totalPoints;
    ArrayList accomplishments;

    public User(){
        name = "test";
        accomplishments = new ArrayList();
        totalPoints = 0;
        foodPoints = 0;
        transportationPoints = 0;
    }


    @Override
    public void addPoints(int points) {
        this.totalPoints = points + totalPoints;
    }

    @Override
    public int getPoints() {
        return this.totalPoints;
    }

    public void save() throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("output.txt","UTF-8");
        writer.println(name);
        writer.close();
    }
}