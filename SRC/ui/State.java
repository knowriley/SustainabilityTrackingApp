package ui;

public enum State {
    NEWUSER("New User"),
    OLDUSER("Old User"),
    WELCOME("Welcome"),
    MAINOPTIONS("Main Options"),
    PROFILEVIEW("Profile View"),
    ADDGOAL("Add Goal"),
    ADDACCOMPLISHMENT("Add Accomplishment"),
    HOWMANYPOINTS("How Many Points?"),
    FOODACCOMPLISHMENT("Food Accomplishment"),
    TRANSPORTATIONACCOMPLISHMENT("Transportation Accomplishment"),
    CLOTHESACCOMPLISHMENT("Clothes Accomplishment"),
    WASTEACCOMPLISHMENT("Waste Accomplishment"),
    EDUCATIONACCOMPLISHMENT("Education Accomplishment"),
    RETURNHOME("Return Home");

    private String displayName;

    State(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
