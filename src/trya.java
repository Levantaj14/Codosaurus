import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class trya here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class trya extends Actor
{
    /**
     * Act - do whatever the trya wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Try Again", 32, null, null));
        if(Greenfoot.mouseClicked(this)) Greenfoot.setWorld(new Menu());
    }    
}
