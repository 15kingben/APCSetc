
/**
 * Write a description of class HiLo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Hilo
{
        public static void main(){
            System.out.println("This is a High Low Guessing Game between 1 and 1000");
            System.out.println("You Make a guess and I tell you whether or not it is above or below my number");
    
            Scanner console = new Scanner(System.in);
            boolean state = true;
            Random r = new Random();
            int guess;
            int target;
            target = r.nextInt(1000) + 1;
            while(state == true){
            
            System.out.println("Submit a Guess");
            guess = console.nextInt();
            if(guess > 1000 || guess < 1){
                System.out.println(guess + " Is out of bounds, guess again b/t 1 and 1000");
            }
            else if(guess > target){
                System.out.println(guess + " Is too high, guess again");
            }
            else if(guess < target){
                System.out.println(guess + " Is too low, guess again");
            }
            else if(guess == target){
                System.out.println("You guessed it");
                state = false;
                
            }
         }
    }
}