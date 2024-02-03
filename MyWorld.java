import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{
    HealthBar healthbar = new HealthBar();
    Counter counter = new Counter();  
    boolean bossLevel=false;
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(800, 800, 1);  
        prepare();
    }

    public Counter getCounter()
    {
        return counter;
    }

    public HealthBar getHealthBar()
    {
        return healthbar;
    }

    public void act()
    {

        addEnemy1();
        addEnemy2();
    }
    
    public void Boss()
    {
        if(counter.score == 25||counter.score == 26)  
        {
           if(bossLevel == false)
           {
             addObject(new Boss(),400,0); 
             bossLevel=true;
          }
       }
    }

    public void addEnemy1()
    {     if(Greenfoot.getRandomNumber(160)<1)
        {
            addObject(new Enemy1(),Greenfoot.getRandomNumber(800),0);
        }
    }

    public void addEnemy2()
    {     if(Greenfoot.getRandomNumber(200)<1)
        {
            addObject(new Enemy2(),Greenfoot.getRandomNumber(800),0);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(counter,75,30);
        addObject(healthbar,400,50);
        player player =  new  player();
        addObject(player, 600, 600);
        player.setLocation(400,650);
        player.setLocation(400,650);
    }
}
