package model;

import Interfaces.HasResources;

public class Waste extends Accomplishment implements HasResources {

    public Waste() {
        String type = "Waste";
        pointValue = 0;
    }

    @Override
    public void learnMore(){
        System.out.println("http://greenactioncentre.ca/reduce-your-waste/why-should-i-compost/");
        System.out.println("https://www.sustainability.vic.gov.au/You-and-Your-Home/Waste-and-recycling/Recycling/Why-recycle");
    }

    @Override
    public void Tips(){
        System.out.print("https://www.epa.gov/recycle/recycling-basics");

    }
}
