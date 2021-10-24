
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
    
    //Gets the center of the needle
    public double getPosition()
    {
       return position;
    }
    
    //Gets the angle of the needle
    public double getAngle()
    {
      return angle;   
    }
    
    //Gets the x-pos of the left tip
    public double leftTip()
    {
        return position-(length/2)*Math.cos(angle);
    }
    
    //Gets the x-pos of the right tip
    public double rightTip()
    {
        return position+(length/2)*Math.cos(angle);
    }
}
