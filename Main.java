/**
 *
 * @author gmquick
 */

import java.util.Scanner;

public class Main extends Memory{
  public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    Memory mem = new Memory();
    double firstNum = 0;
    double secondNum = 0;
    char mode = 'a';
    char cont = 'y';

    while(cont == 'Y' || cont == 'y'){

      System.out.println("What mode would you like to be in? Options are 'A' for Arithmetic, 'S' for Shapes, 'T' for Trigonometry, 'L' for logarithms, 'I' for finding the minimum or maximum, 'D' for derivatives, 'M' for memory access");
      mode = scanner.next().charAt(0);

      switch (mode){
        case 'A':
          
          Arithmetic arith = new Arithmetic();

          arith.arithCalc();
          break;
          
        case 'S':
          
          ShapesCalc shape = new ShapesCalc();

          System.out.println(shape.GiveShapeArea());
          break;
          
        case 'T':
          
          Trig trig = new Trig();
      
          System.out.println("WARNING: THIS MODE CURRENTLY ONLY WORKS FOR RIGHT TRIANGLES!!!");

          System.out.println("Are looking for single trignometric functions or right triangle equations? F/E");
          char decision = scanner.next().charAt(0);

          if(decision == 'E'){

            System.out.println(trig.GiveEquation());
        
          } else if(decision == 'F'){

            System.out.println(trig.GiveTrigFunc());
        
          }
          break;

        case 'L':

          System.out.println("What kind of log do you want to compute?\n1. Log BASE 10\n2. Natural Log \n3. Log CUSTOM BASE");
          int choice = scanner.nextInt();

          Log log = new Log();

          System.out.println("You solution is " + log.giveLog(choice));
          
          break;

        case 'I':

          MinMax mm = new MinMax();

          System.out.println("Would you like to find the: \n1. Minimum\n2. Maximum");
          int mmChoice = scanner.nextInt();
          
          if(mmChoice == 1){

            mm.findMin();
            
          } else if (mmChoice == 2){

            mm.findMax();
            
          } else {
            
            System.out.println("Invalid Input - Please try again");
            
          } // end else-if
          
          break;

        case 'D':

          Derivatives deriv = new Derivatives();

          System.out.println("Enter your equation: ");
          String equation = scanner.next();

          deriv.findDeriv(equation);
          
          break;
          
        case 'M':
          
          System.out.println("Which memory place would you like to access?");
          int index = scanner.nextInt();

          System.out.printf("The value at index %d is %f.\n", index, mem.getMem(index));
          break;
          
        default:
          
          System.out.println("Invalid Operation - Please try again.");
          break;
      }
      
      System.out.println("Would you like to continue? Y/N");
      cont = scanner.next().charAt(0);
      
    } // end while
  } // end method main
} // end class CalcMain

