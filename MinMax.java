import java.util.Scanner;

public class MinMax extends Memory{

  Scanner scanner = new Scanner (System.in);

  public void findMin(){
    double[] nums = new double[10];

    System.out.println("NOTE: The maximum amount of numbers to compare is 10.");
    
    for(int i = 0; i < nums.length; i++){
       
      System.out.println("Please enter a number: ");
      nums[i] = scanner.nextInt(); 
        
    } // end for loop

    double min = nums[0];

    for(int i = 0; i < nums.length; i++){ 

      // System.out.println(nums[i]);
      
      if(nums[i] <= min){ 

        // System.out.println(x);
        
        min = nums[i]; 
        
      } // end if
      
    } // end for loop

    System.out.println("The minimum is " + min);
    
    storeMem(min, count);
    count++;
    
  } // end method findMin

  public void findMax(){
    double[] nums = new double[10];

    System.out.println("NOTE: The maximum amount of numbers to compare is 10.");
    
    for(int i = 0; i < nums.length; i++){
       
      System.out.println("Please enter a number: ");
      nums[i] = scanner.nextInt(); 
        
    } // end for loop

    double max = nums[0];

    for(int i = 0; i < nums.length; i++){ 

      // System.out.println(nums[i]);
      
      if(nums[i] >= max){ 

        // System.out.println(x);
        
        max = nums[i]; 
        
      } // end if
      
    } // end for loop

    System.out.println("The maximum is " + max);
    
    storeMem(max, count);
    count++;
    
  } // end method findMax
  
} // end class MinMax