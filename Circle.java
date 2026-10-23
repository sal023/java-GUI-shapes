
package com.mycompany.project;


public  class Circle extends Shape{
    private double radius;

    public Circle(double radius) 
    {
        this.radius = radius;
    }

    public Circle(String color ,double radius)
    {
        super(color);
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        if(radius>0)
        this.radius = radius;
    }

    @Override
    public String toString()
    {
        return "Circle{" + "radius=" + radius + '}';
    }
    
    @Override
    public double getArea() 
    {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPermiter()
    {
        return 2*radius*Math.PI;
    }

    @Override
    public String howToDraw() 
    {
       return "Draw circle with raduis :"+radius;
    }
    
}
