/*
   ___            __   __    ______        ____           ______       ____
  / _ \___  __ __/ /  / /__ / __/ /  __ __/ / /_____ ____/ __/ /  ___ / / /__
 / // / _ \/ // / _ \/ / -_)\ \/ _ \/ // / /  '_/ -_) __/\ \/ _ \/ -_) / (_-<
/____/\___/\_,_/_.__/_/\__/___/_//_/\_,_/_/_/\_\\__/_/ /___/_//_/\__/_/_/___/

Michael Peters
northw.st
© 2019, All rights reserved.

*/

package st.northw;

import org.bukkit.plugin.java.JavaPlugin;

public class DoubleShulkerShells extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(" ");
        getLogger().info("\u001b[35m ------------------------\u001b[0m");
        getLogger().info("\u001b[35m DoubleShulkerShells v1.0\u001b[0m");
        getLogger().info("\u001b[35m ------------------------\u001b[0m");
        getLogger().info(" ");

        DoubleShulkerListener instance = new DoubleShulkerListener();
        //necessary to allow bool data between listener and command hook

        getServer().getPluginManager().registerEvents(instance, this);

        try {
            getCommand("dss").setExecutor(new MainCommand()); //main command hook
        }
        catch (Exception e) {
            getLogger().info("command hooks did not initialize properly");
        }
    }

    @Override
    public void onDisable() {
        getLogger().info("DoubleShulkerShells has been disabled");
    }

}
