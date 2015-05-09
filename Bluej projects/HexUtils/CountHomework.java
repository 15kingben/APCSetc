// **********************************************************
//  CountHomwork.java
//
//  This program reads in strings (phrases) and counts the 
//  number of blank characters and certain other letters
//  in the phrase. You should replace this header with the 
//  comment block header on Schoology.  I better not find
//  this block looking just like this in your submission.   
// **********************************************************

/* @author Ben King
 * @version 10.7.2013
 * @descrip.tion this program contains 3 loops to count the number of spaces in a string
 * @assign.ment  make equivalent for, while,and do while loops to count the number of spaces in a string
 */


import java.util.Scanner;

public class CountHomework
{
    

    public static void loopWithFor ()
    {
        String phrase;    // a string of characters
        int countBlank;   // the number of blanks (spaces) in the phrase 
        int length;       // the length of the phrase
        char ch;          // an individual character in the string

        Scanner scan = new Scanner(System.in);

        // Print a program header
        System.out.println ();
        System.out.println ("Character Counter");
        System.out.println ();

        // Read in a string and find its length
        System.out.print ("Enter a sentence or phrase: ");
        phrase = scan.nextLine();
        length = phrase.length();

        // Initialize counts
        countBlank = 0;

        for(int i =0; i < length; i++){
            if(phrase.charAt(i) == ' ')
                countBlank++;
        }

        // Print the results
        System.out.println ();
        System.out.println ("Number of blank spaces: " + countBlank);
        System.out.println ();
    }
    
    public static void loopWithWhile ()
    {
        String phrase;    // a string of characters
        int countBlank;   // the number of blanks (spaces) in the phrase 
        int length;       // the length of the phrase
        char ch;          // an individual character in the string

        Scanner scan = new Scanner(System.in);

        // Print a program header
        System.out.println ();
        System.out.println ("Character Counter");
        System.out.println ();

        // Read in a string and find its length
        System.out.print ("Enter a sentence or phrase: ");
        phrase = scan.nextLine();
        length = phrase.length();

        // Initialize counts
        countBlank = 0;
            int i = 0;
        while(i < length){
            if(phrase.charAt(i) == ' '){
                countBlank++;
                
            }i++;
        }

        // Print the results
        System.out.println ();
        System.out.println ("Number of blank spaces: " + countBlank);
        System.out.println ();
    }
    
    public static void loopWithDo ()
    {
        String phrase;    // a string of characters
        int countBlank;   // the number of blanks (spaces) in the phrase 
        int length;       // the length of the phrase
        char ch;          // an individual character in the string

        Scanner scan = new Scanner(System.in);

        // Print a program header
        System.out.println ();
        System.out.println ("Character Counter");
        System.out.println ();

        // Read in a string and find its length
        System.out.print ("Enter a sentence or phrase: ");
        phrase = scan.nextLine();
        length = phrase.length();

        // Initialize counts
        countBlank = 0;

        
            int i = 0;
            do{
            if(phrase.charAt(i) == ' '){
                countBlank++;
                
            }i++;
        }while(i < length);

        // Print the results
        System.out.println ();
        System.out.println ("Number of blank spaces: " + countBlank);
        System.out.println ();
    }
}