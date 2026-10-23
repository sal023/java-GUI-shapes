
package com.mycompany.project;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

public class Drawing extends JPanel {
    public Shape shape;
    public Drawing(Shape shape){
        this.shape=shape;
    }

    
      @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (shape instanceof Cube) {

            int side = (int) ((Cube) shape).getSide();
            int offset = side / 3;

            int x1 = 100;
            int y1 = 50;
            int x2 = x1 + offset;
            int y2 = y1 - offset;
 
           g.setColor(new Color(140, 100, 200));
            g.fillRect(x2, y2, side, side);

           
            g.setColor(new Color(100, 50, 160));
            g.fillRect(x1, y1, side, side);

            
            g.setColor(Color.BLACK);

            g.drawRect(x1, y1, side, side);
            g.drawRect(x2, y2, side, side);

            g.drawLine(x1, y1, x2, y2);
            g.drawLine(x1 + side, y1, x2 + side, y2);
            g.drawLine(x1, y1 + side, x2, y2 + side);
            g.drawLine(x1 + side, y1 + side, x2 + side, y2 + side);
        }

        else if (shape instanceof Circle) {

            int radius = (int) ((Circle) shape).getRadius();

            
           g.setColor(new Color(150, 0, 0)); 
        g.fillOval(100, 50, radius, radius);
   
            g.setColor(Color.BLACK);
            g.drawOval(100, 50, radius, radius);
            
            
        }
        g.setColor(Color.BLACK); 
        
        String text1 = "";
        String text2 = "Area: " + String.format("%.2f", shape.getArea()); 

        if (shape instanceof Cube) {
            text1 = "Cube Side: " + ((Cube) shape).getSide();
        } else if (shape instanceof Circle) {
            text1 = "Circle Radius: " + ((Circle) shape).getRadius();
        }

        g.drawString(text1, 100, 200); 
        g.drawString(text2, 100, 220);
    }
}
