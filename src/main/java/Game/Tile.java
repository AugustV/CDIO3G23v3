package Game;

public class Tile {

    private String title;
    private String flavourText;
    private int value;

    /**
     * Makes a tile with a title, a flavour and a value.
     *
     */

    public Tile(String title, String flavourText, int value) {
        this.title = title;
        this.flavourText = flavourText;
        this.value = value;

    }

    /**
     * Getters for the different parameters of the tile.
     *
     */
    public String getTitle() {
        return title;
    }

    public String getFlavourText() {
        return flavourText;
    }

    public int getValue() {
        return value;
    }
}