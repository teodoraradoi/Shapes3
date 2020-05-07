/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.trapezoidplugin;
import com.ace.pluginsapplication.interfaces.IPluginsAppPlugin;
import com.ace.pluginsapplication.interfaces.IShape;
/**
 *
 * @author Teo
 */
public class TrapezoidPlugin implements IPluginsAppPlugin
{
    @Override
    public String getUniqueNameText()
    {
        return "TrapezoidPlugin";
    }

    @Override
    public String getDisplayText()
    {
        return "Trapezoid";
    }

    @Override
    public IShape getShape()
    {
        return new Trapezoid();
    }
}
