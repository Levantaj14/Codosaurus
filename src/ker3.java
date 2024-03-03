import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ker3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ker3 extends Actor
{
    /**
     * Act - do whatever the ker3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ker3()
    {
        updateImage();
    }
    public void act() 
    {
        int stone_speed = 4;
        setLocation( getX() - stone_speed, getY() );
        if (getX()==0) getWorld().removeObject(this);
    }
    private void updateImage()
    {
        setImage(new GreenfootImage("" + getSplashes()[Greenfoot.getRandomNumber(getSplashes().length)], 20, null, null));
    }
    public static String[] getSplashes()
    {
        String[] splashes = {"while(p==true)","if(a==3)","for(int i=1;i<=n;i++)","while(n<=7)","if(p)","for(int i=1;i<=m;i+3)","while(r)","if(a!=false)"};
        return splashes;
    }
}
