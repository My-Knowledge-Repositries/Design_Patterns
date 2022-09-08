/**
 * @Owner - Oshada Eranga
 * @version - v0.1
 */

package classes;

public class Circle extends Shape {

    public Circle() {
        type = "circle";
    }

    @Override
    void draw() {
        System.out.println("I'm circle");
    }
}
