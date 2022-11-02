package Game;

public class Die // simple dice
{
    /**
     * Makes sure the dice can not reach a higher value than 6.
     */
    private final int MAX = 6;

    private int faceValue;

    public Die()
    {
        faceValue = 1;
    }

    /**
     * The dice has a value of 1-6
     * @return
     */
    public int roll() {
        faceValue = (int)(Math.random() * MAX) + 1;

        return faceValue;
    }

    /**
     * This function allows us to put the dice value as something certain.
     * @param value
     */
    public void setFaceValue(int value)
    {
        faceValue = value;
    }

    /**
     *
     * @return Returns the value of the dice
     */
    public int getFaceValue(){
        return faceValue;
    }

    public String toString()
    {
        String result = Integer.toString(faceValue);

        return result;
    }

}