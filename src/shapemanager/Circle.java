package shapemanager;

/**
 *
 * @author theblo
 */
public class Circle extends DrawingTemplate implements Shape {
    @Override
    public void sayName() {
        System.out.println("Circle");
    }

    @Override
    void getshape() {
        System.out.println("Shape: Circle");
    }

    @Override
    void startDrawing() {
        System.out.println("Drawing a circle");    
    }
}