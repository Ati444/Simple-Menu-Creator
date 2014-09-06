

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * Represents an icon
 * 
 * @author Ati_444
 * 
 *         <p>
 *         All Right Reserved
 */
public abstract class Icon {

	private ItemStack itemStack;
	private ItemMeta itemMeta;

	private String displayName;
	private Material material;

	/**
	 * Constructor for an icon
	 * 
	 * @param displayName
	 *            display name for the icon
	 * @param material
	 *            material for the icon
	 */
	public Icon(String displayName, Material material) {
		itemStack = new ItemStack(material);
		itemMeta = itemStack.getItemMeta();
		itemMeta.setDisplayName(displayName);
		setItemMeta(getItemMeta());
		this.displayName = displayName;
		this.material = material;

	}

	/**
	 * Called when the icon is clicked
	 * 
	 * @param p
	 *            player who clicked the icon
	 */
	public abstract void onClick(Player p);

	/**
	 * Set the icon item meta
	 * 
	 * @param itemMeta
	 *            item meta to be set
	 */
	public void setItemMeta(ItemMeta itemMeta) {
		itemStack.setItemMeta(itemMeta);
		this.itemMeta = itemMeta;
	}

	/**
	 * Get the icon's item stack
	 * 
	 * @return the itemStack
	 */
	public ItemStack getItemStack() {
		return itemStack;
	}

	/**
	 * Get the icon's item meta
	 * 
	 * @return the itemMeta
	 */
	public ItemMeta getItemMeta() {
		return itemMeta;
	}

	/**
	 * Get the icon's display name
	 * 
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Get the icon's material
	 * 
	 * @return the material
	 */
	public Material getMaterial() {
		return material;
	}

}
