import java.util.*;

public class TestCompartment {

    public static void main(String[] args) {

       Compartment[] c = new Compartment[10];
        Random r = new Random();


       for (int i = 0; i < c.length; i++) {
          int n = r.nextInt(4) + 1;

        if (n == 1) {
          c[i] = new FirstClass();
       } 
       else if (n == 2) {
         c[i] = new Ladies();
       } 
       else if (n == 3) {
         c[i] = new General();
       } 
       else {
        c[i] = new Luggage();
      }
    }
     System.out.println("Display Compartment Notices:");
        for (int i = 0; i < c.length; i++) {
            System.out.println("Compartment " + (i + 1) + ": " + c[i].notice());
        }
    }
}