package ruskaz.me.worldgamemodechanger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class WorldGamemodeChanger extends JavaPlugin {

    public static Plugin plugin = WorldGamemodeChanger.getPlugin(WorldGamemodeChanger.class);

    @Override
    public void onEnable() {
        saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(new Events(), this);
        Bukkit.getPluginCommand("worldgamamodechanger").setExecutor(new Command());
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
