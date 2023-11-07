import javax.swing.*;
public class UseOptionPanes2
{
   public static void main(String args[])
   {
    String ageText =JOptionPane.showInputDialog(null,"how old are you?");
    int age=Integer.parseInt(ageText);
    
    String moneyText =JOptionPane.showInputDialog(null,"how much money do you have?");
    double money=Double.parseDouble(moneyText);
    
    JOptionPane.showMessageDialog(null,"if you can double your money each year ,\n"+"yuo'll have "+(money*32)+"dollars at age"+(age+5)+"!");
    }
    }
