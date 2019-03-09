package pl.demonn.drugs.listeners;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.Bukkit;

import pl.demonn.drugs.Config;
import pl.demonn.drugs.utils.Util;

public class DrugsListener implements Listener {

    @EventHandler
    public void onClick(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        Action a = e.getAction();
        ItemStack i = p.getItemInHand();
        ItemStack marihuana = new ItemStack(Material.INK_SACK, 1, (short)2);
        ItemMeta marihuanameta = marihuana.getItemMeta();
        marihuanameta.setDisplayName(Util.fixChatColor("&2&lMARIHUANA"));
        marihuanameta.setLore(Arrays.asList(Util.fixChatColor("&8>> &a&nKliknij PPM aby zazyc!")));
        marihuana.setItemMeta(marihuanameta);
        
        if (a == Action.RIGHT_CLICK_AIR || a == Action.RIGHT_CLICK_BLOCK) {
            if (i.getType() == Material.INK_SACK) {
                if (i.getItemMeta().hasDisplayName()) {
                    if (i.getItemMeta().getDisplayName().equalsIgnoreCase(Util.fixChatColor("&2&lMARIHUANA"))) {
                    	p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 1000, 0));
                    	p.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 300, 0));
                    	p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 6000, 0));
                        p.sendMessage(Util.fixChatColor(Config.marihuana2));
                        Bukkit.getOnlinePlayers().forEach(all -> Util.sendMsg(all, Config.marihuana1));
                        p.sendTitle(Util.fixChatColor(Config.marihuana4), Util.fixChatColor(Config.marihuana5));
                        p.getInventory().removeItem(new ItemStack[] { marihuana });
                    }
                }
            }
        }
    }
    
    @EventHandler
    public void onClickd(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        Action a = e.getAction();
        ItemStack i = p.getItemInHand();
        ItemStack amfa = new ItemStack(Material.SUGAR, 1);
        ItemMeta amfameta = amfa.getItemMeta();
        amfameta.setDisplayName(Util.fixChatColor("&f&lAMFETAMINA"));
        amfameta.setLore(Arrays.asList(Util.fixChatColor("&8>> &a&nKliknij PPM aby zazyc!")));
        amfa.setItemMeta(amfameta);
        
        if (a == Action.RIGHT_CLICK_AIR || a == Action.RIGHT_CLICK_BLOCK) {
            if (i.getType() == Material.SUGAR) {
                if (i.getItemMeta().hasDisplayName()) {
                    if (i.getItemMeta().getDisplayName().equalsIgnoreCase(Util.fixChatColor("&f&lAMFETAMINA"))) {
                    	p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 1000, 0));
                    	p.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 500, 0));
                    	p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 6000, 0));
                    	p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 6000, 0));
                        p.sendMessage(Util.fixChatColor(Config.amfa2));
                        Bukkit.getOnlinePlayers().forEach(all -> Util.sendMsg(all, Config.amfa1));
                        p.sendTitle(Util.fixChatColor(Config.amfa4), Util.fixChatColor(Config.amfa5));
                        p.getInventory().removeItem(new ItemStack[] { amfa });
                    }
                }
            }
        }
    }
    
    @EventHandler
    public void onClickp(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        Action a = e.getAction();
        ItemStack i = p.getItemInHand();
        ItemStack lean = new ItemStack(Material.POTION, 1, (short)8262);
        ItemMeta leanmeta = lean.getItemMeta();
        leanmeta.setDisplayName(Util.fixChatColor("&5&lLEAN"));
        leanmeta.setLore(Arrays.asList(Util.fixChatColor("&8>> &a&nKliknij PPM aby zazyc!")));
        lean.setItemMeta(leanmeta);
        
        if (a == Action.RIGHT_CLICK_AIR || a == Action.RIGHT_CLICK_BLOCK) {
            if (i.getType() == Material.POTION) {
                if (i.getItemMeta().hasDisplayName()) {
                    if (i.getItemMeta().getDisplayName().equalsIgnoreCase(Util.fixChatColor("&5&lLEAN"))) {
                    	p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 6000, 0));
                    	p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 7000, 0));
                        p.sendMessage(Util.fixChatColor(Config.lean2));
                        Bukkit.getOnlinePlayers().forEach(all -> Util.sendMsg(all, Config.lean1));
                        p.sendTitle(Util.fixChatColor(Config.lean4), Util.fixChatColor(Config.lean5));
                        p.getInventory().removeItem(new ItemStack[] { lean });
                    }
                }
            }
        }
    } 

	
    @EventHandler(priority = EventPriority.MONITOR)
    public void onClick(final InventoryClickEvent e) {
    	if (!Util.fixChatColor("&2&lDostepny towar").equalsIgnoreCase(e.getInventory().getName())) {
    		return;
    	}
        e.setCancelled(true);
        final ItemStack item = e.getCurrentItem();
        ItemStack marihuana = new ItemStack(Material.INK_SACK, 1, (short)2);
        ItemMeta marihuanameta = marihuana.getItemMeta();
        marihuanameta.setDisplayName(Util.fixChatColor("&2&lMARIHUANA"));
        marihuanameta.setLore(Arrays.asList(Util.fixChatColor("&8>> &a&nKliknij PPM aby zazyc!")));
        marihuana.setItemMeta(marihuanameta);
        ItemStack amfa = new ItemStack(Material.SUGAR, 1);
        ItemMeta amfameta = amfa.getItemMeta();
        amfameta.setDisplayName(Util.fixChatColor("&f&lAMFETAMINA"));
        amfameta.setLore(Arrays.asList(Util.fixChatColor("&8>> &a&nKliknij PPM aby zazyc!")));
        amfa.setItemMeta(amfameta);
        ItemStack lean = new ItemStack(Material.POTION, 1, (short)8262);
        ItemMeta leanmeta = lean.getItemMeta();
        leanmeta.setDisplayName(Util.fixChatColor("&5&lLEAN"));
        leanmeta.setLore(Arrays.asList(Util.fixChatColor("&8>> &a&nKliknij PPM aby zazyc!")));
        lean.setItemMeta(leanmeta);
        if (item != null) {
            final ItemMeta meta = item.getItemMeta();
            if (meta != null) {
                final Player p = (Player)e.getWhoClicked();
                final Inventory inv = (Inventory)p.getInventory();
                if (inv != null) {
                    if (meta.getDisplayName() != null && meta.getDisplayName().equals(Util.fixChatColor("&a&lMARIHUANA"))) {
                    	if (p.getInventory().containsAtLeast(new ItemStack(Material.getMaterial(Config.marihuanaprzedmiot)), Config.marihuanailosc)) {
                    	p.getInventory().removeItem(new ItemStack(Material.getMaterial(Config.marihuanaprzedmiot), Config.marihuanailosc));;
                    	p.sendMessage(Util.fixChatColor("&2&lDRUGS &8>> &7Wlasnie zakupiles &a&lMARIHUANE&7!"));
                    	p.getInventory().addItem(new ItemStack[] { marihuana });
                        p.closeInventory();
                        e.setCancelled(true);
                    }
                    	else{
                    		p.sendMessage(Util.fixChatColor(Config.marihuana3.replace("{ILOSC}", String.valueOf(Config.marihuanailosc)).replace("{PRZEDMIOT}", String.valueOf(Config.marihuanaprzedmiot))));
                    	}
                    }
                    else if (meta.getDisplayName() != null && meta.getDisplayName().equals(Util.fixChatColor("&f&lAMFETAMINA"))) {
                    	if (p.getInventory().containsAtLeast(new ItemStack(Material.getMaterial(Config.amfaprzedmiot)), Config.amfailosc)) {
                    	p.getInventory().removeItem(new ItemStack(Material.getMaterial(Config.amfaprzedmiot), Config.amfailosc));;
                    	p.sendMessage(Util.fixChatColor("&2&lDRUGS &8>> &7Wlasnie zakupiles &f&lAMFETAMINE&7!"));
                    	p.getInventory().addItem(new ItemStack[] { amfa });
                        p.closeInventory();
                        e.setCancelled(true);
                    	}
                    	else{
                    		p.sendMessage(Util.fixChatColor(Config.amfa3.replace("{PRZEDMIOT}", String.valueOf(Config.amfaprzedmiot)).replace("{ILOSC}", String.valueOf(Config.amfailosc))));
                    	}
                    }
                    else if (meta.getDisplayName() != null && meta.getDisplayName().equals(Util.fixChatColor("&5&lLEAN"))) {
                    	if (p.getInventory().containsAtLeast(new ItemStack(Material.getMaterial(Config.leanprzedmiot)), Config.leanilosc)) {
                    	p.getInventory().removeItem(new ItemStack(Material.getMaterial(Config.leanprzedmiot), Config.leanilosc));;
                    	p.sendMessage(Util.fixChatColor("&2&lDRUGS &8>> &7Wlasnie zakupiles &5&lLEAN&7!"));
                    	p.getInventory().addItem(new ItemStack[] { lean });
                        p.closeInventory();
                        e.setCancelled(true);
                    	}
                    	else{
                    		p.sendMessage(Util.fixChatColor(Config.lean3.replace("{ILOSC}", String.valueOf(Config.leanilosc)).replace("{PRZEDMIOT}", String.valueOf(Config.leanprzedmiot))));
                    	}
                    }
                }
            }
        }
    }
}
                    	
                



