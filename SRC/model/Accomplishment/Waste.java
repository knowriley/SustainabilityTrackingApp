package model.Accomplishment;

import Interfaces.HasResources;
import model.Accomplishment.Accomplishment;
import model.Type;

public class Waste extends Accomplishment implements HasResources {

    public Waste(int pointValue, String description) {
        super(pointValue, description);
        type = Type.WASTE;
    }

    @Override
    public void learnMore(){ //TODO: How do I make this print out. What would the signature be?
        System.out.println("http://greenactioncentre.ca/reduce-your-waste/why-should-i-compost/");
        System.out.println("https://www.sustainability.vic.gov.au/You-and-Your-Home/Waste-and-recycling/Recycling/Why-recycle");
    }

    @Override
    public void tips(){
        System.out.print("https://www.epa.gov/recycle/recycling-basics");

    }

}
