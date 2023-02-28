package shapemanager;

/**
 This is the proxy painter 
 */
public class ProxyPainter implements Painter{

    private final RealPainter realPainter= new RealPainter();
    
    @Override
    public void paint(String colour) {
        cleanUp();
        realPainter.paint(colour);
     
    }
    
    void cleanUp(){
        System.out.println("Performing cleanup");
    }
    
}
