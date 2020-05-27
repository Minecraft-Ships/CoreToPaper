package org.ships.implementation.paper.event.events.block;

import org.core.event.events.block.BlockChangeEvent;
import org.core.world.position.impl.sync.SyncBlockPosition;
import org.core.world.position.block.details.BlockDetails;
import org.ships.implementation.bukkit.event.events.block.AbstractBlockChangeEvent;

public interface PBlockChangeEvent {

    class BlockBreakEvent extends AbstractBlockChangeEvent implements BlockChangeEvent.Break.Pre{

        private boolean cancelled;

        public BlockBreakEvent(SyncBlockPosition pos, BlockDetails before, BlockDetails after) {
            super(pos, before, after);
        }

        @Override
        public boolean isCancelled() {
            return this.cancelled;
        }

        @Override
        public void setCancelled(boolean value) {
            this.cancelled = value;
        }
    }
}
