package shapemanager;

// Template Method Design Pattern
// defines the skeleton of an algorithm as an abstract class, allowing its subclasses to provide concrete behavior.
public abstract class DrawingTemplate {
    
    private void endDrawing() {
        System.out.println("Drawing complete");
    }
    // hook methods
    abstract void getshape();
    abstract void startDrawing();
  
    // template method
    public final void draw() {
        getshape();
        startDrawing();
        endDrawing();
    }

}
