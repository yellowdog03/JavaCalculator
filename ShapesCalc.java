/**
 *
 * @author gmquick
 */
import java.util.Scanner;

public class ShapesCalc extends Memory{
    Scanner scanner = new Scanner (System.in);
    
    public double Triangle(double height, double base){
      return .5 * height * base;
    }
    
    public double Quadrilateral(double firstNum, double secondNum){
      return firstNum * secondNum;
    }
    
    public double Pentagon(double side){
      return .25 * (Math.sqrt(5 + (2* Math.sqrt(5)))) * side;
    }

    public double Hexagon(double side){
      return ((3 * Math.sqrt(3)) / 2) * Math.pow(side, 2);
    }

    public double Heptagon(double side){
      return (7 / 4) * Math.pow(side, 2) * Math.tan(1 / Math.toRadians(180 / 7));
    }

    public double Octagon(double side){
      return 2 * (1 + Math.sqrt(2)) * Math.pow(side, 2);
    }

    public double Circle(double r){
      return 2 * Math.PI * Math.pow(r, 2);
    }

    public String GiveShapeArea(){
      double width;
      double length;
      double side;
      double radius;
      double solution;

      

      System.out.println("How many sides does the shape have? Min = 3, Max = 8. Enter 0 for Circle");
      int sideCount = scanner.nextInt();

      switch (sideCount){
        case 3:
          
          System.out.println("What is the height of the triangle?");
          double height = scanner.nextDouble();

          System.out.println("What is the length of the base of the triangle?");
          double base = scanner.nextDouble();

          solution = Triangle(height, base);
          storeMem(solution, count);
          count++;
          
          return "The area of the triangle is " + Triangle(height, base);

        case 4:
          
          System.out.println("What is the length?");
          length = scanner.nextDouble();
        
          System.out.println("What is the width?");
          width = scanner.nextDouble();

          solution = Quadrilateral(length, width);
          storeMem(solution, count);
          count++;

          return "The area of your quadrilateral is " + Quadrilateral(width, length);

        case 5:

          System.out.println("What is the length of one side?");
          side = scanner.nextDouble();
          
          solution = Pentagon(side);
          storeMem(solution, count);
          count++;
          return "The area of the Pentagon is " + Pentagon(side);
          
        case 6:

          System.out.println("What is the length of one side?");
          side = scanner.nextDouble();
          
          solution = Hexagon(side);
          storeMem(solution, count);
          count++;
          return "The area of the Hexagon is " + Hexagon(side);

        case 7:

          System.out.println("What is the length of one side?");
          side = scanner.nextDouble();
          
          solution = Heptagon(side);
          storeMem(solution, count);
          count++;
          return "The area of the Heptagon is " + Heptagon(side);

        case 8:

          System.out.println("What is the length of one side?");
          side = scanner.nextDouble();
          
          solution = Octagon(side);
          storeMem(solution, count);
          count++;
          return "The area of the Octagon is " + Octagon(side);

        case 0:

          System.out.println("What is the radius?");
          radius = scanner.nextDouble();

          solution = Circle(radius);
          storeMem(solution, count);
          count++;
          return "The area of the circle is " + Circle(radius);

        default:
          
          return "Shape count out of bounds or not a number - Please try again.";
          
      } // end switch
 
  }
}
