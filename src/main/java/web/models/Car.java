package web.models;

public class Car {

    private String model;
    private String color;
    private int yearRelease;

    public Car() {

    }

    public Car(String model, String color, int yearRelease) {
        this.model = model;
        this.color = color;
        this.yearRelease = yearRelease;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }
}
