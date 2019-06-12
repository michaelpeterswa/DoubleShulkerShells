/*
   ___            __   __    ______        ____           ______       ____
  / _ \___  __ __/ /  / /__ / __/ /  __ __/ / /_____ ____/ __/ /  ___ / / /__
 / // / _ \/ // / _ \/ / -_)\ \/ _ \/ // / /  '_/ -_) __/\ \/ _ \/ -_) / (_-<
/____/\___/\_,_/_.__/_/\__/___/_//_/\_,_/_/_/\_\\__/_/ /___/_//_/\__/_/_/___/

Michael Peters
northw.st
© 2019, All rights reserved.

*/

package st.northw.doubleshulkershells;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class ConfigHandler {

    JavaPlugin plugin = DoubleShulkerShells.getInst();

    // Your plugin instance

    void saveDefaults() {
        plugin.saveDefaultConfig();
    }
    public FileConfiguration readFromConfig () {
        return plugin.getConfig(); //Accessing the config file
    }

    public String returnShellName(FileConfiguration a) {
        return a.getString("shellName");
    }

    public int returnShellNumber(FileConfiguration a) {
        return a.getInt("numberOfShells");
    }
}

