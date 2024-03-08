/**
 * QuatrefoilList class test.
 * 
 * Project 8
 * @author Neil Correia
 * Version 5/2/2023
 */
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Class that tests QuatrefoilList.
 */ 
public class QuatrefoilListTest {
   private Quatrefoil[] test = new Quatrefoil[5];
   private int size = 0;

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   

   /**
    * Tests getName method.
    */
   @Test public void getNameTest() {
      QuatrefoilList testt = new QuatrefoilList("Ex", test, 1);
      Assert.assertEquals("Ex", testt.getName());
   
   }
   /**
    * Tests numberOfQuatrefoils method.
    */
   @Test public void numberOfQuatrefoilsTest() {
      QuatrefoilList qff = new QuatrefoilList("Ex", test, 1);
      Assert.assertEquals(1, qff.numberOfQuatrefoils());
   }
   /**
    * Tests totalDiameters method.
    */
   @Test public void totalDiametersTest() {
      Quatrefoil test1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil test2 = new Quatrefoil("Medium Example", 38.44);
      Quatrefoil test3 = new Quatrefoil("Large Example", 111.4);
      test[0] = test1;
      test[1] = test2;
      test[2] = test3;
      QuatrefoilList qf1 = new QuatrefoilList("Ex", test, 3);
      QuatrefoilList qf2 = new QuatrefoilList("Ex", test, 0);
      Assert.assertEquals(153.34, qf1.totalDiameters(), 0.00001);
      Assert.assertEquals(0, qf2.totalDiameters(), 0.00001);
   }
   /**
    * Tests totalPerimeters method.
    */
   @Test public void totalPerimetersTest() {
      Quatrefoil test1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil test2 = new Quatrefoil("Medium Example", 38.44);
      Quatrefoil test3 = new Quatrefoil("Large Example", 111.4);
      test[0] = test1;
      test[1] = test2;
      test[2] = test3;
      QuatrefoilList qf1 = new QuatrefoilList("Ex", test, 3);
      QuatrefoilList qf2 = new QuatrefoilList("Ex", test, 0);
      Assert.assertEquals(481.732, qf1.totalPerimeters(), 0.001);
      Assert.assertEquals(0, qf2.totalPerimeters(), 0.001);
   }
   /**
    * Tests totalAreas method.
    */
   @Test public void totalAreasTest() {
      Quatrefoil test1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil test2 = new Quatrefoil("Medium Example", 38.44);
      Quatrefoil test3 = new Quatrefoil("Large Example", 111.4);
      test[0] = test1;
      test[1] = test2;
      test[2] = test3;
      QuatrefoilList qf1 = new QuatrefoilList("Ex", test, 3);
      QuatrefoilList qf2 = new QuatrefoilList("Ex", test, 0);
      Assert.assertEquals(8933.417, qf1.totalAreas(), 0.001);
      Assert.assertEquals(0, qf2.totalAreas(), 0.001);
   }
   /**
    * Tests averageDiameter method.
    */
   @Test public void averageDiameterTest() {
      Quatrefoil test1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil test2 = new Quatrefoil("Medium Example", 38.44);
      Quatrefoil test3 = new Quatrefoil("Large Example", 111.4);
      test[0] = test1;
      test[1] = test2;
      test[2] = test3;
      QuatrefoilList qf1 = new QuatrefoilList("Ex", test, 3);
      QuatrefoilList qf2 = new QuatrefoilList("Ex", test, 0);
      Assert.assertEquals(51.113, qf1.averageDiameter(), 0.001);
      Assert.assertEquals(0, qf2.averageDiameter(), 0.001);
   }
   /**
    * Tests averagePerimeter method.
    */
   @Test public void averagePerimeterTest() {
      Quatrefoil test1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil test2 = new Quatrefoil("Medium Example", 38.44);
      Quatrefoil test3 = new Quatrefoil("Large Example", 111.4);
      test[0] = test1;
      test[1] = test2;
      test[2] = test3;
      QuatrefoilList qf1 = new QuatrefoilList("Ex", test, 3);
      QuatrefoilList qf2 = new QuatrefoilList("Ex", test, 0);
      Assert.assertEquals(160.577, qf1.averagePerimeter(), 0.001);
      Assert.assertEquals(0, qf2.averagePerimeter(), 0.001);
   }
   /**
    * Tests averageArea method.
    */
   @Test public void averageAreaTest() {
      QuatrefoilList qf1 = new QuatrefoilList("Ex", test, 0);
      QuatrefoilList qf2 = new QuatrefoilList("Ex", test, 0);
      qf1.addQuatrefoil("Small Example", 3.5);
      qf1.addQuatrefoil("Medium Example", 38.44);
      qf1.addQuatrefoil("Large Example", 111.4);
      Assert.assertEquals(2977.806, qf1.averageArea(), 0.001);
      Assert.assertEquals(0, qf2.averageArea(), 0.001);
   }
   /**
    * Tests toString method.
    */
   @Test public void toStringTest() {
      Quatrefoil test1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil test2 = new Quatrefoil("Medium Example", 38.44);
      Quatrefoil test3 = new Quatrefoil("Large Example", 111.4);
      test[0] = test1;
      test[1] = test2;
      test[2] = test3;
      QuatrefoilList qf1 = new QuatrefoilList("Ex", test, 3);
      Assert.assertTrue(qf1.toString().contains("Number of Quatrefoils: 3"));
   }
   /**
    * Tests getList method.
    */
   @Test public void getList() {
      Quatrefoil test1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil test2 = new Quatrefoil("Medium Example", 38.44);
      Quatrefoil test3 = new Quatrefoil("Large Example", 111.4);
      test[0] = test1;
      test[1] = test2;
      test[2] = test3;
      QuatrefoilList qf1 = new QuatrefoilList("Ex", test, 3);
      Assert.assertEquals(test, qf1.getList());
   }
   /** 
    * Tests findQuatrefoil method.
    */
   @Test public void findQuatrefoilTest() {
      Quatrefoil test1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil test2 = new Quatrefoil("Medium Example", 38.44);
      Quatrefoil test3 = new Quatrefoil("Large Example", 111.4);
      test[0] = test1;
      test[1] = test2;
      test[2] = test3;
      QuatrefoilList qf1 = new QuatrefoilList("Ex", test, 3);
      Assert.assertEquals(test1, qf1.findQuatrefoil("Small Example"));
      Assert.assertEquals(null, qf1.findQuatrefoil("Hello"));
   }
   /**
    * Tests deleteQuatrefoil method.
    */
   @Test public void deleteQuatrefoilTest() {
      Quatrefoil test1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil test2 = new Quatrefoil("Medium Example", 38.44);
      Quatrefoil test3 = new Quatrefoil("Large Example", 111.4);
      test[0] = test1;
      test[1] = test2;
      test[2] = test3;
      QuatrefoilList qf1 = new QuatrefoilList("Ex", test, 3);
      Assert.assertEquals(test1, qf1.deleteQuatrefoil("Small Example"));
      Assert.assertEquals(null, qf1.deleteQuatrefoil("Hello"));
   }
   /**
    * Tests editQuatrefoil method.
    */
   @Test public void editQuatrefoilTest() {
      Quatrefoil test1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil test2 = new Quatrefoil("Medium Example", 38.44);
      Quatrefoil test3 = new Quatrefoil("Large Example", 111.4);
      test[0] = test1;
      test[1] = test2;
      test[2] = test3;
      QuatrefoilList qf1 = new QuatrefoilList("Ex", test, 3);
      Assert.assertEquals(true, qf1.editQuatrefoil("Small Example", 1));
      Assert.assertEquals(false, qf1.editQuatrefoil("Hello", 1));
   }
   /**
    * Tests largestDiameter method.
    */
   @Test public void largestDiameterTest() {
      QuatrefoilList qf1 = new QuatrefoilList("Ex", test, 0);
      qf1.addQuatrefoil("Small Example", 3.5);
      qf1.addQuatrefoil("Medium Example", 38.44);
      qf1.addQuatrefoil("Large Example", 111.4);
      Assert.assertEquals("hello", test[2], 
             qf1.findQuatrefoilWithLargestDiameter());
   }
   /**
    * Tests largestDiameter method.
    */
   @Test public void largestDiameterTest2() {
      QuatrefoilList qf1 = new QuatrefoilList("Ex", test, 0);
      qf1.addQuatrefoil("Small Example", 3.5);
      qf1.addQuatrefoil("Medium Example", 111.4);
      qf1.addQuatrefoil("Large Example", 38.44);
      Assert.assertEquals("hello", test[1], 
             qf1.findQuatrefoilWithLargestDiameter());
   }
   /**
    * Tests largestDiameter method.
    */
   @Test public void largestDiameterTest3() {
      QuatrefoilList qf1 = new QuatrefoilList("Ex", test, 0);
      Assert.assertEquals("hello", null, 
             qf1.findQuatrefoilWithLargestDiameter());
   }
}
