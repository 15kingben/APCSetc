
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class main
{
    public static void sum(){
        Scanner console = new Scanner(System.in);
        int limit = 0;
        double sum = 0;
        
        System.out.println("This program adds a series of consecutive reciprocals");
        System.out.println("Enter a nonzero limit");
        limit = console.nextInt();
        
        if(limit > 0){
            for(int i = 1; i <= limit; i++){
                sum = sum + (1.0/(double)i);
                
            }
        }
        else if(limit < 0){
            for(int i = -1; i >= limit; i--){
                sum += (1.0/(double)i);
                
            }
        }else{
            System.out.println("Please enter a nonzero number");
            sum();
        }
        System.out.println(sum);
    }
}
