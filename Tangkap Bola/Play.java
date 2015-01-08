import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Intro
{
    /**
     * Act - do whatever the Play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int bg;
    public void act() 
    {
        Play();
    }
    
    private void Play()
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Bg());
        }
    }
}
