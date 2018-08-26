package lecture_04092018;

// ===== Code from file CallPersonInfo.java =====
public class CallPersonInfo {
   public static void main (String [] args) {
      PersonInfo person1 = new PersonInfo();

      person1.setNumKids(3);

      System.out.println ( "Kids: " + person1.getNumKids() ) ;
      person1.incNumKids() ;

      System.out.println ("New baby, kids now: " + person1.getNumKids() );

      return;
   }
}
// ===== end =====