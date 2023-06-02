package ruskaz.me.worldgamemodechanger;

import org.bukkit.GameMode;
import org.bukkit.configuration.Configuration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;

public class Events implements Listener {
    Configuration config;

    @EventHandler
    public void changeGamemodeOnWorldChange(PlayerChangedWorldEvent e) {
        Player p = e.getPlayer();
        if (p.hasPermission("worldgamemodechanger.bypass")) return;
        config = WorldGamemodeChanger.plugin.getConfig();
        String world = p.getWorld().getName();
        if (config.getStringList("creative").contains(world)) p.setGameMode(GameMode.CREATIVE);
        else if (config.getStringList("survival").contains(world)) p.setGameMode(GameMode.SURVIVAL);
        else if (config.getStringList("spectator").contains(world)) p.setGameMode(GameMode.SPECTATOR);
        else if (config.getStringList("adventure").contains(world)) p.setGameMode(GameMode.ADVENTURE);
    }
}
