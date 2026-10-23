
package com.mycompany.project;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFrame;

public class Project {

  

    public static void main(String[] args) {
        try{
        File output =new File ("sumAreas.txt");
        File input =new File("input.txt.txt");
        Scanner scan=new Scanner(input);
        int n=scan.nextInt();
        if(n<0){
                   System.out.println("Error");
               return;
               }
       Drawable[]arr=new Drawable[n];
           
           for(int i=0;i<n;i++){
               String name =scan.next();
              
                           double size =scan.nextDouble();
               if (size<0){
                   System.out.println("warning");
               continue;
               }
               
               if(name.equalsIgnoreCase("circle")){
                   arr[i]=new Circle(size);
                   
               }else if(name.equalsIgnoreCase("cube")){
                   arr[i]=new Cube(size);
               }
           }
           scan.close();
            PrintWriter writer=new PrintWriter(output);
            double totalsum=0;
            
            for(int i=0;i<n;i++){
                if(arr[i]!=null){
              totalsum+=((Shape)arr[i]).getArea();}
            }
            writer.println(totalsum);
            writer.close();
            for(int i=0;i<=n;i++){
                if(arr[i]!=null){
                    Shape S=(Shape)arr[i];
             Frame f= new Frame(S,i+1);
             f.setLocation(100 + (i * 310), 100);}
            }
        }catch(FileNotFoundException ex){
            System.err.println(ex.getMessage());
    }
}}

    

