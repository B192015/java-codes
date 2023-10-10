class Tv
{
   int channel,volume_level;
   boolean on;
  Tv(int channel,int volume_level,boolean on)
   {
    if(channel<1&channel>40&volume>7&&volume<1)
    System.out.println("tv is on");
    else
    System.out.println("not on");
   }
   public void turnOn()
   {
     if(on==true){
       System.out.println("it is already on");
       }
     else{
       System.out.println("it is off");
       on=true;
     }
   }
   public void turnOff()
   {
     if(on==false){
      System.out.println("it is already off");
      }
     else{
      System.out.println("it is on");
      on=true;
      }
    }
   public void setChannel(int nch)
   {
    if(this.on==false)
       System.out.println("tv is not on");
    else if(this.on==true)
      System.out.println("tv is on"+nch);
    else if(nch>40&&nch<0)
      System.out.println("channel does not exist");
    else
      System.out.println("channel exist"+nch);
    }
    public void setVolume(int vol)
   {
    if(this.on==false)
      System.out.println("tv is not on");
    else if(this.on==true)
      System.out.println("tv is on"+vol);
    else if(vol>7&&vol<1)
      System.out.println("volume cannot be set");
    else
    System.out.println("volume is set"+vol);
    }
    public void channelUp()
    {
    if(this.on==true)
     System.out.println("tv is on");
     setChannel++;
    }
      public void channelDown()
    {
    if(this.on==true)
      System.out.println("tv is on");
      setChannel--;
     }
     public void volumeUp()
    {
    if(this.on==true)
      System.out.println("tv is on");
      setVolume++;
    }
     public void volumeDown()
    {
     if(this.on==true)
      System.out.println("tv is on");
      setVolume--;
    }
    }
    class t
    {
      public static void main(String args[])
    {
     TV t1=new TV(4,4,on);
     }
     }
    
    
