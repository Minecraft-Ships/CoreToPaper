package org.ships.implementation.paper.event;

import com.destroystokyo.paper.event.block.BlockDestroyEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.core.world.position.BlockPosition;
import org.core.world.position.block.details.BlockDetails;
import org.ships.implementation.bukkit.event.BukkitListener;
import org.ships.implementation.bukkit.world.position.BBlockPosition;
import org.ships.implementation.bukkit.world.position.block.details.blocks.BBlockDetails;
import org.ships.implementation.paper.event.events.block.PBlockChangeEvent;

public class PaperListener implements Listener {

    @EventHandler
    public void onBlockBreak(BlockDestroyEvent event){
        BlockPosition position = new BBlockPosition(event.getBlock());
        BlockDetails details = new BBlockDetails(event.getNewState());
        PBlockChangeEvent.BlockBreakEvent event2 = new PBlockChangeEvent.BlockBreakEvent(position, position.getBlockDetails(), details);
        BukkitListener.call(event2);
        event.setCancelled(event2.isCancelled());
    }
}
