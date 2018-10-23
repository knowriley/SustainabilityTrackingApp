package model;

import Interfaces.HasResources;

public class Education extends Accomplishment implements HasResources {
    public Education(String type, int pointValue, String description ){
        super(type, pointValue, description);
    }

    @Override
    public void learnMore(){ //TODO: How do I make this print out. What would the signature be?
        System.out.println("Here are your beginning resources to learn about sustainability!");
        System.out.println("https://www.environmentalscience.org/sustainability");
        System.out.println("https://www.epa.gov/sustainability");
    }

    @Override
    public void tips(){
        // building confidence to say something

    }

}
