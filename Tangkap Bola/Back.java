import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends Actor
{
    /**
     * Act - do whatever the back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int opening;
    public void act() 
    {
        Back();
    }
    
    private void Back()
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Opening());
        }
    } 
}
