
/**
 * Write a description of class fizzBuzz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fizzBuzz
{
    public static void main(){
        for(int i = 1; i < 101; i++){
            String str = Integer.toString(i);
            if(i % 3 == 0)
                str = "Fizz";
            if(i % 5 == 0)
                str = (str.equals("Fizz")) ? (str+ "Buzz") : "Buzz";
            System.out.println(str);
            str = "";
           
        }
    }
}
