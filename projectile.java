import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class projectile extends Actor
{
    /**
     * Act - do whatever the projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         projectilemove();
       removeFromWorld();
        }
      
    public void projectilemove()
    {
        
     setLocation(getX(),getY()-5) ;  
    }
    public void removeFromWorld()
    {
       
         if(getY()==0)
           {
            getWorld().removeObject(this);
        
       
          }
    
}
}
    
        
       

