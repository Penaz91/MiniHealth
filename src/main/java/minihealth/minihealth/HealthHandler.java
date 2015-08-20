package minihealth.minihealth;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class HealthHandler implements Listener {
	@EventHandler
	public void Handle(PlayerJoinEvent e){
		Player p=(Player) e.getPlayer();
		p.setMaxHealth(40.0);
		p.setHealth(40.0);
	}
}
