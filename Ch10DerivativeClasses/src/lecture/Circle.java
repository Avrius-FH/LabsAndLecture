package lecture;

public class Circle {

   private double radius;

   public Circle(double radius) {
     setRadius(radius);
   }

   public void setRadius(double radius) {
      if ( radius >= 0) {
         this.radius = radius;
      }
   }


   public double getRadius() {

      return radius;
   }

   public Circle() {
      this (0);

   }
}
