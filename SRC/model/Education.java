package model;

import Interfaces.HasResources;

public class Education extends Accomplishment implements HasResources {
    public Education(){
        String type = "Education";
        pointValue = 0;
    }

    @Override
    public void learnMore(){ //TODO: How do I make this print out. What would the signature be?
        System.out.println("Here are your beginning resources to learn about sustainability!");
        System.out.println("https://www.environmentalscience.org/sustainability");
        System.out.println("https://www.epa.gov/sustainability");
    }

    @Override
    public void Tips(){
        // building confidence to say something

    }

    @Override
    public void motivationStatement(){
        System.out.println("The best way to learn, is to teach. good job!");
    }


}
