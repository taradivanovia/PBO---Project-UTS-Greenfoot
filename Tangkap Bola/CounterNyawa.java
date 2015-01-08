import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class CounterNyawa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CounterNyawa extends Actor
{
    /**
     * Act - do whatever the CounterNyawa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */    
    private int totalNyawa = 3;
    public Counter counter = new Counter();
    public void act() 
    {
       gameOver();
    } 
    
    public CounterNyawa()
    {
        setImage(new GreenfootImage(""+ totalNyawa, 30, Color.WHITE, Color.BLACK)); 
    } 
    
    public void Hidup (int nyawa)
    {
        totalNyawa += nyawa;
        setImage(new GreenfootImage("" + totalNyawa, 30, Color.WHITE, Color.BLACK));
    }
    
    public void gameOver() 
    { 
        
        if (totalNyawa <= 0) 
        {
            Greenfoot.stop();
            setImage(new GreenfootImage("MAAF! ANDA KALAH! SILAHKAN COBA LAGI", 30, Color.WHITE, Color.BLACK)); 
            setLocation(350,240);
        }
    }
}
