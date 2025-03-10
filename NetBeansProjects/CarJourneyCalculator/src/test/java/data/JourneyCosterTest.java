/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package data;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ayobami7
 * car journey calculator
 * 10 March 2025
 */
public class JourneyCosterTest {

    /**
     * To test addPropertyChangeListener method, see steps #1 and #2 
     * Step #1
     * First declare an inner class called MockPropertyChangeListener which implements PropertyChangeListener.
     * There are three methods in the inner class, override propertyChange(); isPropertyChangeCalled(); getEvent().
     * This inner class acts as a "mock" implementation of PropertyChangeListener.
     * Use an instance of MockPropertyChangeListener to track whether propertyChange() method was called and to inspect the event passed to it.
     * 
     */
    
    //Inner class to serve as a mock implementation of PropertyChangeListener
    private class MockPropertyChangeListener implements PropertyChangeListener{
        private boolean PropertyChangeCalled = false;
        private PropertyChangeEvent event;
        
        //set PropertyChangeCalled to true when property change event occurs
        //capture the property change event when it is called
        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            PropertyChangeCalled = true;
            event = evt;
        }
        
        //returns true if the propertyChange method was called
        public boolean isPropertyChangeCalled(){
            return PropertyChangeCalled;
        }
        
        //returns the event that triggered propertyChange
        public PropertyChangeEvent getEvent(){
            return event;
        }    
    }
    /**
     * Step #2
     * Second, refactor the testSetJourneyValues() unit test. 
     * Follow comments below
     */
    @Test
    public void testAddPropertyChangeListener() {
        System.out.println("addPropertyChangeListener");
        //Create an instance of MockPropertyChangeListener
        MockPropertyChangeListener mpcl = new MockPropertyChangeListener();
        
        //Create an instance of JourneyCalculator
        JourneyCoster jc = new JourneyCoster();
        
        //Add the MockPropertyChangeListener to JourneyCalculator
        jc.addPropertyChangeListener(mpcl);
        
        //Call setJourneyValues() and pass hard values
        jc.setJourneyValues("41.6", "1.40", "68");
        
        //Check that propertyChange() method was called
        assertTrue(mpcl.isPropertyChangeCalled());

        //Use assertEquals to test each of the four parameters of the pcl
        //contains the expected property name
        assertEquals("costs", mpcl.getEvent().getPropertyName());
        
        //contains the expected source
        assertEquals(jc, mpcl.getEvent().getSource());
        
        //contains the expected old value, which is Null
        assertNull(mpcl.getEvent().getOldValue());
        
        //contains the expected new value
        assertEquals(jc.toString(), mpcl.getEvent().getNewValue());                  
    }

    /**
     * Test of setJourneyValues method, of class JourneyCoster.
     * CORRECT INPUTS
     * 
     * Test #1:
     * Instantiate jc and pass hard values to setJourneyValues.
     * AssertEquals with expected values are compared to outputs from setJourneyValues.
     * 
     * Test #2:
     * Decare a string of expected output including the expected calculated cost.
     * AssertEquals to compare this string to output from setJourneyValues.
     * This will check the correct use of placeholders representing distance, price, mpg and total cost.
     */
    
    @Test
    public void testSetJourneyValues_CorrectInput() {
        System.out.println("setJourneyValues");
        JourneyCoster jc = new JourneyCoster();
  
        jc.setJourneyValues("41.6", "1.40", "68");
            
        //test #1
        assertEquals(68.0F,jc.getMiles(),0);
        assertEquals(41.6F,jc.getMpg(),0);
        assertEquals(1.40F,jc.getPricePerLitre(),0);
        
        //test #2
        String expectedString = "68 miles @ £1.40 per litre at 41.6 mpg costs £10.40";
        assertEquals(expectedString,String.valueOf(jc));
    }
    
    /**
     * Test of setJourneyValues method, of class JourneyCoster.
     * WRONG INPUTS
     * 
     * Explanation of: "Throwable exception = assertThrows(IllegalArgumentException.class, () -> 
                       {jc.setJourneyValues("41.6", "1.40", null);});"
     *  Works for JUnit5 upwards.
     *  assertThrows() verify that the specified exception is thrown when Miles is null value.
     *  The specified exception is IllegalArgumentException. 
     *  The lambda expression: () -> {jc.setJourneyValues("41.6", "1.40", null);} 
     *          represents the code that is expected to throw an exception.
     *  If the exception is thrown, it is assigned to variable "exception".
     *  assertNotNull checks if the exception variable is not null. 
     *      If an IllegalArgumentException is thrown, the exception variable will not be null, and the test will pass. 
     *      If IllegalArgumentException is not thrown, the exception variable will remain null, and the test will fail.
    */
    
    /**
     * The following set of tests to check incorrect inputs
     * The test name and hard values indicates what is being tested
     */
    
    @Test
    public void testSetJourneyValues_NullMiles() {
        JourneyCoster jc = new JourneyCoster();
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> 
            {jc.setJourneyValues("41.6", "1.40", null);});
        assertNotNull(exception);
    }
    
    @Test
    public void testSetJourneyValues_NullMpg() {
        JourneyCoster jc = new JourneyCoster();
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> 
            {jc.setJourneyValues(null, "1.40", "68");});
        assertNotNull(exception);
    }
    
    @Test 
    public void testSetJourneyValues_NullPricePerLitre() {
        JourneyCoster jc = new JourneyCoster();
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> 
            {jc.setJourneyValues("41.6", null, "68");});
        assertNotNull(exception);    
    }
    
   @Test 
    public void testSetJourneyValues_InvalidMiles() {
        JourneyCoster jc = new JourneyCoster();
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> 
            {jc.setJourneyValues("41.6", "1.40", "$$363");});
        assertNotNull(exception);
    } 
    
    @Test 
    public void testSetJourneyValues_InvalidMpg() {
        JourneyCoster jc = new JourneyCoster();
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> 
            {jc.setJourneyValues("forty-one", "1.40", "68");});
        assertNotNull(exception); 
    }
    
    @Test 
    public void testSetJourneyValues_InvalidPricePerLitre() {
        JourneyCoster jc = new JourneyCoster();
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> 
            {jc.setJourneyValues("41.6", "zero", "68");});
        assertNotNull(exception);
    }
    
    @Test 
    public void testSetJourneyValues_NegativeMiles() {
        JourneyCoster jc = new JourneyCoster();
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> 
            {jc.setJourneyValues("41.6", "1.40", "-5");});
        assertNotNull(exception);
    }
    
    @Test 
    public void testSetJourneyValues_NegativeMpg() {
        JourneyCoster jc = new JourneyCoster();
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> 
            {jc.setJourneyValues("-41.6", "1.40", "68");});
        assertNotNull(exception);;
    }
    
    @Test 
    public void testSetJourneyValues_NegativePricePerLitre() {
        JourneyCoster jc = new JourneyCoster();
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> 
            {jc.setJourneyValues("41.6", "-1.40", "68");});
        assertNotNull(exception);
    }
   
    /**
     * Test of GetMpg method, of class JourneyCoster.
     * Set expResult to hard value.
     * Pass same value as parameter to getter method
     * Compare expResult to output from getter method
     * This test ensures that values are not changed during computation and calculation is carried out correctly.
     * 
     * Explanation of the 3rd parameter in assertEquals:
     *      This is known as "delta".
     *      It is the maximum difference allowed between the expected and actual values. 
     *      It represents the tolerance level for the comparison which is important given floating point arithmetic. 
     *      0 means exact equality. 0.02 etc. means a tolerance or variation.
     */
    @Test
    public void testGetMpg() {
        JourneyCoster jc = new JourneyCoster();
        double expResult = 39.2F;
        jc.setMpg(39.2F);
        double result = jc.getMpg();
        assertEquals(expResult,result);
    }

    /**Test of GetMiles method, of class JourneyCoster.
     * Set expected to hard value
     * pass same value as parameter to getter method
     * compare expected to output from getter method
     * this test ensures that values are not changed in anyway
     * and calculation is carried out correctly.
     * 
     * The 3rd parameter in assertEquals is delta: this is the maximum difference allowed between the expected and actual values. 
     * It represents the tolerance level for the comparison which is important given floating point arithmetic. 
     * 0 means exact equality. 0.02 means a tolerance or variation.
     */
    @Test
    public void testGetMiles() {
        JourneyCoster jc = new JourneyCoster();
        float expResult = 68;
        jc.setMiles(68);
        double result = jc.getMiles();
        assertEquals(expResult,result);
    }

    /**
     * Test of getPricePerLitre method, of class JourneyCoster.
     * Set expected to hard value
     * pass same value as parameter to getter method
     * compare expected to output from getter method
     * this test ensures that values are not changed in anyway
     * and calculation is carried out correctly.
     * 
     * The 3rd parameter in assertEquals is delta: this is the maximum difference allowed between the expected and actual values. 
     * It represents the tolerance level for the comparison which is important given floating point arithmetic. 
     * 0 means exact equality. 0.02 means a tolerance or variation.
     */
    @Test
    public void testGetPricePerLitre() {
        JourneyCoster jc = new JourneyCoster();
        jc.setPricePerLitre(1.20F);
        float expPrice = 1.20F;
        float result = jc.getPricePerLitre();
        
        assertEquals(expPrice, result);
    }

    /**
     * Removed the test for ToString
     */
    
    /**
     * Removed tests for setters
     */
}