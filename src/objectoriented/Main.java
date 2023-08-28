package objectoriented;

public class Main {
    public static void main(String[] args) {

        Car santafe = new Car();
        santafe.color = "black";
        santafe.model = "2016";
        santafe.kilometr =30000;
        santafe.owner = new Human();
        santafe.owner.name = "hossein";

        Car pride = new Car();
        pride.color = "white";
        pride.kilometr=60000;
        pride.model="2020";

        System.out.println(santafe.owner.name);


        Human hossein = new Human();


    }

}
