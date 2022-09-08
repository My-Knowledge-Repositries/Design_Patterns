/**
 * @Owner - Oshada Eranga
 * @version - v0.1
 */

package factories;

import inter.Shape;
import shapes.RoundedRectangle;
import shapes.RoundedSquare;

public class RoundedShapeFactory extends AbsShapeFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RoundedRectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new RoundedSquare();
        }
        return null;
    }
}
