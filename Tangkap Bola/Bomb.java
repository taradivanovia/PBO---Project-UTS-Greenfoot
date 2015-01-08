import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Objek
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY()+3); //bomb bergerak secarah vertikal ke bawah dengan kecepatan 3
        BombJatuh();  
    }    
    
    public void BombJatuh() 
    {        
        if(atWorldEdge())  //bila objek berada di bawah world 
        {
            getWorld().removeObject(this); //remove object
        }  
    }
}
