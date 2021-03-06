import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Switch here.
 */
public class Switch extends Actor
{
    private boolean up = true;
    
    private GreenfootImage upImage = new GreenfootImage("switch-up.png");
    private GreenfootImage downImage = new GreenfootImage("switch-down.png");

    public Switch(String text1, String text2)
    {
        write(upImage, text1, text2);
        write(downImage, text1, text2);
        setImage(upImage);
    }
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            toggle();
        }
    }
    
    public boolean isOn()
    {
        return !up;
    }
    
    public void toggle()
    {
        up = !up;
        if (up) {
            setImage(upImage);
        }
        else {
            setImage(downImage);
        }
    }
    
    public void write(GreenfootImage image, String text1, String text2)
    {
        // calculate width of text in pixels
        int textWidth = new GreenfootImage(text1, image.getFont().getSize(), Color.WHITE, Color.BLACK).getWidth();
        image.drawString(text1, (image.getWidth() - textWidth) / 2, 12);
        
        textWidth = new GreenfootImage(text2, image.getFont().getSize(), Color.WHITE, Color.BLACK).getWidth();
        image.drawString(text2, (image.getWidth() - textWidth) / 2, 86);
    }

}
