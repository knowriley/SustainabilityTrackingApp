//package Tests;
//
//import model.Food;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class TestFood {
//    private Food testFood;
//
//    @BeforeEach
//    public void before(){
//        testFood = new Food();
//    }
//
//    @Test
//    public void testConstructor(){
//        assertFalse(testFood.getOptionA());
//        assertFalse(testFood.getType());
//        assertEquals(testFood.getPoints(), 0);
//
//    }
//
//    @Test
//    public void testSetOptionA(){
//        testFood.getOptionA();
//        assertFalse(testFood.getOptionA());
//        testFood.setType(true);
//        assertTrue(testFood.getOptionA());
//    }
//
//    @Test
//    public void testSetOptionB(){
//        testFood.getType();
//        assertFalse(testFood.getType());
//        testFood.setOptionB(true);
//        assertTrue(testFood.getType());
//    }
//}
