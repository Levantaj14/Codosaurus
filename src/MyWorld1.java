import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld1 here.
 * 
 * @author (your name) 
 * @version (02.16)
 */
public class MyWorld1 extends World
{
    int counter = 0;
    private int lives;
    public static int pont; 
    public static int hely;
    public static int hely_g;
    /**
     * Constructor for objects of class MyWorld1.
     * 
     */
    public MyWorld1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1);
        //create dino1 object
        dino1 dino1 = new dino1();
        //add dino1 to the world
        addObject(dino1, 100, 202);
        setPaintOrder(jo.class,rossz.class,ker2.class,ker_2.class,dino1.class,tree.class);
        lives=3;
        hely=1;
        hely_g=1;
        pont=0;
        prepare();
        showlives();
        showponty();
    }

    public void act()
    {
        counter++;
        if(counter == 50)
        {
            //create tree object
            tree tree = new tree();
            //add tree to the world
            addObject( tree, getWidth(), 240 ); 
        }
        if(counter == 70)
        {
            place();
            counter = 0;
        }
        
    }

    public void place()
    {
        int randomnumber=Greenfoot.getRandomNumber(2);
        if (randomnumber==0)
        {
            ker2 ker2 = new ker2();
            addObject(ker2, getWidth(), 315 );
            jo jo = new jo();
            addObject(jo, getWidth(), 350 );
        }
        else if (randomnumber==1)
        {
            ker_2 ker_2 = new ker_2();
            addObject(ker_2, getWidth(), 315 );
            rossz rossz = new rossz();
            addObject(rossz, getWidth(), 350 );
        }
        randomnumber=2;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        szivecske szivecske = new szivecske();
        addObject(szivecske,30,30);
        end_g end_g = new end_g();
        addObject(end_g,35,76);
        removeObject(end_g);
        gomb gomb = new gomb();
        addObject(gomb,33,79);
    }

    private void showlives()
    {
        showText("x" + lives, 60, 30);
        hely=0;
    }
    public void showponty()
    {
        showText("x" + pont, 70, 80);
        hely_g=0;
    }
    public void ponty()
    {
        if(hely_g==1) 
        {
            pont=pont+10;
            showponty();
        }
    }
    public void lifekill()
    {
        if (lives>=1)
        {
            if(hely==1)
            {
                lives--;
                showlives();
            }
        }
        else
        {
            Greenfoot.setWorld(new End());
        }
    }
}
