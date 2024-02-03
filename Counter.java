import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    int score=0;
    /**
     * Act - do whatever the counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public  Counter()
    {
        setImage(new GreenfootImage("score:"+score,40,Color.GREEN ,Color.BLACK));
    }
    public void act() 
    {
         setImage(new GreenfootImage("score:"+score,40,Color.GREEN ,Color.BLACK));
         YouWin();
    }  
    public void addScore()
    {
       score++; 
    }
    
    public void YouWin()
    {
        if(score>=50)
        {
            getWorld().addObject(new YouWin(),400,400);
            Greenfoot.stop();
        }
    }
}
