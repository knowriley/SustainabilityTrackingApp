package model;

import Interfaces.HasResources;

import java.util.Date;

public abstract class Accomplishment implements HasResources{
    protected String name;
    protected int pointValue;
    protected String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public int getPointValue() {
        return this.pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public void setName(String name) { this.name = name; }

    public String getName(){ return this.name; }

    public abstract void motivationStatement();

    }

