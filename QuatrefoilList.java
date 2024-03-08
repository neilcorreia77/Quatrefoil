/**
 * QuatrefoilList class.
 * 
 * Project 8
 * @author Neil Correia
 * Version 4/29/2023
 */
import java.text.DecimalFormat;
/**
 * Program contains Quatrefoil methods.
 * @author Neil Correia
 * @version 3/30/2023
 */
public class QuatrefoilList {
   // instance variables
   private String name;
   private Quatrefoil[] object;
   private int numberObjects;
   /**
    * Constructor of program.
    * @param nameIn is String
    * @param objectIn is Quatrefoil[]
    * @param numberObjectsIn is int
    */
   public QuatrefoilList(String nameIn, Quatrefoil[] objectIn,
         int numberObjectsIn) {
      name = nameIn;
      object = objectIn;
      numberObjects = numberObjectsIn;
   }
   /**
    * Gets name.
    * @return name
    */
   public String getName() {
      return name;
   }
   /**
    * Returns third field's value in QuatrefoilList.
    * @return numberObjects
    */
   public int numberOfQuatrefoils() {
      return numberObjects;
   }
   /**
    * Returns total diameter.
    * @return diameter
    */
   public double totalDiameters() {
      double diameter = 0;
      int index = 0;
      while (index < numberObjects) {
         Quatrefoil total = object[index];
         diameter += total.getDiameter();
         index++;
      }
      return diameter;
   }
   /**
    * Returns total perimeter.
    * @return perimeter
    */
   public double totalPerimeters() {
      double perimeter = 0;
      int index = 0;
      while (index < numberObjects) {
         Quatrefoil total = object[index];
         perimeter += total.perimeter();
         index++;
      }
      return perimeter;
   
   }
   /**
    * Returns total Area.
    * @return area
    */
   public double totalAreas() {
      double area = 0;
      int index = 0;
      while (index < numberObjects) {
         Quatrefoil total = object[index];
         area += total.area();
         index++;
      }
      return area;
   
   }
   /**
    * Returns average diameter.
    * @return average
    */
   public double averageDiameter() {
      double average = 0;
      int index = 0;
      while (index < numberObjects) {
         Quatrefoil qf = object[index];
         average = totalDiameters() / numberObjects;
         index++;
      }
      return average; 
   }
   /**
    * Returns average perimeter.
    * @return average
    */
   public double averagePerimeter() {
      double average = 0;
      int index = 0;
      while (index < numberObjects) {
         Quatrefoil qf = object[index];
         average = totalPerimeters() / numberObjects;
         index++;
      }
      return average; 
   }
   /**
    * Returns average area.
    * @return average
    */
   public double averageArea() {
      double average = 0;
      int index = 0;
      while (index < numberObjects) {
         Quatrefoil qf = object[index];
         average = totalAreas() / numberObjects;
         index++;
      }
      return average; 
   }
   /**
    * Returns string.
    * @return str
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String str = "----- Summary for " + name + " -----"
         + "\nNumber of Quatrefoils: " + numberObjects
         + "\nTotal Diameters: " + df.format(totalDiameters()) + " inches"
         + "\nTotal Perimeters: " + df.format(totalPerimeters()) + " inches"
         + "\nTotal Areas: " + df.format(totalAreas()) + " square inches"
         + "\nAverage Diameter: " + df.format(averageDiameter()) + " inches"
         + "\nAverage Perimeter: " + df.format(averagePerimeter()) + " inches"
         + "\nAverage Area: " + df.format(averageArea()) + " square inches";
      return str;
   }
   /**
    * Gets Quatrefoil list.
    * @return object
    */
   public Quatrefoil[] getList() {
      return object;
   }
   /**
    * Creates quatrefoil object from parameters.
    * @param label string
    * @param diameter double 
    */
   public void addQuatrefoil(String label, double diameter) {
      Quatrefoil qf = new Quatrefoil(label, diameter);
      object[numberObjects] = qf;
      numberObjects++;
   }
   /**
    * Takes parameter and creates Quatrefoil.
    * @param labelIn string
    * @return null
    */
   public Quatrefoil findQuatrefoil(String labelIn) {
      Quatrefoil r = null;
      for (int i = 0; i < numberObjects; i++) {
         if ((object[i].getLabel()).equalsIgnoreCase(labelIn)) {
            r = object[i];
            break;
         }
      
      }
      return r;
   }
   /**
    * Deletes object from array.
    * @param label string
    * @return null
    */
   public Quatrefoil deleteQuatrefoil(String label) {
      Quatrefoil newObject = null;
      for (int i = 0; i < numberObjects; i++) {
         if (label.equalsIgnoreCase(object[i].getLabel())) {
            newObject = object[i];
            for (int j = i; j < numberObjects - 1; j++) {
               object[j] = object[j + 1];
            }
            object[numberObjects - 1] = null;
            numberObjects--;
            return newObject;
         }
      }
      return null;
   }
   /**
    * Edits Quatrefoil.
    * @param label String
    * @param diameter double
    * @return boolean
    */
   public boolean editQuatrefoil(String label, double diameter) {
      for (int i = 0; i < numberObjects; i++) {
         if (object[i].getLabel().equalsIgnoreCase(label)) {
            object[i].setDiameter(diameter);
            return true;
         }
      }
      return false; 
   }
   /**
    * Finds Quatrefoil with largest diameter.
    * @return null
    */
   public Quatrefoil findQuatrefoilWithLargestDiameter() {
      int i = 0;
      int j = 0;
      if (numberObjects == 0) {
         return null;
      }
      while (j < numberObjects) {
         if (object[j].getDiameter() > object[i].getDiameter()) {
            i = j;
         }
         j++;
      }
      return object[i];
   }
   
   
}