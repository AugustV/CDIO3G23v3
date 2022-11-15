package gui_codebehind;

import java.awt.Color;
import gui_fields.GUI_Brewery;
import gui_fields.GUI_Chance;
import gui_fields.GUI_Field;
import gui_fields.GUI_Jail;
import gui_fields.GUI_Refuge;
import gui_fields.GUI_Shipping;
import gui_fields.GUI_Start;
import gui_fields.GUI_Street;
import gui_fields.GUI_Tax;
import gui_main.GUI;

/**
 * Creates all the fields
 * @author Ronnie
 */
public final class GUI_FieldFactory {

    private GUI_FieldFactory() {

    }

    public static GUI_Field[] makeFields() {
        GUI_Field[] fields = new GUI_Field[24];
        int i = 0;
        fields[i++] = new GUI_Start("Start", "Modtag: 200", "Modtag kr. 200,-\nnår de passerer start", Color.RED, Color.BLACK);
        fields[i++] = new GUI_Street("Gade-\nkøkkenet ", "Pris:  60", "Burgerbaren", "Leje:  20", new Color(71, 166, 43), Color.BLACK);
        fields[i++] = new GUI_Street ("Pizzahuset","Pris: 60","Pizzaria","Leje: 20", new Color(71, 166, 43), Color.BLACK);
        fields[i++] = new GUI_Chance ("?", "Prøv lykken","Ta' et chancekort.", new Color(204,204,204),Color.BLACK);
        fields[i++] = new GUI_Street("Godte-\nbutikken","Pris: 100","Slikbutikken", "Leje: 20", new Color(118, 172, 218), Color.BLACK);
        fields[i++] = new GUI_Street("Iskiosken", "Pris: 100", "Iskiosken, ","Leje: 20", new Color(118,172,218),Color.BLACK);
        fields[i++] = new GUI_Jail("default","Fængsel","Fængsel", "På besøg i Herstedvester Fængsel", new Color(125,125,125),Color.BLACK);
        fields[i++] = new GUI_Street("Museet","Pris: 120","Søfartsmuseet","Leje: 20",new Color(225, 50, 238), Color.BLACK);
        fields[i++]=  new GUI_Street("Bibliotek","Pris: 120","den sorte diamant","Leje: 20", new Color(225,50,238),Color.BLACK);
        fields[i++] = new GUI_Chance ("?", "Prøv lykken","Ta' et chancekort.", new Color(204,204,204),Color.BLACK);
        fields[i++] = new GUI_Street("Multipark","Pris: 140","Skaterparken","Leje: 20", new Color(255, 239, 87), Color.BLACK);
        fields[i++] = new GUI_Street("Svømmehal", "Pris: 140", "Glostrup svømmehal","Leje: 20",new Color(255,239,87),Color.BLACK);
        fields[i++] = new GUI_Refuge("default", "Gratis Parkering", "Helle", "Ta' en pause i det dejlige solskin", Color.WHITE, Color.BLACK);
        fields[i++] = new GUI_Street("Spillehallen", "Pris:  200", "Oddset", "Leje:  85", new Color(247, 7, 7) , Color.BLACK);
        fields[i++] = new GUI_Street("Biografen", "Pris: 200", "Cinemaxx i Fisketorvet","Leje: 85", new Color(247,7,7), Color. BLACK);
        fields[i++] = new GUI_Chance ("?", "Prøv lykken","Ta' et chancekort.", new Color(204,204,204),Color.BLACK);
        fields[i++] = new GUI_Street("Legetøjs-\nbutikken", "Pris:  300", "toys 'r' us", "Leje:  85", new Color(129, 125, 1), Color.BLACK);
        fields[i++] = new GUI_Street("Dyrehandel", "Pris:  300", "Maxi ZOO", "Leje:  95", new Color(129, 125, 1), Color.BLACK);
        fields[i++] = new GUI_Jail("default","Fængsel","Gå i fængsel","Du skal ind bag tremmer, du bliver sprunget over én runde",new Color(125,125,125), Color.BLACK);
        fields[i++] = new GUI_Street("Bowlinghallen", "Pris:  320", "Bowlinghallen", "Leje:  100", new Color(153, 255, 51), Color.BLACK);
        fields[i++] = new GUI_Street("Zoologiske-\nhave","Pris; 340","Zoologisk-have","Leje:20",new Color(153,255,51), Color.BLACK);
        fields[i++] = new GUI_Chance ("?", "Prøv lykken","Ta' et chancekort.", new Color(204,204,204),Color.BLACK);
        fields[i++] = new GUI_Street("Vandlandet", "Pris:  350", "Lalandia", "Leje:  120", new Color(58, 58, 215), Color.BLACK);
        fields[i++] = new GUI_Street("Strand-\npromenaden","Pris: 400","Strandvejen","Leje: 140", new Color(58, 58, 215), Color.BLACK);
        return fields;
    }
}
