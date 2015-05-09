
/**
 * 
 * 
 * @author Ben King
 * @version 8/26/2013
 * @assign.ment hex converter
 * @descrip.tion this program converts an int of various ranges to hex
 */
public class HexUtils
{
    public static void testHex(){
        printFourHexDigits(155554);
    }
    
    
    
    /*prints a four digit decimal integer as a hex number in the ranger 0 to 65535
     * @param num the number to be converted
     */
    public static void printFourHexDigits(int num){
        if(num <0 || num > 65535){
            System.out.print("----");
            return;
        }
        int digit;
        
        for(int i = 0; i < 4 ; i++){
            digit = (int)Math.floor(num/Math.pow(16,3-i));
            num = num % (int)Math.pow(16,3-i);
            
            if(digit < 0 || digit > 15){
            System.out.print("-");
        }else{
            if(digit <10)
                System.out.print(digit);
            else{
                switch(digit){
                    case (10):
                        System.out.print("A");
                        break;
                    case (11):
                        System.out.print("B");
                        break;
                    case (12):
                        System.out.print("C");
                        break;
                    case (13):
                        System.out.print("D");
                        break;
                    case (14):
                        System.out.print("E");
                        break;
                    case (15):
                        System.out.print("F");
                        break;
                     
                    
                    
                }
                
            }
                
        }
            
        
        }
    }
    
    /*prints a two digit decimal integer as a hex number in the ranger 0 to 255
     * @param num the number to be converted
     */
    public static void printTwoHexDigits(int num){
        if(num <0 || num > 255){
            System.out.print("--");
            return;
        }
            
        int digit;
        digit = (int)Math.floor(num/16);
        num = num % 16;
        //System.out.print(digit);
        
        if(digit < 0 || digit > 15){
            System.out.print("-");
        }else{
            if(digit <10)
                System.out.print(digit);
            else{
                switch(digit){
                    case (10):
                        System.out.print("A");
                        break;
                    case (11):
                        System.out.print("B");
                        break;
                    case (12):
                        System.out.print("C");
                        break;
                    case (13):
                        System.out.print("D");
                        break;
                    case (14):
                        System.out.print("E");
                        break;
                    case (15):
                        System.out.print("F");
                        break;
                     
                    
                    
                }
                
            }
                
        }
        
        digit = num;
         if(digit < 0 || digit > 15){
            System.out.print("-");
        }else{
            if(digit <10)
                System.out.print(digit);
            else{
                switch(digit){
                    case (10):
                        System.out.print("A");
                        break;
                    case (11):
                        System.out.print("B");
                        break;
                    case (12):
                        System.out.print("C");
                        break;
                    case (13):
                        System.out.print("D");
                        break;
                    case (14):
                        System.out.print("E");
                        break;
                    case (15):
                        System.out.print("F");
                        break;
                     
                    
                    
                }
                
            }
                
        }
        
    }
    
    
    /*converts an int range 0-15 to hex
     * @param int to be converted
     */
     public static void printOneHexDigit(int num)
    {
        if(num < 0 || num > 15){
            System.out.print("-");
        }else{
            if(num <10)
                System.out.print(num);
            else{
                switch(num){
                    case (10):
                        System.out.print("A");
                        break;
                    case (11):
                        System.out.print("B");
                        break;
                    case (12):
                        System.out.print("C");
                        break;
                    case (13):
                        System.out.print("D");
                        break;
                    case (14):
                        System.out.print("E");
                        break;
                    case (15):
                        System.out.print("F");
                        break;
                     
                    
                    
                }
                
            }
                
        }
    }
}
