
package com.mycompany.project;

import javax.swing.JFrame;
public class Frame extends JFrame{
    public Frame(Shape s,int index){
        super("Frame "+index);
        super.setSize(300,300);
        super.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.add(new Drawing(s));
        super.setVisible(true);
    }
    
    
}
