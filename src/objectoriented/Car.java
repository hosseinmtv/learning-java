package objectoriented;

public class Car {
    int kilometr;
    String name;
    String color;
    String model;
    Human owner;
    Motor motor;

    Car(String color, String model, int kilometr) {
        this.color = color;
        this.kilometr = kilometr;
        this.model = model;
    }


    Car() {


    }

    public void buycar(Human buyer) {
        owner = buyer;

    }

    public void show() {
        System.out.println("model car " + model);
        System.out.println("color car " + color);
        System.out.println("kilometr car " + kilometr);
    }

//
//    public auto.Human getOwner() {
//        return owner;
//    }
//
//    public void setOwner(auto.Human owner) {
//        this.owner = owner;
//    }
//
//    public int getKilometr() {
//        return kilometr;
//    }
//
//    public void setKilometr(int kilometr) {
//        this.kilometr = kilometr;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
}
