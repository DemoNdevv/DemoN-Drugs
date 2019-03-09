package pl.demonn.drugs.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.InventoryView;
import pl.demonn.drugs.utils.*;

public class DrugsCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String commandLabel, final String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        final Player p = (Player)sender;
        towar(p.getPlayer());
        return false;
    }
    
    public static InventoryView towar(final Player p) {
        final Inventory inv = Bukkit.createInventory((InventoryHolder)p, 27, Util.fixChatColor("&2&lDostepny towar"));
        final ItemBuilder a = new ItemBuilder(Material.INK_SACK, (short)2).setTitle(Util.fixChatColor("&a&lMARIHUANA")).addLore(Util.fixChatColor("&8>> &7Cena&8: &264 blokoki emeraldow")).addLore(Util.fixChatColor("&8>> &7Czas trwania&8: &25-6 minut")).addLore(Util.fixChatColor("&8>> &a&o&nKliknij aby kupic towar!"));
        final ItemBuilder b = new ItemBuilder(Material.SUGAR).setTitle(Util.fixChatColor("&f&lAMFETAMINA")).addLore(Util.fixChatColor("&8>> &7Cena&8: &264 bloki emeraldow")).addLore(Util.fixChatColor("&8>> &7Czas trwania&8: &24-6 minut")).addLore(Util.fixChatColor("&8>> &a&o&nKliknij aby kupic towar!"));
        final ItemBuilder c = new ItemBuilder(Material.POTION, (short)8262).setTitle(Util.fixChatColor("&5&lLEAN")).addLore(Util.fixChatColor("&8>> &7Cena&8: &264 bloki emeraldow")).addLore(Util.fixChatColor("&8>> &7Czas trwania&8: &25-6 minut")).addLore(Util.fixChatColor("&8>> &a&o&nKliknij aby kupic towar!"));
        final ItemBuilder s = new ItemBuilder(Material.getMaterial(160), 1, (short)15);
        inv.setItem(inv.getSize() - 1, s.build());
        inv.setItem(inv.getSize() - 2, s.build());
        inv.setItem(inv.getSize() - 3, s.build());
        inv.setItem(inv.getSize() - 4, s.build());
        inv.setItem(inv.getSize() - 5, s.build());
        inv.setItem(inv.getSize() - 6, s.build());
        inv.setItem(inv.getSize() - 7, s.build());
        inv.setItem(inv.getSize() - 8, s.build());
        inv.setItem(inv.getSize() - 9, s.build());
        inv.setItem(inv.getSize() - 10, s.build());
        inv.setItem(inv.getSize() - 11, s.build());
        inv.setItem(inv.getSize() - 12, c.build());
        inv.setItem(inv.getSize() - 13, s.build());
        inv.setItem(inv.getSize() - 14, b.build());
        inv.setItem(inv.getSize() - 15, s.build());
        inv.setItem(inv.getSize() - 16, a.build());
        inv.setItem(inv.getSize() - 17, s.build());
        inv.setItem(inv.getSize() - 18, s.build());
        inv.setItem(inv.getSize() - 19, s.build());
        inv.setItem(inv.getSize() - 20, s.build());
        inv.setItem(inv.getSize() - 21, s.build());
        inv.setItem(inv.getSize() - 22, s.build());
        inv.setItem(inv.getSize() - 23, s.build());
        inv.setItem(inv.getSize() - 24, s.build());
        inv.setItem(inv.getSize() - 25, s.build());
        inv.setItem(inv.getSize() - 26, s.build());
        inv.setItem(inv.getSize() - 27, s.build());
        return p.openInventory(inv);
    }
}