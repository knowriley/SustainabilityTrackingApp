package model;

public class Education {
    boolean isSelf;
    boolean isOthers;
    int pointValue;

    public Education(){
        isSelf = false;
        isOthers = false;
        pointValue = 0;
    }

    // MODIFIES: this
    // EFFECTS: categorizes Education as Self
    public void setSelf(boolean b){
        this.isSelf = b;
    }

    // MODIFIES: this
    // EFFECTS: categorizes Education as Others
    public void setOthers(boolean b){
        this.isOthers = b;
    }
}
