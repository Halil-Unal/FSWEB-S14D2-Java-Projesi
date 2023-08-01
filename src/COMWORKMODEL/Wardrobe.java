package COMWORKMODEL;

public class Wardrobe {
    private int width;
    private int height;
    private double weigth;

    public Wardrobe(int width, int height, double weigth) {
        this.width = width;
        this.height = height;
        this.weigth = weigth;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public double getWeigth() {
        return weigth;
    }
    public void add(){
        System.out.println("Wardrobe added into Bedroom.");
    }
    public String toString() {
        return "Wardrobe{" +
                "height=" + height +
                ", numDoors=" + weigth +
                ", width=" + width +
                '}';
    }
}
