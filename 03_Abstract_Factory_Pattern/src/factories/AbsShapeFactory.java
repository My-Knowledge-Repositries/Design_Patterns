/**
 * @Owner - Oshada Eranga
 * @version - v0.1
 */

package factories;

import inter.Shape;

public abstract class AbsShapeFactory {
    public abstract Shape getShape(String shapeType);
}
