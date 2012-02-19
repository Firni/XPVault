package de.firni.XPVault;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class XPVault extends JavaPlugin{
	
	public static XPVault plugin;
	public final Logger logger = Logger.getLogger("Minecraft");
	private XPVaultCommandExecutor cmdEx;
	
	@Override
	public void onDisable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info("[" + pdfFile.getName() + "]" + " is now disabled.");
	}
	
	@Override
	public void onEnable(){
		PluginManager pm = getServer().getPluginManager();
		cmdEx = new XPVaultCommandExecutor(this);
		getCommand("xpvault").setExecutor(cmdEx);
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info("[" + pdfFile.getName() + "]" + " version " + pdfFile.getVersion() + " is enabled.");
	}

}
