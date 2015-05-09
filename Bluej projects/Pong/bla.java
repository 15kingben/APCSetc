
/**
 * Write a description of class bla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class bla
{

    public static void main(){
        double r = 1;
        double count = 3;
        double area = 0;
        
        while(true){
            area = (count*Math.sin((Math.toRadians(360/count))))/2;
            System.out.println(count + " : " + area);
            count++;
            
        }
        
        
    }
}
