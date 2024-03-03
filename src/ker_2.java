import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ker_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ker_2 extends Actor
{
    /**
     * Act - do whatever the ker_2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ker_2()
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
        String[] splashes = {"int 3","bool prim","char 7","int v","string v:","bool a=2;","inf a;","getline a;","cin>>a;"};
        return splashes;
    }
}
