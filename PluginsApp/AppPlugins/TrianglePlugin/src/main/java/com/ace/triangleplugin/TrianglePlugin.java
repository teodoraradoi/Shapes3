/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.triangleplugin;
import com.ace.pluginsapplication.interfaces.IPluginsAppPlugin;
import com.ace.pluginsapplication.interfaces.IShape;

/**
 *
 * @author Teo
 */
public class TrianglePlugin implements IPluginsAppPlugin
{
    @Override
    public String getUniqueNameText()
    {
        return "TrianglePlugin";
    }

    @Override
    public String getDisplayText()
    {
        return "Triangle";
    }

    @Override
    public IShape getShape()
    {
        return new Triangle();
    }
}
