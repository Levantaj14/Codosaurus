import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ker2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ker2 extends Actor
{
    /**
     * Act - do whatever the ker2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ker2()
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
        String[] splashes = {"int a;","char c;","bool prim;","string word;","int n:","bool k;"};
        return splashes;
    }
}
