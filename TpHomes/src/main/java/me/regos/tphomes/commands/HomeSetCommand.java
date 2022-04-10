package me.regos.tphomes.commands;

import me.regos.tphomes.TpHomes;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class HomeSetCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player p = (Player) sender;

            if(args.length == 1){
                TpHomes.getLocations().put(args[0], p.getLocation());
                p.sendMessage(ChatColor.GRAY + args[0] + " has been successfully added as one of your homes");
            }

        }

        return true;
    }
}
