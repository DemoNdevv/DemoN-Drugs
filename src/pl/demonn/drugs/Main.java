package pl.demonn.drugs;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import pl.demonn.drugs.commands.DrugsCommand;
import pl.demonn.drugs.listeners.DrugsListener;

public class Main extends JavaPlugin {
	public static Main instance;
	public void onEnable() {
		instance = this;
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
		Config.loadConfiguration();
        final PluginDescriptionFile p = this.getDescription();
        if (!p.getName().contains("DemoN-Drugs")) {
            System.out.println("[Drugs] Wylaczanie pluginu z powodu edytowania pliku plugin.yml");
            Bukkit.getServer().getPluginManager().disablePlugin((Plugin)this);
        }
        if (!p.getAuthors().contains("_DemoNN_")) {
            System.out.println("[Drugs] Wylaczanie pluginu z powodu edytowania pliku plugin.yml");
            Bukkit.getServer().getPluginManager().disablePlugin((Plugin)this);
        }
        Config.loadConfiguration();
    	this.getLogger().info("-----------------");
    	this.getLogger().info("Wlaczono DemoN-Drugs");
    	this.getLogger().info("Wersja: 1.0");
    	this.getLogger().info("Autor: _DemoNN_");
    	this.getLogger().info("Web: demondev.pl");
    	this.getLogger().info("-------------------");
    	this.getCommand("drugs").setExecutor((CommandExecutor)new DrugsCommand());
    	Bukkit.getPluginManager().registerEvents((Listener)new DrugsListener(), (Plugin)this);
	}
	
    @Override
    public void onDisable() {
    	this.getLogger().info("Drugs - Wylaczanie pluginu...");
    }
    public static Main getInstance() {
        return Main.instance;
    }
}
