public class Tile {
    private char letter;
    private int value;

    public Tile(char letter, int value){
        this.letter = letter;
        this.value = value;
    }

    public char getLetter(){
        return this.letter;
    }

    public int getValue(){
        return this.value;
    }

    public String printTile(){
        return "Letter: " + letter + ", Value: " + value;
    }
}
