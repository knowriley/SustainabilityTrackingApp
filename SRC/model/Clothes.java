package model;

import Interfaces.Local;
import Interfaces.HasResources;


public class Clothes extends Accomplishment implements Local, HasResources {
    String local;

    public Clothes() {
        type = "Clothes";
        pointValue = 0;
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
    public void Tips(){
        //basic tips site
    }


}

