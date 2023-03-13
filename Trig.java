import java.util.Scanner;

public class Trig extends Memory{
  Scanner scanner = new Scanner (System.in);
  private double a;
  private double b;
  private double c;

  public double getA(){
    return a;
  }

  public double getB(){
    return b;
  }

  public double getC(){
    return c;
  }

  public void setA(){
    this.a = a;
  }

  public void setB(){
    this.b = b;
  }

  public void setC(){
    this.c = c;
  }

  public double Pythagorean(double a, double b){
    return Math.sqrt((a * a) + (b * b));
  }

  public double AngAndHypo(double side, double angle){
    return side * Math.sin(angle);
  }

  public double AngleAndOneLeg(double side, double angle){
    return side * Math.tan(angle);
  }

  public double AreaAndOneLeg(double side, double area, char sidesChoice){
    if(sidesChoice == 'b'){
      return 2 * area / side;
    }else{
      return Math.sqrt((a * a) + (((2 * area) / side) * ((2 * area) / side)));
    }
  }

  public double Sine(double radians){
    return Math.sin(radians);
  }

  public double Cosine(double radians){
    return Math.cos(radians);
  }

  public double Tangent(double radians){
    return Math.tan(radians);
  }

  public double Secant(double radians){
    return 1 / Math.cos(radians);
  }

  public double Cosecant(double radians){
    return 1 / Math.sin(radians);
  }

  public double Cotangent(double radians){
    return 1 / Math.tan(radians);
  }

  public String GiveTrigFunc(){
    double num = 0;
    char decision = 'a';
    
    System.out.println("What is the value?");
    num = scanner.nextDouble();

    System.out.println("Is this value in radians? Y/N");
    decision = scanner.next().charAt(0);

    if(decision == 'N'){
      num = Math.toRadians(num);
    }

    System.out.println("What trigonometric function would you like to perform?\n1. Sine\n2. Cosine\n3. Tangent\n4. Secant\n5. Cosecant\n6. Cotangent");
    int trigDecision = scanner.nextInt();

    switch (trigDecision){
      case 1:
        
        return "Your solution is " + Sine(num);
        
      case 2:
        
        return "Your solution is " + Cosine(num);
        
      case 3:
        
        return "Your solution is " + Tangent(num);
        
      case 4:
        
        return "Your solution is " + Secant(num);
        
      case 5:
        
        return "Your solution is " + Cosecant(num);
        
      case 6:
        
        return "Your solution is " + Cotangent(num);
        
      default:
        
        return "Invalid operation - Please try again.";
        
    } // end switch

    
    
  } // end method GiveTrigFunc

  public String GiveEquation(){

    System.out.println("What equations are you looking for?\n1. Pythagorean\n2. Hypotenuse and an angle\n3. One leg (not the hypotenuse) and an angle\n4. The area of the triangle and one leg");
    int choice = scanner.nextInt();

    switch (choice){
    case 1:
        
      return "Your solution is " + Pythagorean(a, b);
        
    case 2:
        
      return "Your solution is " + AngAndHypo(a, b);
        
    case 3:
        
      return "Your solution is " + AngleAndOneLeg(a, b);
        
    case 4:
        
      System.out.println("Is this leg 'a' or 'b'?");
      char sidesChoice = scanner.next().charAt(0);

      System.out.println("What is the length of this leg?");
      a = scanner.nextDouble();

      System.out.println("What is the area?");
      b = scanner.nextDouble();
        
      return "Your solution is " + AreaAndOneLeg(a, b, sidesChoice);
        
    default:
      return "Invalid Operation";
    }
  } // end method GiveEquation
} // end class Trig

  // https://www.omnicalculator.com/math/right-triangle-side-angle#how-to-find-the-sides-of-a-right-triangle