
/**
 * Write a description of class funstrings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class funstrings
{
        public static void moreFunWithStrings()
    {
        String s1 = new String("Live long and perspire.");
        String s2 = new String("Fry charder.");
        String s3;
        s3 = s1;
        System.out.println("s1: "+s1+"\ns2: "+s2+"\ns3: "+s3+"\n\n\n");
        // 1. Describe s1, s2, and s3.
        
        s1 = "Qapla'!";
        System.out.println("s1: "+s1+"\ns2: "+s2+"\ns3: "+s3);
        // 2. Describe what happens when the statement s1 = "Qapla'!; is executed.
        // 3. What's different about the three lines output in this section compared to 
        //    the earlier println statement, and why?
        
        String s4 = new String("Fry charder.");
        if (s2 == s4)
            System.out.println("s2 == s4 is true\n\n\n");
        else
            System.out.println("s2 == s4 is false\n\n\n");
        // 4. Describe s2 and s4.  Which statement printed and why?
            
            
       if (s4.equals(s2) == true)
            System.out.println("s2.equals(s4) is true\n\n\n");
        else
            System.out.println("s2.equals(s4) is false\n\n\n");
       // 5. Which statement printed and why?
       // 6. What would happen if the statement swapped s2 and s4?
       //    eg.   if (s4.equals(s2) == true)
       //    Why?
       
       int compVal1 = s1.compareTo(s2);
       int compVal2 = s2.compareTo(s3);
       int compVal3 = s2.compareTo(s4);
       System.out.println("compVal1: "+compVal1+"\ncompVal2: "+compVal2+"\ncompVal3: "+compVal3);
       System.out.println("\n\n");
       // 7. What are the values of compVal1, compVal2, and compVal3.  Why are they those values?
       
       // 8. Write a statement (or statements) that prints the 5th character of string s2.
       
       // 9. Write a statement (or statements) that prints the index of the word "chard" of string s4.
       
       // 10. Write a statement (or statements) that prints the number of characters in the string s3.
       
             
        
    }


}
