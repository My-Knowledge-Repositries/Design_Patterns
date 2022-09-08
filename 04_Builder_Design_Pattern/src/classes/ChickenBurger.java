/**
 * @Owner - Oshada Eranga
 * @version - v0.1
 */

package classes;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 500;
    }
}
