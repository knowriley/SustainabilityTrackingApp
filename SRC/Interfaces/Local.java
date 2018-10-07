package Interfaces;

public interface Local {

    // MODIFIES: this
    // EFFECTS: sets location of local purchase
    public void fromLocal(String location);

    // EFFECTS: returns local
    public String getSupported();
}
