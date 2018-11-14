package model;

public enum Type {
    FOOD("Food"),
    TRANSPORTATION("Transportation"),
    CLOTHES("Clothes"),
    WASTE("Waste"),
    EDUCATION("Education");

    private String displayName;

    Type(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
