package com.lnd.essential_teleports;

import org.bukkit.plugin.java.JavaPlugin;

import com.lnd.essential_teleports.commands.Spawn;

public class Main extends JavaPlugin {
	@Override 
	public void onEnable() {
		this.getCommand("spawn").setExecutor(new Spawn());
	}
	
	@Override 
	public void onDisable() {
		
	}
}
