import java.util.ArrayList;

public class Tarp
{
    private final double t; //Length between lines
    private final double l; //Length of needle
    private ArrayList<Needle> needles;
    
    public Tarp(double t, double l)
    {
        this.t = t;
        this.l = l;
        this.needles = new ArrayList();
    }
    
    //Method to generate random needles
    public void addRandomNeedle(int iterations)
    {
        for (int i = 0; i<iterations; i++)
        {
           Needle n = new Needle(l, Math.random()*t, (Math.random()*Math.PI)-(Math.PI/2), this);
           needles.add(n); 
        }
    }
    
    //Counts the number of times a needle crosses the line
    public int numberOfCrossings()
    {
      int total = 0;
      for (int i = 0; i<needles.size(); i++)
      {
        if (needles.get(i).leftTip() <= 0)
        {
          total++;
        }else if (needles.get(i).rightTip() >= t)
        {
          total++;  
        }
      }
        
      return total;   
    }
    
    //Computes the probabiltiy of a needle crossing a line
    public double fractionOfCrossings()
    {
      return (double) numberOfCrossings()/needles.size(); 
    }
}
