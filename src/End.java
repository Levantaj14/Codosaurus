import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End extends World
{

    /**
     * Constructor for objects of class End.
     * 
     */
    public End()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        getBackground().drawImage(new GreenfootImage("Game Over", 64, null, null), 250, 40);
        prepare();
    }
    
    private void prepare()
    {
        tree_t tree_t = new tree_t();
        addObject(tree_t,740,240);
        dead dead = new dead();
        addObject(dead,100,287);
        end_g end_g = new end_g();
        addObject(end_g,200,350);
        trya trya = new trya();
        addObject(trya,386,136);
    }

    public void act()
    {
        
    }
}
