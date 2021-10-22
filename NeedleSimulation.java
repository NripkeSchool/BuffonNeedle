import java.util.*;

public class NeedleSimulation
{
   public static void main(String[] args)
   {
       Tarp myTarp = new Tarp(10, 20); //Length of needle is 10, length between lines is 10
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Insert amount of iterations: ");
       int iterations = scan.nextInt();
       
       myTarp.addRandomNeedle(iterations);
       System.out.println("Probability: " + myTarp.fractionOfCrossings());
       double pi;
       System.out.println("Approximation of PI: ");
   }
}
