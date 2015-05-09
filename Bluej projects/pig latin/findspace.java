
/**
 * Write a description of class findspace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class findspace
{
    public static int fs(String base, int start){
        int y = 0;
        for(int x = start; x < base.length(); x++){
            if(base.substring(x,x) == " "){
                y = x;
                break;
            }
        }
        return y;
    }
}
