

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import com.google.common.collect.Sets;

public class ExampleInventory extends Inventory {
	
	public ExampleInventory() {
		// Sets the title and number of rows for the inventory
		super(ChatColor.GOLD + "Custom Inventory", 1);
		
		//Seting the first item of the inventory to the ExampleInventory
		//setItem(new ItemStack(Material.GRASS, 1),1);

	}

}
