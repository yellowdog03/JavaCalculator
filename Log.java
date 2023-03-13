import java.util.Scanner;

public class Log extends Memory{

  Scanner scanner = new Scanner(System.in);

  public double naturalLog(double firstNum){
    return Math.log(firstNum);
  }

  public double logBase10(double firstNum){
    return Math.log10(firstNum);
  }

  public double logBaseNum(double firstNum, double base){
    return (Math.log(firstNum) / Math.log(base));
  }

  public double giveLog(int choice){
    double solution;
    
    switch (choice){
        
      case 1:

        System.out.println("What is the number you want to find the logarithm of?");
        double num = scanner.nextDouble();

        if(num < 0){
          System.out.println("Invalid input");
        }

        solution = logBase10(num);
        storeMem(solution, count);
        count++;
        
        return logBase10(num);

      case 2:

        System.out.println("What is the number you want to find the logarithm of?");
        double num1 = scanner.nextDouble();

        if(num1 < 0){
          System.out.println("Invalid input");
        }

        solution = naturalLog(num1);
        storeMem(solution, count);
        count++;
        
        return naturalLog(num1);

      case 3:

        System.out.println("What is the base?");
        double base = scanner.nextDouble();

        System.out.println("What is the number?");
        double num2 = scanner.nextDouble();

        solution = logBaseNum(num2, base);
        storeMem(solution, count);
        count++;

        return logBaseNum(num2, base);

      default:

        System.out.println("Invalid operation");

        return 0;
        
    } // end switch
    
  } // end of method giveLog
  
} // end of class Log
