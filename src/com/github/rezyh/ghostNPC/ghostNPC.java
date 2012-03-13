package com.github.rezyh.ghostNPC;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Villager;

public class ghostNPC extends JavaPlugin{

	private Logger serverLog;
	Villager test;
	
	public void onEnable()
	{
		serverLog =  this.getLogger();
		serverLog.info("\'ghostNPC\' has been enabled.");
	}
	
	public void onDisable()
	{
		serverLog.info("\'ghostNPC\' has been disabled.");
	}
	
	
}
