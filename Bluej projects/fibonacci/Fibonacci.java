
/**
 * Write a description of class Fibonacci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fibonacci
{
   private static String total = "";
   static int old_num = 0;
   static int num = 1;
   static int new_num = 2;
   static String s;
   public static String ff(int limit){
       int x = limit;
       if(x == 0){
        }else{
            total = total.concat(s.valueOf(new_num)+ " " );
            old_num = num;
            num = new_num;
            new_num = old_num + num;
            --limit;
            ff(limit);
        }
       return total;
    }
}
