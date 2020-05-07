/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.pluginsapplication;

import com.ace.pluginsapplication.interfaces.IShape;
import java.util.ArrayList;

/**
 *
 * @author catalin
 */
public class PluginApp {
    
    public static void main(String[] args)
    {
        Board board = new Board();
        Menu mainMenu = initializeMainMenu(board);    
        mainMenu.execute();   
    }
    private static Menu initializeMainMenu(Board board)
    {
        PluginManager pluginMan = new PluginManager();
        ArrayList<IMenuItem> mainMenuItems = new ArrayList();
        ArrayList<IMenuItem> addMenuItems = new ArrayList();
        
        mainMenuItems.add(new MenuItem("Add shape", 1, (parameters)->
        { 
            ApplicationMenu menu = new ApplicationMenu(pluginMan);
            menu.load(board);
            menu.execute();
        }));
     
        mainMenuItems.add(new MenuItem("Delete shape", 2, (parameters)->
        {
            board.view();
            board.removeShape();
        }));
        
        mainMenuItems.add(new MenuItem("Modify shape", 3, (parameters)->
        {
            board.view();
            board.modifyShape();
        })); 
        
        mainMenuItems.add(new MenuItem("View board", 4, (parameters)->
        {
           board.view();
        }));

        return new Menu("Main Menu", 0, mainMenuItems); 
    }  
}
