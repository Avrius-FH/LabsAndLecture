package ch10lab1;

public class BoatMain {

    public static void main(String[] args) {

        System.out.println( new Boat("canoe" , 14.0, 2.5, 250.0));
        System.out.println(new SailBoat("Patience", 11.0, 3.5 , 250.0, 45.0));
        System.out.println(new PowerBoat( "Fish King" , 8.0, 4.0, 300.0, 10.0));
    }
}
