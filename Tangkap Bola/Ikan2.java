import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ikan2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ikan2 extends Objek
{
    /**
     * Act - do whatever the Ikan2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY()+3); //posisi objek ikan, kecepatan ikan = +3;
        IkanJatuh(); //lakukan method IkanJatuh
    }
    
    public void IkanJatuh()
    { 
        if (atWorldEdge()) //jika objek berada di bawah world
        { 
            getWorld().removeObject(this); //remove objek
        } 
    }   
}
