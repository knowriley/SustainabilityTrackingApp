package Observers;


import model.User.User;

public class MiddleMan implements Observer{

    public MiddleMan() {
    }

    @Override
    public void update(Subject s) {
        if (s instanceof User) {
        System.out.println((((User) s).getName() + "Has told its followers that they earned points!"));
        }
    }
}
