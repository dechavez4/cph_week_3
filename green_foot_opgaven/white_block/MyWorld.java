import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends greenfoot.World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 800, 1); 
        Fly[] flies = new Fly[3];
        for(int i = 0; i<flies.length; i++)
        {
            flies[i] = new Fly();
            int flyX = Greenfoot.getRandomNumber(getWidth());
            int flyY = Greenfoot.getRandomNumber(getHeight());
            addObject(flies[i], flyX, flyY);
        }
    }
}
