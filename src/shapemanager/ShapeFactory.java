/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapemanager;

/**
 *
 * @author theblo
 */
public class ShapeFactory {
    
    public Shape getShape(String shapeType) {
    if (shapeType == null) {
      return null;
    }
    if (shapeType.equalsIgnoreCase("circle")) {
      return new Circle();
    } else if (shapeType.equalsIgnoreCase("rectangle")) {
      return new Rectangle();
    }
     else if (shapeType.equalsIgnoreCase("triangle")) {
      return new Triangle();
    }
    return null;
  }
}
