import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ko here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jo extends Actor
{
    int stone_speed =4;
    /**
     * Act - do whatever the ko wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public jo()
    {
        GreenfootImage image = getImage();  
        image.scale(30, 30);
        setImage(image);
    }
    public void act() 
    {
        //int stone_speed = 4;
        setLocation( getX() - stone_speed, getY() );
        if (getX()==0) getWorld().removeObject(this);
    }    
}
