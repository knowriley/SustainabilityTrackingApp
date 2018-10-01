//package Tests;
//
//import model.Transportation;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class TestTransportation {
//    private Transportation testTransportation;
//
//    @BeforeEach
//    public void before(){
//        testTransportation = new Transportation();
//    }
//
//    @Test
//    public void testConstructor(){
//        assertFalse(testTransportation.getOptionA());
//        assertFalse(testTransportation.getType());
//        assertEquals(testTransportation.getPoints(), 0);
//    }
//
//    @Test
//    public void testSetOptionA(){
//        testTransportation.getOptionA();
//        assertFalse(testTransportation.getOptionA());
//        testTransportation.setType(true);
//        assertTrue(testTransportation.getOptionA());
//    }
//
//    @Test
//    public void testSetOptionB(){
//        testTransportation.getType();
//        assertFalse(testTransportation.getType());
//        testTransportation.setOptionB(true);
//        assertTrue(testTransportation.getType());
//    }
//
//
//}
//
