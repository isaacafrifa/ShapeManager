/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapemanager;

/**
 *
 * @author theblo
 */
public class Rectangle extends DrawingTemplate implements Shape {
    @Override
    public void sayName() {
        System.out.println("Rectangle");
    }
    
     @Override
    void getshape() {
        System.out.println("Shape: Rectangle");
    }

    @Override
    void startDrawing() {
        System.out.println("Drawing a rectangle");    
    }
}