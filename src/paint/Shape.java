/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;

/**
 *
 * @author Tasneem
 */
public abstract class Shape {
    protected String name;
    protected Color colour;
    protected double x;
    protected double y;

    public Shape(String name, Color colour, double x, double y) {
        this.name = name;
        this.colour = colour;
        this.x = x;
        this.y = y;
    }
    
    
    
    
}
