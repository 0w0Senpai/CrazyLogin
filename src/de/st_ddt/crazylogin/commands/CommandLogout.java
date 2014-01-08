package de.st_ddt.crazylogin.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.st_ddt.crazylogin.CrazyLogin;
import de.st_ddt.crazyplugin.exceptions.CrazyCommandExecutorException;
import de.st_ddt.crazyplugin.exceptions.CrazyException;
import de.st_ddt.crazyutil.source.Permission;

public class CommandLogout extends CommandExecutor
{

	public CommandLogout(final CrazyLogin plugin)
	{
		super(plugin);
	}

	@Override
	public void command(final CommandSender sender, final String[] args) throws CrazyException
	{
		if (!(sender instanceof Player))
			throw new CrazyCommandExecutorException(false);
		final Player player = (Player) sender;
		owner.playerLogout(player);
	}

	@Override
	@Permission("crazylogin.logout.command")
	public boolean hasAccessPermission(final CommandSender sender)
	{
		return sender.hasPermission("crazylogin.logout.command");
	}
}
