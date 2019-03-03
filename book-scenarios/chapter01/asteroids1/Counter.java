import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int totalCount = 0;
    public Counter() 
    {
        setImage(new GreenfootImage("0", 48, Color.WHITE, Color.BLACK));
    }    
    
    public void bumpCount(int amount){
     
        totalCount += amount;
        setImage(new GreenfootImage("" + totalCount, 48, Color.WHITE, Color.BLACK));
      
    }

}

