package me.regos.tphomes;

import me.regos.tphomes.commands.*;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class TpHomes extends JavaPlugin {

    //TODO: handle exceptions
    //TODO: write coordinates of homes
    //TODO: make homes permanent
    //TODO: make homes player-dependent
    //TODO: configuration


    private static HashMap<String, Location>  locations = new HashMap<>();
    //private static ArrayList<Location> locations = new ArrayList<>();
    private static TpHomes plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;

        getCommand("Home").setExecutor(new HomeCommand());
        getCommand("Homehelp").setExecutor(new HomeHelp());
        getCommand("Homeremove").setExecutor(new HomeRemove());
        getCommand("Homeset").setExecutor(new HomeSetCommand());
        getCommand("Homereset").setExecutor(new HomeReset());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    /*
    public static ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    */

    public static HashMap<String, Location> getLocations() {
        return locations;
    }

    public static void setLocations(HashMap<String, Location> locations) {
        TpHomes.locations = locations;
    }

    public static TpHomes getPlugin() {
        return plugin;
    }

    public void setPlugin(TpHomes plugin) {
        this.plugin = plugin;
    }

}
