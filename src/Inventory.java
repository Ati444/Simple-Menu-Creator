

import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;

/**
 * 
 * @author Ati_444
 *         <p>
 *         All Rights Reserved
 */
public abstract class Inventory {

	private org.bukkit.inventory.Inventory inventory;
	private String title;
	private int rows;

	/**
	 * Constructor for an inventory
	 * 
	 * @param title
	 *            title of the inventory
	 * @param rows
	 *            number of rows in the inventory
	 */
	public Inventory(String title, int rows) {
		this.title = title;
		this.rows = rows;

		inventory = Bukkit.createInventory(null, rows * 9, title);

	}

	/**
	 * Place an item in a specific lot of the inventory
	 * 
	 * @param item
	 *            item to be placed in the inventory
	 * @param slot
	 *            slot for the item to be placed in
	 */
	public void setItem(ItemStack item, int slot) {
		// TODO
		getInventory().setItem(slot, item);
	}

	/**
	 * Get the number or rows in the inventory
	 * 
	 * @return the rows
	 */
	public int getRows() {
		return rows;
	}

	/**
	 * Get the inventory
	 * 
	 * @return the inventory
	 */
	public org.bukkit.inventory.Inventory getInventory() {
		return inventory;
	}

	/**
	 * Get the inventory's title
	 * 
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

}
