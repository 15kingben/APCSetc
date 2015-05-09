
/**
 * Write a description of class pigLatin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pigLatin
{
   public static String pglt(String base){
       //Instance Variables 
       String[] k = new String[base.length()];
       String l = "";
       int y = 0;
       //Separate into words///////////////////
       for(int x = 0; x < base.length(); x++){
           k[y] = base.substring(x,findspace.fs(base,x));
           x = findspace.fs(base,x) + 1;
           y++;
        }
        ///convert to piglatin////////////////////////
       for(int z = 0; z < y; z++){
           String p;
           p = k[z].substring(0,0);
           k[z].concat(p + "ay");
           k[z] = k[z].substring(1,k[z].length());
       }
        
        //Assemble Array
       for(int i = 0; i < y; i++){
       l.concat(k[i] + "  ");
       }
       return l;
    }
}
