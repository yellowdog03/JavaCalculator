/**
 *
 * @author gmquick
 */

import java.util.Scanner;

public class Arithmetic extends Memory {
  Scanner scanner = new Scanner (System.in);
  
  private double firstNum = 0;
  private double secondNum = 0;
    
  public Arithmetic(){
    this.firstNum = 0;
    this.secondNum = 0;
  }

  /**
   * @return the firstNum
   */
  public double getFirstNum() {
    return firstNum;
  }

  /**
   * @param firstNum the firstNum to set
   */
  public void setFirstNum(double firstNum) {
    this.firstNum = firstNum;
  }

  /**
   * @return the secondNum
   */
  public double getSecondNum() {
    return secondNum;
  }

  /**
   * @param secondNum the secondNum to set
   */
  public void setSecondNum(double secondNum) {
    this.secondNum = secondNum;
  }
    
  /**
   * Function adds `firstNum` and `secondNum` to find the sum
   * @param firstNum
   * @param secondNum
   * @return
   */
  public double addition(double firstNum, double secondNum){

    return firstNum + secondNum;
    
  } // end method addition
    
  /**
   * Function subtracts `firstNum` from `secondNum` to find the difference
   * @param firstNum
   * @param secondNum
   * @return 
   */
  public double subtraction(double firstNum, double secondNum){

    return firstNum - secondNum;
    
  } // end method subtraction
    
  /**
   * Function multiplies `firstNum` and `secondNum` together
   * @param firstNum
   * @param secondNum
   * @return 
   */
  public double multiplication(double firstNum, double secondNum){
    
    return firstNum * secondNum;
    
  } // end method multiplication
    
  /**
   * Function divides `firstNum` by `secondNum`
   * @param firstNum
   * @param secondNum
   * @return 
   */
  public double division(double firstNum, double secondNum){
  
    return firstNum / secondNum;
    
  } // end method division

  public double factorial(double firstNum){
    if (firstNum == 0)    
      return 1;    
    else    
      return(firstNum * factorial(firstNum - 1));    
  }

  public double exponent(double base, double power){
    return Math.pow(base, power);
  }

  public double squareRoot(double num){
    return Math.sqrt(num);
  }
  
  public void arithCalc(){

    System.out.println("Please type you first number, then press Enter");
    firstNum = scanner.nextDouble();
        
    System.out.println("Please type your second number, then press Enter. If doing a factorial, enter any number, it will not be used.");
    secondNum = scanner.nextDouble();
    
    System.out.println("Please select your operator. Your options are: 'A' for addition, 'S' for subtraction, 'M' for multiplication, 'D' for division, 'F' for factorial, 'E' for exponent, 'R' for square root");
    char operator = scanner.next().charAt(0);

    double solution = 0;

    switch (operator){
      case 'A':
        
        System.out.println("Your solution is " + addition(firstNum, secondNum)); 
        solution = addition(firstNum, secondNum);
        break;
        
      case 'S':
        
        System.out.println("Your solution is " + subtraction(firstNum, secondNum)); 
        solution = subtraction(firstNum, secondNum);
        break;
        
      case 'M':
        
        System.out.println("Your solution is " + multiplication(firstNum, secondNum));  
        solution = multiplication(firstNum, secondNum);
        break;
        
      case 'D':
        
        System.out.println("Your solution is " + division(firstNum, secondNum)); 
        solution = division(firstNum, secondNum);
        break;

      case 'F':

        System.out.println("Your solution is " + factorial(firstNum));
        solution = factorial(firstNum);
        break;

      case 'E':

        System.out.println("Your solution is " + exponent(firstNum, secondNum));
        solution = exponent(firstNum, secondNum);
        break;

      case 'R':

        System.out.println("Your solution is " + squareRoot(firstNum));
        solution = squareRoot(firstNum);
        break;
        
      default:
        
        System.out.print("Invalid Operation");
        
    } // end switch

      storeMem(solution, count);
      count++;
    
  } // end method ArithCalc
} // end class Arithmetic
