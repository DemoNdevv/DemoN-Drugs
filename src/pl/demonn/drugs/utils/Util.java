package pl.demonn.drugs.utils;

import org.bukkit.entity.*;

public class Util
{
    public static String fixChatColor(final String msg) {
        return msg.replaceAll("&", "§").replaceAll(">>", "»");
    }
    
    public static void sendMsg(final Player p, final String msg) {
        p.sendMessage(fixChatColor(msg).replace("{NICK}", p.getName()));
    }
}
