/**
 * @Owner - Oshada Eranga
 * @version - v0.1
 */

package classes;

import classes.Wrapper;
import inter.Item;
import inter.Packing;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
