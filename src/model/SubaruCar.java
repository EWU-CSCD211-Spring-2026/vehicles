package model;
public class SubaruCar extends Car {

    // private int speed; <-- inherits from Car
    // private String color; <-- inherits from Car
    // private String brand; <-- inherits from Car
    private String awd;

    public SubaruCar(int speed, String color, String awdConfig) {
        super(speed, color);
        this.awd = awdConfig;
    }

}
