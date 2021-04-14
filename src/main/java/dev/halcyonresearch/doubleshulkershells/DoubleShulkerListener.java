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

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class DoubleShulkerListener implements Listener {

    @EventHandler
    public void onShulkerDeath(EntityDeathEvent event) {

        ConfigHandler ch = new ConfigHandler();

        int numberOfShells = ch.returnShellNumber(ch.readFromConfig());
        String shellName = ch.returnShellName(ch.readFromConfig());

        if(numberOfShells > 0) {
            ItemStack items = new ItemStack(Material.SHULKER_SHELL, numberOfShells);
            if (event.getEntity().getKiller() != null) {
                if (event.getEntity().getType() == EntityType.SHULKER) {
                    if (shellName.length() > 0) {
                        ItemMeta meta = items.getItemMeta();
                        if (meta != null) {
                            meta.setDisplayName(shellName);
                        }
                        items.setItemMeta(meta);
                    }
                    event.getDrops().clear();
                    event.getDrops().add(items);
                }
            }
        }
    }
}
