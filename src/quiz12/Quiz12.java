/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz12;

import java.util.Scanner;

/**
 *
 * @author tewan2657
 */
public class Quiz12 {

    /**
     * @param args the command line arguments
     */
    public static String reverseString(String word){
        //variables
        char character = ',';
        char hold = ',';
        int length = word.length();
        
        //break word into each letter
        for (int i = 0; i < length; i++) {
         character = word.charAt(i);
        }
         
        //base case
        if(length == 1){
         return word;   
        }else{
            //start from end of the word 
            for (int i = length - 1 ; i < length; i--) {
             hold = word.charAt(i);
                
            return "" + hold;
            }
        }
          return "false";
    
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
   
        System.out.println("Enter a Word");
        String word = input.nextLine();
        
        String reverse = reverseString(word);
        System.out.println(reverse);
         
   
//        //NOT RECURSIVE
//        System.out.println("Enter a Word");
//        String wordn = input.nextLine();
//     
//      //variables
//        char character = ',';
//        char hold = ',';
//        int length = word.length();
//        //break word into each letter
//        for (int i = 0; i < length; i++) {
//         character = word.charAt(i);
//        }
//        //space
//        System.out.println("");
//        
//       //start from 
//            for (int i = length - 1 ; i < length; i--) {
//             hold = word.charAt(i);
//                System.out.print(hold);
//                }
    }
}
