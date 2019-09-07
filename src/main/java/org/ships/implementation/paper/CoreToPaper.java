package org.ships.implementation.paper;

import org.bukkit.Bukkit;
import org.ships.implementation.bukkit.CoreToBukkit;
import org.ships.implementation.paper.event.PaperListener;

public class CoreToPaper extends CoreToBukkit {

    public CoreToPaper(org.bukkit.plugin.java.JavaPlugin plugin) {
        super(plugin);
        Bukkit.getPluginManager().registerEvents(new PaperListener(), plugin);
    }
}
