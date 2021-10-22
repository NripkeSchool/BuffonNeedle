
public class Needle
{
    private final double length;
    private final double position; //Represents center
    private final double angle; //Theta should be between pi/2 and -pi/2
    private final Tarp tarp;
    
    public Needle(double length, double xPos, double angle, Tarp tarp)
    {
       this.length = length;
       this.position = xPos;
       this.angle = angle;
       this.tarp = tarp;
    }
    
    //public Needle(double length, Tarp t)
    //{
      //Randomized needle   
    //}
    
    public double getPosition()
    {
       return position;
    }
    
    public double getAngle()
    {
      return angle;   
    }
    
    public double leftTip()
    {
        return position-(length/2)*Math.cos(angle);
    }
    
    public double rightTip()
    {
        return position+(length/2)*Math.cos(angle);
    }
}
