package PathsToSustainability;

import ui.SustainableAF;

import java.util.Scanner;

public class Transportation {
    boolean isPublic;
    boolean isGround;
    int pointValue;

    public Transportation(){
        isPublic = false;
        isGround = false;
        pointValue = 0;
        Scanner scanner = new Scanner(System.in);
    }

    // MODIFIES: this
    // EFFECTS: categorizes Transport as Public
    public void setPublic(boolean b){
        this.isPublic = b;
    }

    // MODIFIES: this
    // EFFECTS: categorizes Transport as Ground
    public void setGround(boolean b){
        this.isGround = b;
    }

}
