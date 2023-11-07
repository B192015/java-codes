import javax.swing.*;
public class UseOptionPanes1
{
  public static void main(String args[])
  {
    String name=JOptionPane.showInputDialog(null,"what is your name?");
    int choice =JOptionPane.showConfirmDialog(null,"Do you like cake,"+name+"?");
    if(choice==JOptionPane.YES_OPTION)
    {
      JOptionPane.showMessageDialog(null,"of couse! who doesn't?");
    }
    else
     {
             JOptionPane.showMessageDialog(null,"we'll have to agree to disagree");
     }
  }
             
}
