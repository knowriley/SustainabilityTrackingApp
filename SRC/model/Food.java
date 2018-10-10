package model;


import Interfaces.Local;
import Interfaces.HasResources;

public class Food extends Accomplishment implements Local, HasResources {
    private String local;

    public Food(){
        String type = "Food";
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
        System.out.println("https://www.independent.co.uk/life-style/health-and-families/veganism-environmental-impact-planet-reduced-plant-based-diet-humans-study-a8378631.html");
        System.out.println("https://www.mcgill.ca/foodservices/sustainability/green/local");
    }

    @Override
    public void Tips(){
        System.out.println("https://blueandgreentomorrow.com/sustainability/sustainable-eating-going-vegan/");

    }

    @Override
    public void motivationStatement(){
        System.out.println("Eating sustainably never tasted so GOOD.");
    }


}
