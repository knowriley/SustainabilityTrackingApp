package model;

import Interfaces.HasResources;

import java.util.Date;

public abstract class Accomplishment implements HasResources{
    protected String type;
    protected int pointValue;
    protected String description;

    public Accomplishment(String type, int pointValue, String description){
        this.type = type;
        this.pointValue = pointValue;
        this.description = description;
    }


    //GETTERS
    public String getType() {
        return this.type;
    }
    public int getPointValue() {
        return this.pointValue;
    }
    public String getDescription(){ return this.description; }

    //SETTERS
    public void setType(String type) {
        this.type = type;
    }
    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }
    public void setDescription(String description) { this.description = description; }



}

    // to deal with repetitive interface, maybe make a method here and do a super call, take in parameters name, pointValue


