import inter.Shape;

/**
 * @version - v0.1
 * @Owner - Oshada Eranga
 */

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = factory.getShape("TRIANGLE");
        shape2.draw();
    }
}
