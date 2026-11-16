public class Coin {
    private int value;
    public int x;
    public int y;
    public int width;
    public int height;

    public Coin( int value, int x, int y, int width, int height){
        this.value = 1;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getValue() {
        return value;
    }
}
