package model;

public abstract class Accomplishment {
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

    }
