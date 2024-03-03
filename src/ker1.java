import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ker1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ker1 extends Actor
{
    /**
     * Act - do whatever the ker1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ker1()
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
        String[] splashes = {"cin>>a;", "cin>>b;", "cout<<boop;","cin>>a;","cout<<3;","cout<<a+b;","cout<<23;","cin>>n;","cin>>prim2;",
                             "cout<<a<<9;"};
        return splashes;
    }
}
