package shapemanager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This is acts as the composite class.
 * It implements Shape and Iterable interfaces
 // Composite composes zero-or-more similar objects so that they can be manipulated as one object.
 // Iterator accesses the elements of an object sequentially without exposing its underlying representation
 */
public class ShapeGroup implements Shape, Iterable<Shape> {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    @Override
    public void sayName() {
        for (Shape shape : shapes) {
            shape.sayName();
        }
    }
    
    @Override
    public Iterator<Shape> iterator() {
        return shapes.iterator();
    }
}
