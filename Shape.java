
package com.mycompany.project;
import java.util.Date;

public abstract  class Shape implements Drawable {
     private Date DateCreated; 
    private String color;

    public Shape() 
    {
       this.color="Black";
       DateCreated = new Date();
    }

    public Shape(String color) {
        DateCreated = new Date();
        this.color = color;
        
    }
     
    public Date GetDateCreated()
    {
        return DateCreated;
    }
    public abstract double getArea();
    public abstract double getPermiter();
    
}
