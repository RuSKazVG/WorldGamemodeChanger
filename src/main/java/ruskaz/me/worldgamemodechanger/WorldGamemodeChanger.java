package ruskaz.me.worldgamemodechanger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class WorldGamemodeChanger extends JavaPlugin {

    public static Plugin plugin;

    @Override
    public void onEnable() {
        plugin = WorldGamemodeChanger.getPlugin(WorldGamemodeChanger.class);
        saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(new Events(), this);
        Bukkit.getPluginCommand("worldgamemodechanger").setExecutor(new Command());
    }
}
