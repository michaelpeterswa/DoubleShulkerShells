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

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class DoubleShulkerListener implements Listener {

    private int numberOfShells;
    private String shellName;
    private ItemStack items;

    @EventHandler
    public void onShulkerDeath(EntityDeathEvent event) {

        ConfigHandler ch = new ConfigHandler();

        numberOfShells = ch.returnShellNumber(ch.readFromConfig());
        shellName = ch.returnShellName(ch.readFromConfig());

        if(numberOfShells > 0) {
            items = new ItemStack(Material.SHULKER_SHELL, numberOfShells);
            if (event.getEntity().getKiller() instanceof Player) {
                if (event.getEntity().getType() == EntityType.SHULKER) {
                    if (shellName.length() > 0) {
                        ItemMeta meta = items.getItemMeta();
                        meta.setDisplayName(shellName);
                        items.setItemMeta(meta);
                    }
                    event.getDrops().clear();
                    event.getDrops().add(items);
                    //event.getEntity().getKiller().sendMessage("execute");
                }
            }
        }
    }
}
