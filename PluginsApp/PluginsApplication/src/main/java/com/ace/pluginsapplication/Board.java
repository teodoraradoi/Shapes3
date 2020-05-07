/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.pluginsapplication;
import com.ace.pluginsapplication.interfaces.IShape;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Teo
 */
public class Board 
{
    private final ArrayList<IShape> shapes = new ArrayList();
    private int counter = 0;
    
    public ArrayList<IShape> getShapes()
    {
        return shapes;
    }
    
    public int readIndex()
    {
        Scanner in = new Scanner(System.in);
        int index = in.nextInt(); 
        return index;        
    }
    
    public void printMessage(String message)
    {
        System.out.println(message);
    }
    
    public void addShape(IShape shape)
   {
        shape.createShape();
        shapes.add(shape);
        shapes.get(counter).draw();
        counter++;
   }
   
   public void removeShape()
   {
       this.printMessage("Enter index");
       int i = this.readIndex();
       shapes.remove(i-1);
       counter--;
       this.printMessage("");
   }
   
   public void modifyShape()
   {
       this.printMessage("Enter the index");
       int index = this.readIndex();
       this.printMessage("");
       for(int i = 0; i < shapes.size(); i++)
       {
           if(i+1 == index)
           {
               shapes.get(i).modify();
           }
       }
   }
   
   public void view()
   {
       for(int i = 0; i < shapes.size(); i++)
       {
           System.out.print("Item #" + (i+1) + ": ");
           shapes.get(i).view();
       }
   }
}
