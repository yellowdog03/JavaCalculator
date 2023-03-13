import java.util.Scanner;

public class ThreeDShapesCalc extends Memory{

  Scanner scanner = new Scanner(System.in);

  

  public double RectangularPrism(double l, double w, double h){
    return l * w * h;
  } // end method RectangularPrism

  public double TriangularPrism(double a, double b, double c, double height){
    return (1 / 4) * height * Math.sqrt(-(Math.pow(a, 4)) + 2 * Math.pow((a * b), 2) + 2 * Math.pow(a * c, 2) - Math.pow(b, 4) + 2 * Math.pow(b * c, 2) - Math.pow(c, 4));
  } // end method TriangularPrism

  public double Pyramid(double l, double w, double h){
    return (l * w * h) / 3;
  } // end method Pyramid

  public double Sphere(double r){
    return (4 / 3) * Math.PI * Math.pow(r, 3);
  } // end method Sphere

  public double Cone(double r, double h){
    return Math.PI * Math.pow(r, 2) * (h / 3);
  } // end method Cone

  public double Cylinder(double r, double h){
    return Math.PI * Math.pow(r, 2) * h;
  } // end method Cylinder

  public double NoNegatives(double x){
    while(x < 0.0001){
      System.out.println("This value is below the minimum allowed. Please try again.");

      System.out.println("Please enter a different value.");
      x = scanner.nextDouble();
    }
    return x;
  }

  public String GiveShapeVolume(){
    double volume = 0;

    double a;
    double b;
    double c;
    double w;
    double l;
    double h;
    double r;

    System.out.println("What 3D shape would you like to find the volume of?\nOptions:\n1.Rectangular Prism or Cube\n2. Triangular Prism\n3. Pyramid\n4. Sphere\n5. Cone\n6. Cylinder");
    int choice = scanner.nextInt();

    switch(choice){
      case 1:
        
        System.out.println("What is the height?");
        h = scanner.nextDouble();

        System.out.println("What is the length?");
        l = scanner.nextDouble();

        System.out.println("What is the width?");
        w = scanner.nextDouble();

        volume = RectangularPrism(l, w, h);
        storeMem(volume, count);
        count++;
        
        return "Your volume is " + volume;

      case 2:
        
        System.out.println("What is the length of side A?");
        a = scanner.nextDouble();

        System.out.println("What is the length of side A?");
        b = scanner.nextDouble();
        
        System.out.println("What is the length of side A?");
        c = scanner.nextDouble();

        System.out.println("What is the height?");
        double height = scanner.nextDouble();

        volume = TriangularPrism(a, b, c, height);
        storeMem(volume, count);
        count++;

        return "Your volume is " + volume;

      case 3:

        System.out.println("What is the length?");
        l = scanner.nextDouble();

        System.out.println("What is the width?");
        w = scanner.nextDouble();

        System.out.println("What is the height?");
        h = scanner. nextDouble();

        volume = Pyramid(l, w ,h);
        storeMem(volume, count);
        count++;

        return "Your volume is " + volume;

      case 4:

        System.out.println("What is the radius?");
        r = scanner. nextDouble();

        volume = Sphere(r);
        storeMem(volume, count);
        count++;

        return "Your volume is " + volume;

      case 5:

        System.out.println("What is the radius?");
        r = scanner.nextDouble();

        System.out.println("What is the height?");
        h = scanner.nextDouble();

        volume = Cone(r, h);
        storeMem(volume, count);
        count++;

        return "Your volume is " + volume;

      case 6:

        System.out.println("What is the radius?");
        r = scanner.nextDouble();

        System.out.println("What is the height?");
        h = scanner.nextDouble();

        volume = Cylinder(r, h);
        storeMem(volume, count);
        count++;

        return "Your volume is " + volume;

      default:

        return "Invalid input - Please try again";
    }
  }
} // end class 3DShapesCalc

