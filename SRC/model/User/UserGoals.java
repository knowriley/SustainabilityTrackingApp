package model.User;

import Exceptions.NoEasyGoalException;
import Exceptions.TooManyGoalsException;
import model.Goal;

import java.util.ArrayList;
import java.util.List;

public class UserGoals {
    User user;
    private List<Goal> goals;

    public UserGoals(User u){
        this.user = u;
        goals = new ArrayList<>();
    }

    public void addGoal(Goal g) throws TooManyGoalsException, NoEasyGoalException {
        if (g.getPointGoal() <= 0) {
            throw new NoEasyGoalException();
        }
        if (goals.size() >= 3){
            throw new TooManyGoalsException();
        }
        goals.add(g);
    }

    public void removeGoal(Goal g) {
        goals.remove(g);
    }

}
