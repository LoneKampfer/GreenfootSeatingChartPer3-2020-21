import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class periodToggle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class periodToggle extends Actor
{
       public int period;
    /**
     * Act - do whatever the periodToggle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        if(Greenfoot.mouseClicked(this)){
            period +=1;
            period %= 2;
            getPeriod();
            
      
        }
        
        
        
}
    public int getPeriod() {
        System.out.println(period);
        return period;
    }
}
