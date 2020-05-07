/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.squareplugin;
import com.ace.pluginsapplication.interfaces.IShape;
import java.util.Scanner;
/**
 *
 * @author Teo
 */
public class Square implements IShape
{
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    
    public Square(){}
    
    public Square(double _x1, double _y1, double _x2, double _y2)
    {
        this.x1 = _x1;
        this.y1 = _y1;
        this.x2 = _x2;
        this.y2 = _y2;
    }
    
    public void setCoord1(double _x1)
    {
        this.x1 = _x1;
    }
    
    public void setCoord2(double _y1)
    {
        this.y1 = _y1;
    }
    
    public void setCoord3(double _x2)
    {
        this.x2 = _x2;
    }
    
    public void setCoord4(double _y2)
    {
        this.y2 = _y2;
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
        System.out.println("Square created successfully\n");
    }
    
    @Override
    public void createShape()
    {
        this.print("Enter the 4 coordinates");
        this.x1 = this.readCoordinate();
        this.y1 = this.readCoordinate();
        this.x2 = this.readCoordinate();
        this.y2 = this.readCoordinate();
        this.print("");
    }
    
    @Override
    public void modify()
    {
        this.print("Enter the index of the coordinate you want to change");
        int j = this.readIndex();
        this.print("Enter the new coordinate");
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
                this.setCoord3(this.readCoordinate());
                break;  
            }  
            case 4:
            {
                this.setCoord4(this.readCoordinate());
                break;
            }
        }
        this.print("");
    }
    
    @Override
    public void view()
    {
        System.out.println("Square");
        System.out.println("Coordinate 1: " + x1);
        System.out.println("Coordinate 2: " + y1);
        System.out.println("Coordinate 3: " + x2);
        System.out.println("Coordinate 4: " + y2 + "\n");
    }

    @Override
    public void read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
