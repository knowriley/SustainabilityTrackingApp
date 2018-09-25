package PathsToSustainability;

public class Clothes {
    boolean isBought;
    boolean isDonated;
    int pointValue;

    public Clothes(){
        isBought = false;
        isDonated = false;
        pointValue = 0;
    }

    // MODIFIES: this
    // EFFECTS: categorizes Clothes as bought
    public void setBought(boolean b){
        this.isBought = b;
    }

    // MODIFIES: this
    // EFFECTS: categorizes Clothes as Donated
    public void setDonated(boolean b){
        this.isDonated = b;
    }
}
