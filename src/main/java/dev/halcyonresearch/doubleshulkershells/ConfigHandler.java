/*
   ___            __   __    ______        ____           ______       ____
  / _ \___  __ __/ /  / /__ / __/ /  __ __/ / /_____ ____/ __/ /  ___ / / /__
 / // / _ \/ // / _ \/ / -_)\ \/ _ \/ // / /  '_/ -_) __/\ \/ _ \/ -_) / (_-<
/____/\___/\_,_/_.__/_/\__/___/_//_/\_,_/_/_/\_\\__/_/ /___/_//_/\__/_/_/___/

Michael Peters
halcyonresearch.dev
© 2021, All rights reserved.

*/

package dev.halcyonresearch.doubleshulkershells;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class ConfigHandler {

    // Your plugin instance
    JavaPlugin plugin = DoubleShulkerShells.getInst();

    void saveDefaults() {
        plugin.saveDefaultConfig();
    }
    public FileConfiguration readFromConfig () {
        //Accessing the config file
        return plugin.getConfig();
    }

    public String returnShellName(FileConfiguration a) {
        return a.getString("shellName");
    }

    public int returnShellNumber(FileConfiguration a) {
        return a.getInt("numberOfShells");
    }
}

