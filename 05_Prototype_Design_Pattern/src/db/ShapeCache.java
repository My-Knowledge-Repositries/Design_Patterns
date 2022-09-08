/**
 * @Owner - Oshada Eranga
 * @version - v0.1
 */

package db;

import classes.Circle;
import classes.Rectangle;
import classes.Shape;
import classes.Triangle;

import java.util.Hashtable;

public class ShapeCache {
    private static final Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Triangle square = new Triangle();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
