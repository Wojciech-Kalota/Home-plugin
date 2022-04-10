package me.regos.tphomes.commands;

import me.regos.tphomes.TpHomes;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HomeRemove implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player p = (Player) sender;

            if(args.length == 1){
                p.sendMessage(ChatColor.GRAY + "Home " + args[0] + " has been removed");
                TpHomes.getLocations().remove(args[0]);
            }

        }

        return true;
    }
}
