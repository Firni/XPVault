package de.firni.XPVault;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class XPVaultCommandExecutor implements CommandExecutor{
	private XPVault plugin;
	
	public XPVaultCommandExecutor(XPVault plugin){
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		int params = args.length;
		Player player = null;
		if (sender instanceof Player) {
			player = (Player) sender;
		}
	 
		if (cmd.getName().equalsIgnoreCase("xpvault") || cmd.getName().equalsIgnoreCase("xpv")){
			if(params > 0){
				if(args[0].equalsIgnoreCase("show")){
					if(player == null){
						sender.sendMessage("this command can only be run by a player");
					}else{
						sender.sendMessage("Actual XP: " + player.getTotalExperience());
					}
					return true;
				}else{
					sender.sendMessage("Help ... TODO :D");
					sender.sendMessage(args[0]);
					return true;
				}
			}
		}
		
		return false;
	}
}
