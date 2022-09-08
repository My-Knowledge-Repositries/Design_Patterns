/**
 * @Owner - Oshada Eranga
 * @version - v0.1
 */

package classes;

public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("I'm Rectangle");
    }
}
