/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.pluginsapplication.interfaces;

/**
 *
 * @author catalin
 */
public interface IShape
{
    public void print(String message);
    public double readCoordinate();
    public int readIndex();
    public void createShape();
    public void modify();
    public void draw();
    public void view();
    public void read();
}
