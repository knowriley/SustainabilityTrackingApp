package model.Accomplishment;

import Interfaces.Local;
import Interfaces.HasResources;
import model.Type;


public class Clothes extends Accomplishment implements Local, HasResources {
    private String local;

    public Clothes(int pointValue, String description) {
        super(pointValue, description);
        type = Type.CLOTHES;
        local = "";
    }

    //MODIFIES: this
    //EFFECTS: sets location of local purchase to location
    @Override
    public void fromLocal(String location){
        this.local = location;
    }

    @Override
    public String getSupported(){
        return this.local;
    }

    @Override
    public void learnMore(){ //TODO: How do I make this print out. What would the signature be?
      System.out.println("Here are some resources to learn more about why this is important:");
      System.out.println("https://globalnews.ca/news/4173055/sustainable-fashion/");
      System.out.println("https://www.independent.co.uk/life-style/fashion/environment-costs-fast-fashion-pollution-waste-sustainability-a8139386.html");
    }

    @Override
    public void tips(){
        //basic tips site
    }
    


}

