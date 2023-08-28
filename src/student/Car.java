package student;

public class Car {
    private int wheel;
    private String color;
    private String owner;
    private int killometer;
    private int year;


    public Car(String color, int killometer, int year) {
        this.color=color;
        this.year=year;
        this.killometer=killometer;

    }


    public void turnOn() {
        System.out.println("motor roshan shod");
    }

    public void turnOf() {
        System.out.println("motor khamosh shod");
    }

    public int getPrice() {
        if (this.killometer < 5000 && this.year == 1402) {
            return 500;
        } else {
            return 300;
        }

    }

    public int getWheel() {
        return this.wheel;
    }

    public int getKillometer() {
        return this.killometer;
    }

    public String getColor() {
        return this.color;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getYear() {
        return this.year;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setKillometer(int killometer) {
        this.killometer = killometer;
    }


    public void setYear(int year) {
        if (year > 1402) {
            throw new RuntimeException();
        }
        this.year = year;
    }


}
