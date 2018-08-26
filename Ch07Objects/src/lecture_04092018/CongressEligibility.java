package lecture_04092018;

/**
 * <purpose>
 * 4/9/2018
 * @author flh250
 */
public class CongressEligibility {
   private int age;
   private int yearsCitizen ;
   public static final int SENATE_AGE_MIN = 30 ;
   public static final int SENATE_YEARS_CITIZEN = 9 ;
   public static final int HOUSE_YEARS_CITIZEN = 7 ;
   public static final int HOUSE_AGE_MIN = 25 ;

   public void setAge(int personAge) {
      if (personAge >= 0)
      age = personAge ;

   }

   public void setYearsCitizen (int years ) {
      if (years >= 0){
         yearsCitizen = years ;
      }

   }

   public int getAge () {

      return age ;
   }

   public int getYearsCitizen () {
      return yearsCitizen ;
   }

   public boolean isSenateEligible () {
      return age >= SENATE_AGE_MIN && yearsCitizen >= SENATE_YEARS_CITIZEN ;

   }

   public boolean isHouseEligible () {
      return (age >= HOUSE_AGE_MIN && yearsCitizen >= HOUSE_YEARS_CITIZEN) ;
   }

}
