/**
 * @Owner - Oshada Eranga
 * @version - v0.1
 */

package factories;

public class FactoryProducer {
    public static AbsShapeFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }
    }
}
