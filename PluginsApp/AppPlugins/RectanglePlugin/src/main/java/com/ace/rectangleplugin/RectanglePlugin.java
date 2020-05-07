/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.rectangleplugin;
import com.ace.pluginsapplication.interfaces.IPluginsAppPlugin;
import com.ace.pluginsapplication.interfaces.IShape;

/**
 *
 * @author Teo
 */
public class RectanglePlugin implements IPluginsAppPlugin
{
    @Override
    public String getUniqueNameText()
    {
        return "RectanglePlugin";
    }

    @Override
    public String getDisplayText()
    {
        return "Rectangle";
    }

    @Override
    public IShape getShape()
    {
        return new Rectangle();
    }
}
