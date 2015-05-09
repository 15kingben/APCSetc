
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main
{
    public static void main(){
        //not quite right
        double flyDis = 0;
        double monkDis = 0;
        double oldMonkDis = 0;
        System.out.println("Fly Distance = " + flyDis);
        System.out.println("Wallabee Distance = " + monkDis);
        System.out.print("\n");
        boolean state = true;
        while(flyDis < monkDis || state == true){
            oldMonkDis = monkDis;
            monkDis += 63360;
            if(state == false){
                flyDis *= (monkDis/oldMonkDis);
            }
            //after stretch
            flyDis += 1;
            System.out.println("Fly Distance = " + flyDis);
            System.out.println("Wallabee Distance = " + monkDis);
            System.out.print("\n");
            state = false;
        }
        
    }
}
