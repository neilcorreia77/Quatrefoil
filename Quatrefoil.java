import java.text.DecimalFormat;
/**
 * Program creates Quatrefoil.
 * @author Neil Correia
 * @version 3/17/2023
 **/
public class Quatrefoil {
   // instance variables
   private String label = "";
   private double diameter = 0;
   private static int count = 0;
   
   // constructor
   /**
    * Creates constructor.
    * @param labelIn input Str
    * @param diameterIn input double
    **/
   public Quatrefoil(String labelIn, double diameterIn) {
      setLabel(labelIn);
      setDiameter(diameterIn);
      count++;
   }
   
   // methods 
   /**
    * gets label.
    * @return Str label
    */
   public String getLabel() {
      return label;
   }
   /**
    * Sets label.
    * @param labelIn input String
    * @return boolean
    **/
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isSet = true;
      }
      return isSet;
   }
   /**
    * Gets diameter.
    * @return double diameter
    **/
   public double getDiameter() {
      return diameter;
   }
   /**
    * Sets diameter.
    * @param diameterIn input double
    * @return boolean
    **/
   public boolean setDiameter(double diameterIn) {
      boolean isSet = false;
      if (diameterIn >= 0) {
         diameter = diameterIn;
         isSet = true;
      }
      return isSet;
   }
   /**
    * Finds perimeter of Quatrefoil.
    * @return perimeter
    **/
   public double perimeter() {
      double answer = Math.PI * diameter;
      return answer;
   }
   /**
    * Finds perimeter of Quatrefoil in feet.
    * @return perimeter in feet
    **/
   public double perimeterInFt() {
      double answer = perimeter() / 12;
      return answer;
   }
   /**
    * Finds area of Quatrefoil.
    * @return area
    **/
   public double area() {
      double answer = (Math.pow((getDiameter() / 2), 2) + 2
         * (Math.PI * Math.pow((getDiameter() / 2), 2) / 4));
      return answer;
   }
   /**
    * Finds area of Quatrefoil in square feet.
    * @return area in square feet
    **/
   public double areaInSqFt() {
      double answer = area() / 144;
      return answer;
   }
   /**
    * output toString.
    * @return output
    **/
   public String toString() {
      DecimalFormat decimalFormat = new DecimalFormat("#,##0.0##");
      String output = "Quatrefoil " + "\"" + label + "\"" 
               + " with diameter "
               + diameter + " inches "
               + "has:\n\t";
      output += "\tperimeter = " + decimalFormat.format(perimeter())
               + " inches (or " + decimalFormat.format(perimeterInFt()) + " feet)\n";
      output += "\tarea = " + decimalFormat.format(area()) 
               + " square inches (or " + decimalFormat.format(areaInSqFt()) 
               + " square feet)";
      return output;
   }
   /**
    * Get variable count.
    * @return count
    **/
   public static int getCount() {
      return count;
   }
   /**
    * Resets count.
    **/
   public static void resetCount() {
      count = 0;
   }
   /**
    * Compares input to qf.
    * @param obj compared to Quatrefoil
    * @return boolean
    **/
   public boolean equals(Object obj) {
      if (!(obj instanceof Quatrefoil)) {
         return false;
      }
      else {
         Quatrefoil qf = (Quatrefoil) obj;
         return (label.equalsIgnoreCase(qf.getLabel())
                  && Math.abs(diameter - qf.getDiameter()) < .000001);         
      } 
   
   }
   /**
    * Equals method.
    * @return int 0
    **/
   public int hashCode() {
      return 0;
   }
   
   /**
    * Compares qff types
    * @param qff is type Quatrefoil
    * @return + - or 0 int
    */
   
   public int compareTo(Quatrefoil qff) {
      if (Math.abs(this.area() - qff.area()) < 0.000001) {
         return 0;
      } else if (this.area() < qff.area()) {
         return -1;
      } else {
         return 1;
      }
      
   
   }
}