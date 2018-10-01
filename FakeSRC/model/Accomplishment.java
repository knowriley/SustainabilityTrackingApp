package model;

public abstract class Accomplishment {
    protected int points;
    protected String type;

//
//    public void setType(boolean b);
//    public void setOptionB(boolean b);
//    public boolean getType();
//    public boolean getOptionA();

    // MODIFIES: this
    // EFFECTS: categorizes Food as Meal
    public void setType(String type){
        this.type = type;
    }

    //EFFECTS: returns isWaste of Food
    public String getType(){
        return this.type;
    }


}
