/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.trapezoidplugin;
import com.ace.pluginsapplication.interfaces.IShape;
import java.util.Scanner;
/**
 *
 * @author Teo
 */
public class Trapezoid implements IShape
{
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    private double x4;
    private double y4;
    
    public Trapezoid(){}
    
    public Trapezoid(double _x1, double _y1, double _x2, double _y2, double _x3, double _y3, double _x4, double _y4)
    {
        this.x1 = _x1;
        this.y1 = _y1;
        this.x2 = _x2;
        this.y2 = _y2;
        this.x3 = _x3;
        this.y3 = _y3;
        this.x4 = _x4;
        this.y4 = _y4;
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
    
    public void setCoord5(double _x3)
    {
        this.x3 = _x3;
    }
    
     public void setCoord6(double _y3)
    {
        this.y3 = _y3;
    }
     
    public void setCoord7(double _x4)
    {
        this.x3 = _x4;
    }
    
    public void setCoord8(double _y4)
    {
        this.y4 = _y4;
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
        System.out.println("Trapezoid created successfully\n");
    }
    
    @Override
    public void createShape()
    {
        this.print("Enter the 8 coordinates");
        this.x1 = this.readCoordinate();
        this.y1 = this.readCoordinate();
        this.x2 = this.readCoordinate();
        this.y2 = this.readCoordinate();
        this.x3 = this.readCoordinate();
        this.y3 = this.readCoordinate();
        this.x4 = this.readCoordinate();
        this.y4 = this.readCoordinate();
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
            case 5:
            {
                this.setCoord5(this.readCoordinate());
                break;
            }
            case 6:
            {
                this.setCoord6(this.readCoordinate());
                break;
            }
            case 7:
            {
                this.setCoord7(this.readCoordinate());
                break;
            }
            case 8:
            {
                this.setCoord8(this.readCoordinate());
                break;
            }
        }
        this.print("");
    }
    
    @Override
    public void view()
    {
        System.out.println("Trapezoid");
        System.out.println("Coordinate 1: " + x1);
        System.out.println("Coordinate 2: " + y1);
        System.out.println("Coordinate 3: " + x2);
        System.out.println("Coordinate 4: " + y2);
        System.out.println("Coordinate 5: " + x3);
        System.out.println("Coordinate 6: " + x3);
        System.out.println("Coordinate 7: " + x4);
        System.out.println("Coordinate 8: " + y4 + "\n");
    }

    @Override
    public void read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
