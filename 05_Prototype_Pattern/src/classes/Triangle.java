/**
 * @Owner - Oshada Eranga
 * @version - v0.1
 */

package classes;

public class Triangle extends Shape {

    public Triangle() {
        type = "triangle";
    }

    @Override
    void draw() {
        System.out.println("I'm Triangle");
    }
}
