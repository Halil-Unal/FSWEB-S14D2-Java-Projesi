package COMWORKMODEL;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quit;

    public Bed(String style, int pillows, int height, int sheets, int quit) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quit = quit;
    }
    public void make(){
        System.out.println("The bed is being made.");
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuit() {
        return quit;
    }
    public String toString() {
        return "Bed{" +
                "model='" + pillows + '\'' +
                ", width=" +quit+
                ", length=" + sheets +
                ", height=" + height +
                ", numPillows=" + style+
                '}';
    }
}
