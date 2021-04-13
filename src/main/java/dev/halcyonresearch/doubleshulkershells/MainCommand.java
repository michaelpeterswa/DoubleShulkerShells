/*
   ___            __   __    ______        ____           ______       ____
  / _ \___  __ __/ /  / /__ / __/ /  __ __/ / /_____ ____/ __/ /  ___ / / /__
 / // / _ \/ // / _ \/ / -_)\ \/ _ \/ // / /  '_/ -_) __/\ \/ _ \/ -_) / (_-<
/____/\___/\_,_/_.__/_/\__/___/_//_/\_,_/_/_/\_\\__/_/ /___/_//_/\__/_/_/___/

Michael Peters
halcyonresearch.dev
© 2019, All rights reserved.

*/

package dev.halcyonresearch.doubleshulkershells;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MainCommand implements CommandExecutor {

    private void intro(CommandSender sender) {
        String dss_prefix = String.format("%s[%sdss%s] ", ChatColor.DARK_PURPLE, ChatColor.LIGHT_PURPLE, ChatColor.DARK_PURPLE);

        sender.sendMessage(dss_prefix + ChatColor.WHITE + "---------------------------");
        sender.sendMessage(dss_prefix + ChatColor.WHITE + "Double Shulker Shells v1.1");
        sender.sendMessage(dss_prefix + ChatColor.RED + "/dss : the only command");
        sender.sendMessage(dss_prefix + ChatColor.WHITE + "---------------------------");

    }

    public boolean onCommand(final CommandSender sender, Command cmd, String label, String[] args) {
        if (args.length == 0) {
            intro(sender);
        }
        return true;
    }
}
