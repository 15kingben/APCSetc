
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class main
{
    public static void main(){
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your limit");
        int limit = console.nextInt();
        System.out.println(Fibonacci.ff(limit));
        
        
    }
}
