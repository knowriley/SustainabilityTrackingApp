package model.Accomplishment;

import Interfaces.HasResources;
import model.Type;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

public abstract class Accomplishment implements HasResources{
    protected Type type;
    protected LocalDate date;
    protected int pointValue;
    protected String description;

    public Accomplishment(int pointValue, String description){
        this.pointValue = pointValue;
        this.date = LocalDate.now();
        this.description = description;
    }


    //GETTERS
    public Type getType() { return this.type; }
    public int getPointValue() { return this.pointValue; }
    public String getDescription(){ return this.description; }

    //SETTERS
    public void setType(Type type) {
        this.type = type;
    }
    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }
    public void setDescription(String description) { this.description = description; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accomplishment that = (Accomplishment) o;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {

        return Objects.hash(type);
    }
}

    // to deal with repetitive interface, maybe make a method here and do a super call, take in parameters name, pointValue


