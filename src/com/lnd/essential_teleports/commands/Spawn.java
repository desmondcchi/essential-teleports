package com.lnd.essential_teleports.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Spawn implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("spawn")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				player.sendMessage("Hello other player");
			}
		}
		return true;
	}

}
