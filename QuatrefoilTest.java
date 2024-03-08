import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 * Tests methods of Quatrefoil class.
 * @author Neil Correia
 * @version 3/17/2023
 **/
public class QuatrefoilTest {
   

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
    * Tests setLabel method.
    */
   @Test public void setLabelTest() { 
      Quatrefoil qf = new Quatrefoil("Small Example", 3.5);
      Assert.assertTrue(" ", qf.setLabel(" Medium Example"));
      Assert.assertTrue(" ", qf.getLabel().contains("Medium Example"));
      Assert.assertFalse(" ", qf.setLabel(null));
   }
   
   /**
    * Tests setDiameter method.
    */
   @Test public void setDiameterTest() {
      Quatrefoil qf = new Quatrefoil("Small Example", 3.5);
      Assert.assertTrue(" ", qf.setDiameter(0.1));
      Assert.assertTrue(" ", qf.setDiameter(0));
      Assert.assertFalse(" ", qf.setDiameter(-0.1));
      Assert.assertEquals(" ", 0, qf.getDiameter(), .00001);
   }
   /**
    * Tests perimeter method.
    **/
   @Test public void perimeterTest() {
      Quatrefoil qf = new Quatrefoil("Small Example", 3.5);
      Assert.assertEquals(" ", 10.995574, qf.perimeter(), .00001);
   }
   /**
    * Tests perimeterInFt method.
    **/
   @Test public void perimeterInFtTest() {
      Quatrefoil qf = new Quatrefoil("Small Example", 3.5);
      Assert.assertEquals(" ", 0.916297, qf.perimeterInFt(), .00001);
   }
   /**
    * Tests area method.
    **/
   @Test public void areaTest() {
      Quatrefoil qf = new Quatrefoil("Small Example", 3.5);
      Assert.assertEquals(" ", 7.873063, qf.area(), .00001);
   }
   /**
    * Tests areaInSqFt method.
    **/
   @Test public void areaInSqFtTest() {
      Quatrefoil qf = new Quatrefoil("Small Example", 3.5);
      Assert.assertEquals(" ", 0.054674, qf.areaInSqFt(), .00001);
   }
   /**
    * Tests toString method.
    **/ 
   @Test public void toStringTest() {
      Quatrefoil qf = new Quatrefoil("Small Example", 3.5);
      Assert.assertTrue(" ", qf.toString().contains("Small Example"));    
   }
   /**
    * Tests getCount method.
    **/
   @Test public void getCountTest() {
      Quatrefoil.resetCount();
      Quatrefoil qf = new Quatrefoil("Small  Example", 3.5);
      Quatrefoil qf2 = new Quatrefoil(" Medium Example ", 38.44);
      Assert.assertEquals(" ", 2, qf.getCount());
   }
   /**
    * Tests resetCount method.
    **/  
   @Test public void resetCountTest() {
      Quatrefoil.resetCount();
      Quatrefoil qf = new Quatrefoil("Small Example", 3.5);
      Quatrefoil qf2 = new Quatrefoil("Medium Example", 38.44);
      qf.resetCount();
      Assert.assertEquals(" ", 0, qf.getCount());
   }
   /**
    * Tests equalsTest method.
    **/
   @Test public void equalsTest() {
      Quatrefoil qf = new Quatrefoil("Small Example", 3.5);
      String qf2 = "hi";
      Quatrefoil qf3 = new Quatrefoil("Medium Example", 38.44);
      Quatrefoil qf4 = new Quatrefoil("Small Example", 0.2);
      Quatrefoil qf5 = new Quatrefoil("Small Example", 0.5);
      Quatrefoil qf6 = new Quatrefoil("Small Example", 3.5);
      Assert.assertFalse(" ", qf.equals(qf2));
      Assert.assertFalse(" ", qf.equals(qf3));
      Assert.assertFalse(" ", qf.equals(qf4));
      Assert.assertFalse(" ", qf.equals(qf5));
      Assert.assertTrue(" ", qf.equals(qf6));
   }
   /**
    * Tests hashCode method.
    **/
   @Test public void hashCodeTest() {
      Quatrefoil qf = new Quatrefoil("Small Example", 3.5);
      Assert.assertEquals(" ", 0, qf.hashCode());
   }
   
   /**
    * Tests compareTo().
    */
   @Test public void comparetoTest() {
      Quatrefoil qff1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil qff2 = new Quatrefoil(" Medium Example ", 38.44);
      Quatrefoil qff3 = new Quatrefoil("Small Example", 3.5);
      
      Assert.assertEquals(" ", 0, qff1.compareTo(qff3));
      Assert.assertEquals(" ", -1, qff1.compareTo(qff2));
      Assert.assertEquals(" ", 1, qff2.compareTo(qff3));
   
      
   
   
   }
   
}
