/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.circleplugin;
import com.ace.pluginsapplication.interfaces.IShape;
import java.util.Scanner;

/**
 *
 * @author catalin
 */
public class Circle implements IShape
{
    private double x;
    private double y;
    private double radius;
    
    public Circle(){}
    
    public Circle(double _x, double _y, double _radius)
    {
        this.x = _x;
        this.y = _y;
        this.radius = _radius;   
    }
    
    public void setCoord1(double _x)
    {
        this.x = _x;
    }
    
    public void setCoord2(double _y)
    {
        this.y = _y;
    }
    
    public void setRadius(double _radius)
    {
        this.radius = _radius;
    }
    
    @Override
    public void print(String message)
    {
        System.out.println(message);
    }
    
    @Override
    public double readCoordinate()
    {
        Scanner in = new Scanner(System.in);
        double coord = in.nextDouble(); 
        return coord;  
    }
    
    @Override
    public int readIndex()
    {
        Scanner in = new Scanner(System.in);
        int index = in.nextInt(); 
        return index;        
    }
    
    @Override
    public void draw()
    {
        System.out.println("Circle created successfully\n");
    }
    
    @Override
    public void createShape()
    {
        this.print("Enter the 3 coordinates");
        this.x = this.readCoordinate();
        this.y = this.readCoordinate();
        this.radius = this.readCoordinate();
        this.print("");
    }
    
    @Override
    public void modify()
    {
        this.print("Enter the index of the coordinate you want to change");
        int j = this.readIndex();
        this.print("\nEnter the new coordinate");
        switch(j)
        {
            case 1:
            {
                this.setCoord1(this.readCoordinate());
                break;
            }        
            case 2:
            {
                this.setCoord2(this.readCoordinate());
                break;
            }      
            case 3:
            {
                this.setRadius(this.readCoordinate());
                break;
            }
        }
        this.print("");
    }
    
    @Override
    public void view()
    {
        System.out.println("Circle");
        System.out.println("Coordinate 1: " + x);
        System.out.println("Coordinate 2: " + y);
        System.out.println("Coordinate 3: " + radius + "\n");
    }
    
    @Override
    public void read() {
       System.out.println("Read circle");
    }
    
}
