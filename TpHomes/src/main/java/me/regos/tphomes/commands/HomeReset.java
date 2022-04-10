package me.regos.tphomes.commands;

import me.regos.tphomes.TpHomes;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HomeReset implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            player.sendMessage(ChatColor.GRAY + "All your homes have been deleted");
            TpHomes.getLocations().clear();
        }

        return true;
    }
}
