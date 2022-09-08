/**
 * @Owner - Oshada Eranga
 * @version - v0.1
 */

package classes;

import classes.Bottle;
import inter.Item;
import inter.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
