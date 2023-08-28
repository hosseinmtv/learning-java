package student;

public class Main {
    public static void main(String[] args) {
        Car peghot = new Car("red",6000,1399);
        peghot.setColor("black");
        peghot.setWheel(5);
        peghot.setOwner("hossein");
        peghot.setKillometer(80000);
        peghot.setYear(1402);
        System.out.println(peghot.getPrice());

        peghot.turnOf();

        System.out.println(peghot.getColor());
        System.out.println(peghot.getWheel());
        System.out.println(peghot.getOwner());
        System.out.println(peghot.getKillometer());


        Car tosan = new Car("white",50000,2017);
        System.out.println(tosan.getColor());

    }
}
