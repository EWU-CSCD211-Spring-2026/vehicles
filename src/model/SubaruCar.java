package model;
public class SubaruCar extends Car {

    private String awd;

    public SubaruCar(int speed, String color, String awdConfig) {
        super(speed, color);
        this.awd = awdConfig;
    }

}
