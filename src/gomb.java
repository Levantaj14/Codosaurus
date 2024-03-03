import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gomb extends Actor
{
    /**
     * Act - do whatever the gomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public gomb()
    {    
        GreenfootImage image = getImage();  
        image.scale(30, 30);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
