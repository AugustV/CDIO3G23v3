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
        fields[i++] = new GUI_Start("Start", "Modtag: 2", "Modtag kr. 2,-\nnår de passerer start", Color.RED, Color.BLACK);
        fields[i++] = new GUI_Street("Gade-\nkøkkenet ", "Pris: 1", "Burgerbaren", "1", new Color(71, 166, 43), Color.BLACK);
        fields[i++] = new GUI_Street ("Pizzahuset","Pris: 1","Pizzaria","1", new Color(71, 166, 43), Color.BLACK);
        fields[i++] = new GUI_Chance ("?", "Prøv lykken","Ta' et chancekort.", new Color(204,204,204),Color.BLACK);
        fields[i++] = new GUI_Street("Godte-\nbutikken","Pris: 1","Slikbutikken", "1", new Color(118, 172, 218), Color.BLACK);
        fields[i++] = new GUI_Street("Iskiosken", "Pris: 1", "Iskiosken, ","1", new Color(118,172,218),Color.BLACK);
        fields[i++] = new GUI_Jail("default","Fængsel","Fængsel", "På besøg i Herstedvester Fængsel", new Color(125,125,125),Color.BLACK);
        fields[i++] = new GUI_Street("Museet","Pris: 2","Søfartsmuseet","2",new Color(225, 50, 238), Color.BLACK);
        fields[i++]=  new GUI_Street("Bibliotek","Pris: 2","den sorte diamant","2", new Color(225,50,238),Color.BLACK);
        fields[i++] = new GUI_Chance ("?", "Prøv lykken","Ta' et chancekort.", new Color(204,204,204),Color.BLACK);
        fields[i++] = new GUI_Street("Multipark","Pris: 2","Skaterparken","2", new Color(255, 239, 87), Color.BLACK);
        fields[i++] = new GUI_Street("Svømmehal", "Pris: 2", "Glostrup svømmehal","2",new Color(255,239,87),Color.BLACK);
        fields[i++] = new GUI_Refuge("default", "Gratis Parkering", "Helle", "Ta' en pause i det dejlige solskin", Color.WHITE, Color.BLACK);
        fields[i++] = new GUI_Street("Spillehallen", "Pris:  3", "Oddset", "3", new Color(247, 7, 7) , Color.BLACK);
        fields[i++] = new GUI_Street("Biografen", "Pris: 3", "Cinemaxx i Fisketorvet","3", new Color(247,7,7), Color. BLACK);
        fields[i++] = new GUI_Chance ("?", "Prøv lykken","Ta' et chancekort.", new Color(204,204,204),Color.BLACK);
        fields[i++] = new GUI_Street("Legetøjs-\nbutikken", "Pris: 3", "toys 'r' us", "3", new Color(129, 125, 1), Color.BLACK);
        fields[i++] = new GUI_Street("Dyrehandel", "Pris:  3", "Maxi ZOO", "3", new Color(129, 125, 1), Color.BLACK);
        fields[i++] = new GUI_Jail("default","Fængsel","Gå i fængsel","Du skal ind bag tremmer, du bliver sprunget over én runde",new Color(125,125,125), Color.BLACK);
        fields[i++] = new GUI_Street("Bowlinghallen", "Pris: 4", "Bowlinghallen", "4", new Color(153, 255, 51), Color.BLACK);
        fields[i++] = new GUI_Street("Zoologiske-\nhave","Pris: 4","Zoologisk-have","4",new Color(153,255,51), Color.BLACK);
        fields[i++] = new GUI_Chance ("?", "Prøv lykken","Ta' et chancekort.", new Color(204,204,204),Color.BLACK);
        fields[i++] = new GUI_Street("Vandlandet", "Pris: 5", "Lalandia", "Leje: 5", new Color(58, 58, 215), Color.BLACK);
        fields[i++] = new GUI_Street("Strand-\npromenaden","Pris: 5","Strandvejen","5", new Color(58, 58, 215), Color.BLACK);
        return fields;
    }
}
