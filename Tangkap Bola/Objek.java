import greenfoot.*;

/**
 * Write a description of class Objek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Objek extends Actor
{
    /**
     * Act - do whatever the Objek wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public boolean atWorldEdge() //mengecek apakah objek telah sampai ujung bawah dunia
    { 
        if(getY() > getWorld().getHeight()-2) //mengecek jika posisi objek secara vertikal (y) > batas bawah dunia
            return true; //jika ia maka nilai true dan akan generate objek baru
        else
            return false;
    } 
    //return true jika kita dapat melihat objek 'clss' class dari Object
    //false bila tidak ada object seperti itu
    public boolean canSee(Class clss) //melihat apakah ada objek dalam bunia
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }
    //Method untuk memakan objek dari kelas 'clss'
    //Method 'eat' akan dilakukan bila objek yang dimaksud ada
    //Selain objek tersebut, method tidak dilakukan
    public void eat(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            getWorld().removeObject(actor);
        }
    }
} 
