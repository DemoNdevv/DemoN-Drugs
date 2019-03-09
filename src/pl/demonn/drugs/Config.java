package pl.demonn.drugs;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;

public class Config
{
	public static FileConfiguration cf;
    public static String marihuana1;
    public static String marihuana2;
    public static String marihuana3;
    public static String marihuana4;
    public static String marihuana5;
    public static String marihuanaprzedmiot;
    public static int marihuanailosc;
    public static String amfa1;
    public static String amfa2;
    public static String amfa3;
    public static String amfa4;
    public static String amfa5;
    public static String amfaprzedmiot;
    public static int amfailosc;
    public static String lean1;
    public static String lean2;
    public static String lean3;
    public static String lean4;
    public static String lean5;
    public static String leanprzedmiot;
    public static int leanilosc;
    
   
    public static void loadConfiguration() {
        cf =  Main.getInstance().getConfig();
        marihuana1 = cf.getString("marihuana.wiad1");
        marihuana2 = cf.getString("marihuana.wiad2");
        marihuana3 = cf.getString("marihuana.brakprzedm");
        marihuana4 = cf.getString("marihuana.tytul");
        marihuana5 = cf.getString("marihuana.podtytul");
        marihuanaprzedmiot = cf.getString("marihuana.przedmiot");
        marihuanailosc = cf.getInt("marihuana.ilosc");
        amfa1 = cf.getString("amfetamina.wiad1");
        amfa2 = cf.getString("amfetamina.wiad2");
        amfa3 = cf.getString("amfetamina.brakprzedm");
        amfa4 = cf.getString("amfetamina.tytul");
        amfa5 = cf.getString("amfetamina.podtytul");
        amfaprzedmiot = cf.getString("amfetamina.przedmiot");
        amfailosc = cf.getInt("amfetamina.ilosc");
        lean1 = cf.getString("lean.wiad1");
        lean2 = cf.getString("lean.wiad2");
        lean3 = cf.getString("lean.brakprzedm");
        lean4 = cf.getString("lean.tytul");
        lean5 = cf.getString("lean.podtytul");
        leanprzedmiot = cf.getString("lean.przedmiot");
        leanilosc = cf.getInt("lean.ilosc");
        Main.getInstance().saveConfig();
    }
    }