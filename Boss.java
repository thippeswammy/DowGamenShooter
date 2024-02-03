import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends enemy
{
    int timesHit=10;
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Boss()
    {
        setRotation(90);
    }
    public void act() 
    {
        moveEnemy();
        hitprojectile();
    }
    public void hitprojectile()
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