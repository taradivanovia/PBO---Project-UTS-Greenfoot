import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends Intro
{
    /**
     * Act - do whatever the Help wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int guide;
    public void act() 
    {
        Help();
    }
    
    private void Help()
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Guide());
        }
    }
}
