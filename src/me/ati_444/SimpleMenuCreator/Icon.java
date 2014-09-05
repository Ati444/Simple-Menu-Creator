package me.ati_444.SimpleMenuCreator;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * Represents an icon
 * 
 * @author Ati_444
 * 
 */
public abstract class Icon {

	private ItemStack itemStack;
	private ItemMeta itemMeta;

	private String displayName;
	private Material material;

	public Icon(String displayName, Material material) {
		itemStack = new ItemStack(material);

	}

	public void setItemMeta(ItemMeta itemMeta) {
		itemStack.setItemMeta(itemMeta);
		this.itemMeta = itemMeta;
	}

}
