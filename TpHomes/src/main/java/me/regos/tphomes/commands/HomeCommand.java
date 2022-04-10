package me.regos.tphomes.commands;

import me.regos.tphomes.TpHomes;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HomeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;

            if(args.length == 1){
                player.sendMessage(ChatColor.GRAY + "You have been teleported to " + args[0]);
                player.teleport(TpHomes.getLocations().get(args[0]));
            }
        }

        return true;
    }
}
