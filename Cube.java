
package com.mycompany.project;


public  class Cube extends ThreeDShape {
    private double side;

    public Cube(double side)
    {
        this.side = side;
    }

    public Cube( String color,double side) 
    {
        super(color);
        this.side = side;
    }

    public double getSide()
    {
        return side;
    }

    public void setSide(double side)
    {
        if(side>0)
        this.side = side;
    }
    
    @Override
    public double getVolume()
    {
      return side*side *side;   
    }

    @Override
    public double getArea() 
    {
       return 6*side *side;  
    }

    @Override
    public double getPermiter()
    {
        return 12*side *side;  
    }

    @Override
    public String howToDraw()
    {
      return "draw cupe with side : "+side;
    }

    @Override
    public String toString() 
    {
        return "Cupe{" + "side=" + side + '}';
    }
    
    
}
