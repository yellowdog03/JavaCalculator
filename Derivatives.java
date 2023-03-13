import java.util.ArrayList;
import java.util.Arrays;

public class Derivatives extends Memory{

  ArrayList<String> allSplits = new ArrayList<>();

  private String[] plusSplits;
  private String[] minusSplits;

  private int plusCount = 0;
  private int minusCount = 0;

  public void countOperators(String equation){

    for(int i = 0; i < equation.length(); i++){

      if(equation.charAt(i) == '+'){

        plusCount++;
        
      } // end if

      if(equation.charAt(i) == '-'){

        minusCount++;
        
      } // end if
      
    } // end for-loop
    
  } // end method countOperators

  /*
    The following function is meant to split the given equation at the operators.

    TO BE ADDED TO splitEquation:
    ~ way to keep track of where pluses and minuses are
    ~ way to keep spliting equation until there are no pluses and/or minuses left
  */

  public String splitEquation(String equation){

    String splits = "";

    for(int i = 0; i < equation.length(); i++){

      if(equation.charAt(i) == '+'){

        plusSplits = equation.split("\\+", 0);

        for(int j = 0; j < plusSplits.length; j++){

          splits += plusSplits[j];

        }
      
      } else if (equation.charAt(i) == '-'){

        minusSplits = equation.split("-", 0);

        for(int k = 0; k < minusSplits.length; k++){

          splits += minusSplits[k];
      
        }
      
      } // end else-if statement
    
    } // end for loop

    // put inside (plusCount + minusCount) for-loop
    
    for(int i = 0; i < (plusCount + minusCount - 1); i++){

      for(int j = 0; j < splits.length(); j++){

      if(splits.charAt(j) == '+'){

        plusSplits = equation.split("\\+", 0);

        for(int k = 0; k < plusSplits.length; k++){

          splits += plusSplits[k];

        }
        
      }else if(splits.charAt(j) == '-'){

        minusSplits = equation.split("-", 0);

        for(int k = 0; k < minusSplits.length; k++){

          splits += minusSplits[k];
      
        }
        
        }
      
      }
      
    }

    System.out.println(splits);
    
    return splits;
    
  }

  public void removeRepeats(){
    
    /*
      The next two if-statements create two ArrayLists ONLY IF their respective arrays that they are created from are NOT empty.
    */

    if(plusSplits != null){
      
      ArrayList<String> plusSplitsList = new ArrayList<>(Arrays.asList(plusSplits));

      allSplits.addAll(plusSplitsList);

    } // end if

    if(minusSplits != null){
      
      ArrayList<String> minusSplitsList = new ArrayList<>(Arrays.asList(minusSplits));

      allSplits.addAll(minusSplitsList);

    } // end if

    /*
      The for-loop and the variable `storedVal` are used to            remove any repeat values in allSplits.
    */

    String storedVal = allSplits.get(0);

    for(int i = 0; i < allSplits.size(); i++){

      if(allSplits.get(i) == storedVal){

        allSplits.remove(i);
        
      }else{

        storedVal = allSplits.get(i);
        
      } // end if-else
      
    } // end for loop

    
    
  } // end method splitEquation

   // Following function is currently untested

  public void findDeriv(String equation){

    String poweredPieces = "";

    countOperators(equation);
    splitEquation(equation);
    removeRepeats();

    System.out.println(allSplits);

    for(int i = 0; i < allSplits.size(); i++){

      String piece = allSplits.get(i);

      for(int j = 0; j < piece.length(); j++){

        if(piece.charAt(j) == '^'){

          poweredPieces += allSplits.get(i);
          
        } // end if statement
        
      } // end for loop
      
    } // end for loop
    
  } // end method findDeriv
  
} // end class Derivatives