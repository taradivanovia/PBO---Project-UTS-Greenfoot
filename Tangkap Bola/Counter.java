import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color; //untuk pengaturan warna

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int totalCount = 0; 
    public void act() 
    {
       gameOver(); 
    } 
    
    public Counter()
    {
        setImage(new GreenfootImage("0", 30, Color.WHITE, Color.BLACK)); 
    } 
    
    public void Counting (int hitung) 
    {
        totalCount += hitung; 
        setImage(new GreenfootImage("" + totalCount, 30, Color.WHITE, Color.BLACK)); 
        //membuat tampilan perubahan counter dengan ukuran awal 30, tulisan warna putih, backgroun hitam
      
    }
    
    public int getc(){
        return totalCount;
    }
    
    public void gameOver() 
    { 
        
        if (totalCount >= 50) //bila totalCount >= 50
        {
            Greenfoot.stop();
            setImage(new GreenfootImage("SELAMAT! ANDA MENANG!", 30, Color.WHITE, Color.BLACK)); 
            setLocation(350,240);
        }   
     }
    }
