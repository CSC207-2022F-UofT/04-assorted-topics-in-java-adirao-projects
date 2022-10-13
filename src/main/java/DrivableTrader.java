/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.List;

public class DrivableTrader extends Trader {
     /**
     * Constructor for Trader. Gives trader wishlist, inventory, and money.
     *
     * @param inventory Objects in inventory
     * @param wishlist  Objects in wishlist
     * @param money     Money
     */
     public DrivableTrader(List<Drivable> new_inventory, List<Drivable> new_wishlist, int new_money) {
         super(new_inventory, new_wishlist, new_money);
     }
     
     public DrivableTrader(int new_money) {
         super(new_money);
     }
     
     @Override
     public int getSellingPrice(Object sold_item) {
         if (sold_item instanceof Tradable){
            return ((Drivable) item).getMaxSpeed() + ((Tradable) item).getPrice();
        } else {
            reutrn Tradable.MISSING_PRICE;
        }
     }
}
