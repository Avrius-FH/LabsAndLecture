package lecture;

public class ColoredCircle extends Circle {

   private String color;  // color of the circle

   public ColoredCircle(double radius, String color) {
      super(radius);           // constructor from circle
      setColor(color);
   }

   @Override
   public String toString() {
      return "ColoredCircle{" +
          "color='" + color + '\'' +
          "} " + super.toString();
   }


   public String getColor() {

      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }
}
