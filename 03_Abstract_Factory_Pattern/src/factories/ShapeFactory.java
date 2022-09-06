/**
 * @Owner - Oshada Eranga
 * @version - v0.1
 */

package factories;

import inter.Shape;
import shapes.Rectangle;

public class ShapeFactory extends AbsShapeFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Rectangle();
        }
        return null;
    }
}
