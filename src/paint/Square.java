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
public class Square extends Rectangle {
    private double side;

    public Square(double side, double Length, double Width, String name, Color colour, double x, double y) {
        super(side,side ,name, colour, x, y);
        this.side = side;
    }

    /**
     * @return the side
     */
    public double getSide() {
        return side;
    }

    /**
     * @param side the side to set
     */
    public void setSide(double side) {
        this.side = side;
    }
    
    
    
}
