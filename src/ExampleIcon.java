

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class ExampleIcon extends Icon {

	public ExampleIcon() {
		super(ChatColor.AQUA + "Creative", Material.GRASS);
	}

	@Override
	public void onClick(Player p) {
		
		if (!p.hasPermission("inventory.use.creative")) return; //Optional
	
		p.setGameMode(GameMode.CREATIVE);
		p.sendMessage(ChatColor.GREEN + "Your gamemode has been changed!");
	}

}
