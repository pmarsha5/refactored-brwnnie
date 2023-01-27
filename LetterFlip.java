//***********************************************
//Author: Pamela Marshall        Date: 6/28/2021
//
//Project 4 part B: LetterFlip
//**********************************************
import java.util.Scanner;
import java.util.Random;


public class LetterFlip
{

public static void main(String [] args)
{


      Random random = new Random();
      Scanner scan = new Scanner(System.in);
      
      
     // variables used for random statement
          int length = random.nextInt (20) + 1;
   
      //output variable
        String str; 
        
      // print and store string
       do
       {
        System.out.println( " Enter a string "+length+" characters long :");
        str = scan.nextLine();
        }
        while (str.length() != length);
        
               // variable used for loop
                  int charlength = 0;
           
                  while ( charlength < str.length())
                  {
                                       
                  Character c = str.charAt(charlength); 
                  
                  // changing upper and lower case
                     if (Character.isLowerCase(c))
                     {
                        c = ( Character.toUpperCase(c)); 
                     }
                     else
                        c = (Character.toLowerCase(c)); 
                        
                       // count for while loop
                        charlength ++;
                        
                        // print out new string 
                          System.out.print (c);
                        
                                         
                    }   
                       // print out new string   
                        System.out.print(" is the string after case flip" ); 
                 
}
}