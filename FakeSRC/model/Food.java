package model;

import java.util.Scanner;

import ui.Main;


public class Food extends Accomplishment implements Points {

    public Food(){
        String type;
        points = 0;
    }

    @Override
    public void addPoints(int points){
    }

    @Override
    public int getPoints(){
        return 0;
    }

}
