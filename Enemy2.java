import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Enemy2 extends enemy
{
  int timesHit =2;
    /**
     * Act - do whatever the enemy2 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveEnemy();
        removeEnemy();
        hitByProjectile();
    }
    public void hitByProjectile()
    {  
         Actor Projectile = getOneIntersectingObject(projectile.class);
       if(Projectile!= null)
       {
            getWorld().removeObject(Projectile);
           World World = getWorld();
           MyWorld myWorld = (MyWorld)World;
           Counter Counter = myWorld.getCounter();
           Counter.addScore();
           timesHit--;
       }
           if(timesHit==0)
       {
           getWorld().removeObject(this);
       }
       else if(getY()==799)
       {
            World World = getWorld();
            MyWorld myWorld = (MyWorld)World;
            HealthBar healthbar = myWorld.getHealthBar();
            healthbar.loseHealth();
            healthbar.loseHealth();
             getWorld().removeObject(this);
        }
        
        
        }
 }