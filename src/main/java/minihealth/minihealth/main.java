package minihealth.minihealth;

import java.io.File;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin{
	@Override 
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new HealthHandler(), this);
		File f = getDataFolder();
		if (!f.exists()){
			f.mkdir();
			saveResource("plugin.yml", false);
		}
		getLogger().info("MiniHealth Loaded Successfully");
	 }
	@Override
	public void onDisable() {
		HandlerList.unregisterAll(this);
		getLogger().info("MiniHealth Unloaded Successfully");
	}
}
