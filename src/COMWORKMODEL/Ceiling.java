package COMWORKMODEL;

public class Ceiling {
    private int height;
    PaintColor paintColor;

    public Ceiling(int height, PaintColor paintColor) {
        this.height = height;
        this.paintColor = paintColor;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPaintColor() {
        return paintColor;
    }
    public void create(){
        System.out.println(this.height);
        System.out.println(this.paintColor);
    }
    public String toString() {
        return "Ceiling{" +
                "height=" + height +
                ", color=" + paintColor +
                '}';
    }
}
