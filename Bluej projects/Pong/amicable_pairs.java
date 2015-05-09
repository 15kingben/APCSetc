
/**
 * Write a description of class amicable_pairs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class amicable_pairs
{
    
    public static void main(){
    long sum = 0;
    int num = 0;
    int test = 0;
    int divsOne = 0;
    int divsTwo = 0;
    for( int i = 1; i < 10000; i++ ){
        divsOne = 0;
        divsTwo = 0;
        //determine divisors
        for(int I = 1; I < i; I++){
            if(i % I == 0){
                divsOne += I;
                
            }
        }
        for(int ii = 1; ii < divsOne; ii++){
            if(divsOne % ii == 0){
                divsTwo += ii;
                
            }
            
        }
        if(divsOne == divsTwo){
            sum += divsOne;
            sum += divsTwo;
            
            
        }
        
        
        
        
        
        
    }
    System.out.println(sum);
}}
