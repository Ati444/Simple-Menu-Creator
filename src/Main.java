

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void event(AsyncPlayerChatEvent e) {
		e.getPlayer().openInventory(
				Manager.getInstance().getInventory("ExampleInventory").getInventory());
	}

}
