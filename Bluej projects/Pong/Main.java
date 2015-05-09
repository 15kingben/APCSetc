
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.File;
import javax.swing.*;
import java.awt.Color;
import java.awt.*;
public class Main
{
    public static void main(){
        
        JFrame frame = new JFrame("Pong");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(new Point(10,10));
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(800,500);
        frame.getContentPane().setBackground(Color.black);
        
        Player player = new Player(new ImageIcon("C:\\Users\\Ben\\Desktop\\whiterect.jpeg"));
        player.setVisible(true);
        player.setBackground(Color.WHITE);
        player.setSize(10,50);
        player.setLocation(10,10);
        
        
        Comp cpu = new Comp(new ImageIcon("C:\\Users\\Ben\\Desktop\\whiterect"));//"C:\\Users\\Ben\\Desktop\\whiterect"
        cpu.setVisible(true);
        
        
        
        frame.add(player);
        frame.add(cpu);
        
    }


}