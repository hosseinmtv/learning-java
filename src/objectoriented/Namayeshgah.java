package objectoriented;

public class Namayeshgah {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i ==3) {
                break;
            }
        }

//        Car[] cars = new Car[10];
//        for (int i = 0; i <=10; i++){
//
//            Car car = new Car();
//            cars[i] = car;
//        }






    }


    private static void extracted() {
        Human hani = new Human();
        hani.name = "hani";
        hani.age = 60;
        hani.height = 175;

        Car pride = new Car();
        Car bmw = new Car();
        Car mercedes = new Car();
        Car supra = new Car("black", "are", 70000);
        Car bogati = new Car();
        Car camry = new Car();
        Car azera = new Car();

        supra.color = "black";
        supra.model = "are";
        supra.kilometr = 70000;

        Motor supraMotor = new Motor();
        supraMotor.model = "x";
        supraMotor.power = 6000;
        supra.motor = supraMotor;


        bogati.color = "red";
        bogati.model = "fdt";
        bogati.kilometr = 2000;


//        System.out.println(" saheb pride " + pride.owner.name + " hast ");

        Human hossein = new Human();
        hossein.name = "hossein";
        supra.buycar(hossein);

//        supra.show();
        System.out.println(" saheb supra " + supra.owner.name + " hast ");
    }
}
