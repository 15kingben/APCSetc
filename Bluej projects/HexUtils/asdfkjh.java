
/**
 * Write a description of class asdfkjh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class asdfkjh
{
    public static void main(String arg){
    long l = System.currentTimeMillis();
        
    if(arg.equals("i")){
            System.out.println("Int:");
            long s = 1;
            for(int i = 0; i < 10000000; i++){
                s+=1;
            }
                    System.out.println( l - System.currentTimeMillis());
        }
    
    
    
    if(arg.equals("s")){
            System.out.println("Short:");
            short s = 1;
            for(int i = 0; i < 10000000; i++){
                s+=1;
            }
                    System.out.println(l - System.currentTimeMillis());
        }
        
        
        
    }
}
