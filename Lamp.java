class Lamp
{  
  boolean isOn;
  String lamptype;
  Lamp(boolean isOn,String lampType)
  {
  this.isOn=isOn;
  this.lamptype=lamptype;
  }
  
  public void turnOn()
  {
    if(isOn==true)
    System.out.println("it is already on");
    else
    System.out.println("it is off");
    isOn=true;
  }
 public void turnOff()
  {
   if(isOn==false)
   System.out.println("it is already off");
    else
     System.out.println("it is on");
     isOn=true;
    }
    }
 class la
 {
   public static void main(String args[])
  { 
   Lamp led=new Lamp(true,"led");
   Lamp halogen=new Lamp(false,"halogen");
   led.turnOn();
   halogen.turnOn();
   led.turnOff();
   halogen.turnOff();
   }
   }
 
