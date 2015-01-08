import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pelican here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelican extends Objek
{
    /**
     * Act - do whatever the Pelican wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        gerakPelican();
        IkanMuncul();
        BombMuncul();
        tembus();
    }    
    
    public void tembus()
    {
        if(getX()==0)
        {
            setLocation(719,getY());
        }
        if(getX()==720)
        {
            setLocation(1,getY());
        }
    }
    
    public void IkanMuncul()
    {
        if(canSee(Ikan.class)) //bila melihat kelas objek ikan di dunia
        {
            eat(Ikan.class); //eat kelas objek ikan
            ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(5); 
            //kelas counter ditambah sebanyak 10 poin
        }
        
        if(canSee(Ikan2.class))
        {
            eat(Ikan2.class);
            ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(10);
        }
        

    }
    
    public void BombMuncul()
    {
        if(canSee(Bomb.class)) //bila melihat kelas objek bomb di dunia
        {
            eat(Bomb.class); //eat kelas objek bomb
            ((CounterNyawa)getWorld().getObjects(CounterNyawa.class).get(0)).Hidup(-1);
        }
    }
    
    public void gerakPelican()
    {
        if(Greenfoot.isKeyDown("left")) //bila arah panah ke kiri ditekan
        {
            move(-7); //bergerak ke kiri dengan kecepatan 7
        }
        
        if(Greenfoot.isKeyDown("right")) //bila arah panah ke kanan ditekan
        {
            move(7); //bergerak ke kanan dengan kecepatan 7
        }
        
    }
}
