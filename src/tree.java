import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tree extends Actor
{
    /**
     * Act - do whatever the tree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int tree_speed = 4;
        setLocation( getX() - tree_speed, getY() );
        if (getX()==0) getWorld().removeObject(this);
    }

}