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
    public String reverseString(String word) {
        //base case  
        if ((word == null) || (word.length() <= 1)) 
            return word;
        

        // replace first letter and add it at the end. 
        return reverseString(word.substring(1)) + (word.charAt(0));

    }

    public static void main(String[] args) {
        //Testing mehtod
        Quiz12 test = new Quiz12();

        //Word 
        String word = "Hello";
        System.out.println("The Reverse String of " + word + " is:");
        System.out.println(test.reverseString(word));

    }
}
