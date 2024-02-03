import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Enemy1 extends enemy
{

    /**
     * Act - do whatever the enemy1 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy1()
    {
        setRotation(90);
    }

    public void act()
    {
        moveEnemy();
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
            getWorld().removeObject(this);
        }
        else   if(getY()==799)
        {
            World World = getWorld();
            MyWorld myWorld = (MyWorld)World;
            HealthBar healthbar = myWorld.getHealthBar();
            healthbar.loseHealth();
            getWorld().removeObject(this);   
        }   
    }

}
