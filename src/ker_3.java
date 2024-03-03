import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ker_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ker_3 extends Actor
{
    /**
     * Act - do whatever the ker_3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ker_3()
    {
        updateImage();
    }
    public void updateImage()
    {
        setImage(new GreenfootImage("" + getSplashes()[Greenfoot.getRandomNumber(getSplashes().length)], 20, null, null));
    }
    public void act() 
    {
        int stone_speed = 4;
        setLocation( getX() - stone_speed, getY() );
        if (getX()==0) getWorld().removeObject(this);
    }
    public static String[] getSplashes()
    {
        String[] splashes = {"while(p=true)","if(3)","for(int i=1,i<=n,i++)","while{6<=7}","if()","for(int i=1;i<=m;3)","if(a=false)"};
        return splashes;
    }
}
