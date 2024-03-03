import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends World
{

    /**
     * Constructor for objects of class Help.
     * 
     */
    public Help()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1);
        getBackground().drawImage(new GreenfootImage("Help", 64, null, null), 350, 40);
        getBackground().drawImage(new GreenfootImage("Your dinosaur must jump over the bad mushrooms.\nA mushroom is considered bad if the code above it is misspelled.\nThe dinosaur jumps when you press the SPACEBER.", 25, null, null), 100, 115);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        dino dino = new dino();
        addObject(dino,103,300);
        end_g end_g = new end_g();
        addObject(end_g,269,316);
        end_g end_g1 = new end_g();
        addObject(end_g1,418,316);
        menub menub = new menub();
        addObject(menub,664,311);
    }
}
