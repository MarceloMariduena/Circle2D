/***** Author: Marcelo Mariduena *****/

import java.util.Scanner;

public class Circle2DTestMarceloMariduena {
  public static void main(String[] args){
    
    /* Scanner object for inputs */
    Scanner input = new Scanner(System.in);
    
   System.out.println("Circle 0: Enter x, y and radius: "); 
   String firstInput = input.nextLine();
   
   System.out.println("Circle 1: Enter x, y and radius: "); 
   String secondInput = input.nextLine();
   
   System.out.println("Point. Enter x, y: ");
   String thirdInput = input.nextLine();
   System.out.println(); /* Spacing */
   
   /* Gather the inputs */
   String[] splits1 = firstInput.split(" ");
   String[] splits2 = secondInput.split(" ");
   String[] splits3 = thirdInput.split(" ");
   
   /* Assign the gathered inputs to double variables for 1st circle */
   double x1 = Double.parseDouble(splits1[0]);
   double y1 = Double.parseDouble(splits1[1]);
   double radius1 = Double.parseDouble(splits1[2]);
   
   /* Assign the gathered inputs to double variables for 1st circle */
   double x2 = Double.parseDouble(splits2[0]);
   double y2 = Double.parseDouble(splits2[1]);
   double radius2 = Double.parseDouble(splits2[2]);
   
   /* Assign the gathered inputs to double variables for 1st circle */
   double x3 = Double.parseDouble(splits3[0]);
   double y3 = Double.parseDouble(splits3[1]);
   
   /* Assign the inputs to the Circle2D instances */
   Circle2DMarceloMariduena circle1 = new Circle2DMarceloMariduena(x1, y1, radius1);
   Circle2DMarceloMariduena circle2 = new Circle2DMarceloMariduena(x2, y2, radius2);
   
   /* Outputs */
   System.out.println("========= Calculation =========");
   System.out.println(); /* Spacing */
   
   System.out.println("---- Circle 0 ----");
   System.out.printf("Perimeter: %.3f", circle1.getPerimeter());
   System.out.println(); /* Spacing */
   System.out.printf("Area: %.3f", circle1.getArea());
   System.out.println(); /* Spacing */
   System.out.println(); /* Spacing */
   
   System.out.println("---- Circle 1 ----");
   System.out.printf("Perimeter: %.3f", circle2.getPerimeter());
   System.out.println(); /* Spacing */
   System.out.printf("Area: %.3f", circle2.getArea());
   System.out.println(); /* Spacing */
   System.out.println(); /* Spacing */
   
   System.out.println("---- Circles Calculations ----");
   if(circle1.overlaps(circle2)){System.out.println("Circles overlap");}
   else {System.out.println("Circles do not overlap");}
   System.out.printf("Minimum distance between circles' centers: %.4f", circle1.getDistance(circle2));
   System.out.println(); /* Spacing */
   System.out.println(); /* Spacing */
   
   System.out.println("---- Point (" + x3 + " ," + y3 + ") to circle 0 ----");
   System.out.printf("Minimum distance: %.4f", circle1.getDistance(x3, y3));
   System.out.println(); /* Spacing */
   if (circle1.contains(x3, y3)){System.out.println("Point is inside the circle");}
   else {System.out.println("Point is outside the circle");}
   System.out.println(); /* Spacing */
   
   System.out.println("---- Point (" + x3 + " ," + y3 + ") to circle 1 ----");
   System.out.printf("Minimum distance: %.4f", circle2.getDistance(x3, y3));
   System.out.println(); /* Spacing */
   if (circle2.contains(x3, y3)){System.out.println("Point is inside the circle");}
   else {System.out.println("Point is outside the circle");}
   
   input.close();
  }
  
}