package shapemanager;

/**
 *
 * This is the main class
 */
public class Main {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("circle");
        Shape rectangle = shapeFactory.getShape("rectangle");
        Shape triangle = shapeFactory.getShape("triangle");

        ShapeGroup shapeGroup = new ShapeGroup();
        shapeGroup.addShape(circle);
        shapeGroup.addShape(rectangle);

        System.out.println("--- FACTORY ---");
        System.out.println("Individual shapes:");
        circle.sayName();
        rectangle.sayName();

         System.out.println("\n--- COMPOSITE ---");
        //create nested group(group1)
        ShapeGroup group1 = new ShapeGroup();
        group1.addShape(circle);
        group1.addShape(rectangle);
        group1.addShape(triangle);

        shapeGroup.addShape(group1);

        System.out.println("Shape group:");
        shapeGroup.sayName();

         System.out.println("\n--- ITERATOR ---");
        System.out.println("Iterating over shape group:");
        for (Shape shape : shapeGroup) {
            shape.sayName();
        }
        
         System.out.println("\n---TEMPLATE METHOD ---");
        System.out.println("Drawing using template method:");
        DrawingTemplate drawCircle= new Circle();
        DrawingTemplate drawRectangle= new Rectangle();
        drawCircle.draw();
        System.out.println("");
        drawRectangle.draw();
        
         System.out.println("\n--- PROXY ---");
        System.out.println("Painting using proxy method:");
        Painter painter= new ProxyPainter();
        painter.paint("blue");
    }

}
