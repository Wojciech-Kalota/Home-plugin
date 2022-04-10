package me.regos.tphomes.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HomeHelp implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;

            player.sendMessage(ChatColor.YELLOW + "----------------------------------------------------");
            player.sendMessage(ChatColor.GREEN + "Homeset <home_name> " + ChatColor.GRAY + "to set home");
            player.sendMessage(ChatColor.GREEN + "Home <home_name> " + ChatColor.GRAY + "to tp to home");
            player.sendMessage(ChatColor.GREEN + "Homeremove <home_name> " + ChatColor.GRAY + "to remove a home");
            player.sendMessage(ChatColor.GREEN + "Homereset " + ChatColor.GRAY + "to reset all homes");
            player.sendMessage(ChatColor.YELLOW + "----------------------------------------------------");
            player.sendMessage(ChatColor.DARK_RED + "Note: Homes are the same for all players and are gone after the server reload bcs I'm lazy");
        }

        return true;
    }
}
