import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

public class Bg extends World
{
    /**
     * Create the turtle world. Our world has a size 
     * of 560x460 cells, where every cell is just 1 pixel.
     */
    public int slot;
    public int slot1=0;
    public int slot2=0;
    public int slot3=0;
    public Score score = new Score();
    public Counter counter = new Counter();
    public Nyawa nyawa = new Nyawa();
    public CounterNyawa cnyawa= new CounterNyawa();
    
    public Bg() 
    {
        super(720, 480, 1);
        IkanMuncul();
        BombMuncul();
        prepare();
        
        GreenfootSound sound = new GreenfootSound("op.mp3");  
        sound.play();
    }
    public void act()
    {
        if(getObjects(Ikan.class).isEmpty())
        {
            IkanMuncul();
        }
        
        if(getObjects(Bomb.class).isEmpty())
        {
            BombMuncul();
            if(counter.getc()>=20)
            {
                BombMuncul2();
                
            }
        
        
        }
        
        
    }
    
    private void prepare()
    {
        Pelican pelican = new Pelican();
        addObject(pelican, 648, 403);
        pelican.setLocation(373, 403); 
        
        
        addObject(score, 64, 44);
        score.setLocation(59, 44);
        addObject(counter, 57, 69);
        
        addObject(nyawa,64,44);
        nyawa.setLocation(59,100);
        addObject(cnyawa,57,125);


       
    }
    
    public void IkanMuncul()
    {   
        
        if(Greenfoot.getRandomNumber(1) < 2)
        {  
            //addObject(new Ikan(), Greenfoot.getRandomNumber(700)+1, 30); //membuat objek baru dengan lokasi x random antara 1-500 dan lokasi y 10
            //addObject(new Ikan2(), Greenfoot.getRandomNumber(200)+2, 30);
            //addObject(new Ikan3(), Greenfoot.getRandomNumber(20)+3, 30);
            
            slot = (1+Greenfoot.getRandomNumber(4))*100;
            addObject(new Ikan(),slot,30);
       
        }
    }

    public void BombMuncul()
    {
        do
        {  
            slot1=(1+Greenfoot.getRandomNumber(4))*100;
        } 
        while(slot1==slot);
        
        do
        {  
            slot2=(1+Greenfoot.getRandomNumber(4))*100;
        } 
        while(slot2==slot1 || slot2==slot);
        addObject(new Bomb(),slot1,30);
        addObject(new Ikan2(),slot2,30);
    }
    
    public void BombMuncul2()
    {
        do
        {  
            slot3=(1+Greenfoot.getRandomNumber(4))*100;
        } 
        while(slot3==slot1 || slot3==slot || slot3==slot2);
        addObject(new Bomb(),slot3,30);
    }
    
    
}
