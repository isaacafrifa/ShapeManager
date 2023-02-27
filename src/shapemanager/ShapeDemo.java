package shapemanager;


/**
 *
 * This is the run class
 */
public class ShapeDemo {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("circle");
        Shape rectangle = shapeFactory.getShape("rectangle");
        Shape triangle = shapeFactory.getShape("triangle");

        ShapeGroup shapeGroup = new ShapeGroup();
        shapeGroup.addShape(circle);
        shapeGroup.addShape(rectangle);

        System.out.println("\nIndividual shapes:");
        circle.sayName();
        rectangle.sayName();

        //create nested group(group1)
        ShapeGroup group1 = new ShapeGroup();
        group1.addShape(circle);
        group1.addShape(rectangle);
        group1.addShape(triangle);

        shapeGroup.addShape(group1);

        System.out.println("\nShape group:");
        shapeGroup.sayName();

        System.out.println("\nIterating over shape group:");
        for (Shape shape : shapeGroup) {
            shape.sayName();
        }
        
        System.out.println("\nDrawing using template method:");
        DrawingTemplate drawCircle= new Circle();
        DrawingTemplate drawRectangle= new Rectangle();
        drawCircle.draw();
        System.out.println("");
        drawRectangle.draw();
        
        

    }

}
