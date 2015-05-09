
/**
 * Write a description of class TestCode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestCode
{
   public static void main(){
       Code g = new Code("aldkjfhaslkdjfh asklfh ");
       g.hide(2,7);
       System.out.println(g.getCode());
       g.recover(5,9);
       System.out.println(g.getCode());
       g.hide(3,14);
       System.out.println(g.getCode());
       g.hide(6,10);
       System.out.println(g.getCode());
       g.recover(5,6);
       System.out.println(g.getCode());
       g.recover(0,14);
       System.out.println(g.getCode());
       
       
    }
}
