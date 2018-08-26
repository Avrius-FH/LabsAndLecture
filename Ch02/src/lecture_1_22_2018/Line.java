package lecture_1_22_2018;

/**
 * <purpose>
 * 1/22/2018
 * @author flh250
 */
public class Line {
   public static void main(String[] args) {
      double piVal = Math.PI;
      double sphereVolume;
      double sphereRadius;

      sphereRadius = 1.0;

      sphereVolume = (4.0/3.0) * (piVal * Math.pow(sphereRadius, 3));

      System.out.print(sphereVolume);

   }
}
