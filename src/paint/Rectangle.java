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
public class Rectangle extends Shape  {
    private double Length;
    private double Width;

    public Rectangle(double Length, double Width, String name, Color colour, double x, double y) {
        super(name, colour, x, y);
        this.Length = Length;
        this.Width = Width;
    }

    /**
     * @return the Length
     */
    public double getLength() {
        return Length;
    }

    /**
     * @param Length the Length to set
     */
    public void setLength(double Length) {
        this.Length = Length;
    }

    /**
     * @return the Width
     */
    public double getWidth() {
        return Width;
    }

    /**
     * @param Width the Width to set
     */
    public void setWidth(double Width) {
        this.Width = Width;
    }
    
    
}
