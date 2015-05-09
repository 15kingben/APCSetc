/* @author Ben King
 * @version 8/23/2013
 * @assign.ment powers of 2 assingment
 * @description this program prints a list of the powers of 2 to 2 ^ 16
 * 
 */
public class Main
{
    
    public static void main(String args[])
    {
        int count = 0;
        
        while(count < 17){
            System.out.println("2 ^ " + count + " = \t" + (int)Math.pow(2,count));
            count++;
    }
}
}
