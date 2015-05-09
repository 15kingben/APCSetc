
/**
 * Write a description of class reverse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class reverse
{
    static String ns = "";
    public static String rr(String s, int y){
        int x = y;
        
        if(x == 0){
            
        }
        else{
            ns = ns.concat(s.substring(x-1,x));
            x--;
            rr(s, x);
        }
        return ns;
    }
}
