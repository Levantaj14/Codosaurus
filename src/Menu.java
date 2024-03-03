import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1);
        getBackground().drawImage(new GreenfootImage("Codosaurus", 64, null, null), 250, 40);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        dino_t dino_t = new dino_t();
        addObject(dino_t,100,168);
        dino_t.turn(-30);
        level1 level1 = new level1();
        addObject(level1,386,136);
        level2 level2 = new level2();
        addObject(level2,386,170);
        level3 level3 = new level3();
        addObject(level3,386,204);
        helpb helpb = new helpb();
        addObject(helpb,386,236);
        tree_t tree_t = new tree_t();
        addObject(tree_t,740,240);
    }
}
