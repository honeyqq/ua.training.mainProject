package model.entities.enums;

public enum BMW {
    BMW_X6 ("BMW X6",9.7,304,78300),
    BMW_X7 ("BMW X7",10.6,209,92500);

    private String name;
    private double fuelConsumption;
    private int maxSpeed;
    private int price;

    private BMW(String name, double fuelConsumption, int maxSpeed,int price) {
        this.name = name;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
