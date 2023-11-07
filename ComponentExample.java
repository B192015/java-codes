import java.awt.*;
import javax.swing.*;

public class ComponentExample
{
  public static void main(String args[])
  {
   JFrame frame=new JFrame();
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setSize(new Dimension(300,100));
   frame.setTitle("A frame");
   
   JButton button1=new JButton();
   button1.setText("i'm a button");
   button1.setBackground(Color.BLUE);
   frame.add(button1);
   
   JButton button2=new JButton();
   button2.setText("click me");
   button2.setBackground(Color.RED);
   frame.add(button2);
   
   frame.setVisible(true);
   }
   }
