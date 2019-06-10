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

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class DoubleShulkerListener implements Listener {

    private ItemStack items = new ItemStack(Material.SHULKER_SHELL, 2);

    @EventHandler
    public void onShulkerDeath(EntityDeathEvent event) {
        if(event.getEntity().getKiller() instanceof Player){
            if(event.getEntity().getType() == EntityType.SHULKER){
                event.getDrops().clear();
                event.getDrops().add(items);
                //event.getEntity().getKiller().sendMessage("execute");
            }
        }
    }
}
