import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level extends World {
    private GreenfootImage[] images = 
    {
        new GreenfootImage("level1.png"),
        new GreenfootImage("level2.png"),
        new GreenfootImage("level3.png")
    };
        
    Counter cont = new Counter();
    GameWin win = new GameWin();
    GameLose lose = new GameLose();
    
    public Level() {  
        super(640, 480, 1);
        setBackground(images[0]);
        isi();
    }
        
    public void act() {
        if (getObjects(Bomb.class).isEmpty()) bombJatuh();
         
        if (cont.totalPoin == -100) {
            Greenfoot.setWorld(lose);
        }
        
        if (cont.totalPoin <= 250) {
            
            setBackground(images[0]);
            if (getObjects(Bread.class).isEmpty()) breadJatuh();
            if (getObjects(Lemon.class).isEmpty()) lemonJatuh();
        }
        
        if (cont.totalPoin > 250) {
            if (getObjects(Dynamite.class).isEmpty()) dynamiteJatuh();
        }
        
        if (cont.totalPoin >= 250 && cont.totalPoin < 400) {
            setBackground(images[1]);
            if (getObjects(Chips.class).isEmpty()) chipsJatuh();
            if (getObjects(Humb.class).isEmpty()) humbJatuh();
        }
        
        if (cont.totalPoin >= 400) {
            setBackground(images[2]);
            if (getObjects(Cabbage.class).isEmpty()) cabbageJatuh();
            if (getObjects(Eggplant.class).isEmpty()) eggplantJatuh();
            if (getObjects(Fire.class).isEmpty()) fireJatuh();
        }
        
        if (cont.totalPoin >= 500) {
            Greenfoot.setWorld(win);            
        }
    }
    
    public void isi(){
        Keranjang keranjang = new Keranjang();
        Nilai nilai = new Nilai();
        addObject(keranjang, 648, 403);
        addObject(cont, 57, 69);
        addObject(nilai, 64, 44);
        nilai.setLocation(59, 44);
        keranjang.setLocation(373, 403);
    }
    
    public void breadJatuh() {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new Bread(), Greenfoot.getRandomNumber(519),22);
        }
    }

    public void lemonJatuh() {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new Lemon(), Greenfoot.getRandomNumber(519),22);
        }
    }
    
    public void chipsJatuh() {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new Chips(), Greenfoot.getRandomNumber(519),20);
        }
    }
    
    public void humbJatuh() {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new Humb(), Greenfoot.getRandomNumber(519),20);
        }
    }
    
    public void cabbageJatuh() {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new Cabbage(), Greenfoot.getRandomNumber(519),20);
        }
    }
    
    public void eggplantJatuh() {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new Eggplant(), Greenfoot.getRandomNumber(519),20);
        }
    }

    public void  bombJatuh() {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new Bomb(), Greenfoot.getRandomNumber(519),21);
        }
    }
    
    public void  dynamiteJatuh() {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new Dynamite(), Greenfoot.getRandomNumber(519),21);
        }
    }
    
    public void  fireJatuh() {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new Fire(), Greenfoot.getRandomNumber(519),21);
        }
    }
}