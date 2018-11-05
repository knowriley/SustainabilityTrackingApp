package Tests;

import Exceptions.NoEasyGoalException;
import Exceptions.TooManyGoalsException;
import model.Goal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import model.User.User;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestUser {
    User testUser1;
    User testUser2;
    Goal testGoal1 = new Goal("food", 10);
    Goal testGoal2 = new Goal("transportation", 47);
    Goal testGoal3 = new Goal("food", 0);
    Goal testGoal4 = new Goal("transportation", 1000);
    //TODO: make an exception where u cannot have more than one goal of the same type

//    @BeforeEach
//    public void testSetUp(){
//        testUser1 = new User();
//        testUser2 = new User();
//    }
//
//    @Test
//    public void testAddGoalPerfect(){
//        testUser1.getGoals().add(testGoal1);
//        testUser1.getGoals().add(testGoal2);
//        assertEquals(2, testUser1.getGoals().size());
//        try {testUser1.getGoals().addGoal(testGoal4);
//        } catch (NoEasyGoalException e){
//            fail("This exception was not supposed to be caught.");
//        }catch (TooManyGoalsException e) {
//            fail("This exception was not supposed to be caught.");
//        }
//        assertEquals(3, testUser1.getGoals().size());
//
//    }
//
//    @Test
//    public void testAddGoalTooMany(){
//        testUser1.getGoals().add(testGoal1);
//        testUser1.getGoals().add(testGoal2);
//        testUser1.getGoals().add(testGoal3);
//        assertEquals(3, testUser1.getGoals().size());
//        try {testUser1.addGoal(testGoal4);
//        } catch (NoEasyGoalException e) {
//            fail("This exception was not supposed to be caught.");
//        } catch (TooManyGoalsException e) {
//
//        }
//        assertEquals(3, testUser1.getGoals().size());
//    }
//
//    @Test
//    public void testAddGoalTooEasy(){
//        testUser1.getGoals().add(testGoal1);
//        assertEquals(1, testUser1.getGoals().size());
//        try {testUser1.addGoal(testGoal3);
//        } catch (NoEasyGoalException e) {
//
//        } catch (TooManyGoalsException e) {
//            fail("This exception was not supposed to be caught.");
//        }
//        assertEquals(1, testUser1.getGoals().size());
//    }
//
//    @Test
//    public void testAddGoalTooEasyAndTooMany(){
//        testUser1.getGoals().add(testGoal1);
//        testUser1.getGoals().add(testGoal2);
//        testUser1.getGoals().add(testGoal3);
//        assertEquals(3, testUser1.getGoals().size());
//        try {testUser1.addGoal(testGoal3);
//        } catch (NoEasyGoalException e) {
//
//        } catch (TooManyGoalsException e) {
//            fail("This exception was not supposed to be caught.");
//        }
//        assertEquals(3, testUser1.getGoals().size());
//    }
//

}
