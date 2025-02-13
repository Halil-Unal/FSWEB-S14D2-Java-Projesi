package COMWORKMODEL;

public class Lamp {
    private LampType style;
    private boolean battery;
    private int globalRating;

    public Lamp(LampType style, boolean battery, int globalRating) {
        this.style = style;
        this.battery = battery;
        this.globalRating = globalRating;
    }
    public void turnOn(){
        System.out.println("'Lamp is being turned on.");
    }

    public LampType getStyle() {
        return style;
    }
    public boolean isBattery(){
        return battery;
    }

    public int getGlobalRating() {
        return globalRating;
    }
    public String toString() {
        return "Lamp{" +
                "type=" + style +
                ", isOn=" + battery +
                ", brightness=" + globalRating +
                '}';
    }
}
