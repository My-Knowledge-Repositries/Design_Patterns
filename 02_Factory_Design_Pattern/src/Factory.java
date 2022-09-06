import classes_implement.Circle;
import classes_implement.Triangle;
import inter.Shape;

/**
 * @version - v0.1
 * @Owner - Oshada Eranga
 */

public class Factory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();

        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        }
        return null;
    }
}
