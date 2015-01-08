import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Opening here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Opening extends World
{

    /**
     * Constructor for objects of class Opening.
     * 
     */
    public Opening()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(720, 480, 1);
        prepare();
        
    }
    
    public void prepare()
    {
        Help help = new Help() ;
        addObject(help, 180, 440);
        Play play = new Play() ;
        addObject(play, 60, 440);
        
        
    }
    
    
    
   
    
    
}
