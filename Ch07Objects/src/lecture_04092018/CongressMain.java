package lecture_04092018;

/**
 * <purpose>
 * 4/9/2018
 * @author flh250
 */
public class CongressMain {

   public static void main ( String [] args) {
      CongressEligibility person1 = new CongressEligibility() ;
      person1.setAge(27);
      person1.setYearsCitizen(person1.getAge());
      System.out.println(person1.getAge() + " " + person1.getYearsCitizen());

      System.out.println("Person1 is senate Eligible: " + person1.isSenateEligible());
      System.out.println("Person1 is house Eligible: " + person1.isHouseEligible());
      printEligibility(person1);


   }

   private static void  printEligibility ( CongressEligibility person) {
      System.out.println("house eligibility: " + person.isHouseEligible());
      System.out.println("senate eligible: " + person.isSenateEligible()) ;

   }
}
