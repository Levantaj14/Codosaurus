import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dino1 extends Actor
{
    GreenfootSound boing = new GreenfootSound("Boing.mp3");
    GreenfootSound uh = new GreenfootSound("uh.mp3");
    GreenfootSound hihi = new GreenfootSound("hihi.mp3");
    private final int GRAVITY = 1;
    private int velocity;
    public static int huh;
    public dino1()
    {
        velocity=0;
        huh=100;
        GreenfootImage image = getImage();  
        image.scale(100, 100);
        setImage(image);
    }
    public void act() 
    {
        fall();
        if (Greenfoot.isKeyDown("space") && getY()>getWorld().getHeight()-huh) 
        {
            boing.play();
            jump();
        }
        if (isTouching(rossz.class))
        {
            uh.play();
            ((MyWorld1)getWorld()).lifekill();
        }
        else
        {
            MyWorld1.hely=1;
        }
        if (isTouching(jo.class))
        {
            hihi.play();
            ((MyWorld1)getWorld()).ponty();
        }
        else
        {
            MyWorld1.hely_g=1;
        }
    }
    public void fall()
    {
        setLocation(getX(),getY()+velocity);
        if(getY()>getWorld().getHeight()-huh) velocity=0;
        else velocity+=GRAVITY;
    }
    public void jump()
    {
        velocity=-20;
    }
}
