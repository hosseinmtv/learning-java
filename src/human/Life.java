package human;

public class Life {
    public static void main(String[] args) {
//        Human hani = new Human();
//        hani.name= "hani";
//        hani.walk();
//        hani.think();
//        Human hossein = new Human();
//        hossein.name= "hossein";
//        hossein.walk();
//
//
//        Human mohamadAmin = new Human();
//        mohamadAmin.name= "mohamadAmin";
//        mohamadAmin.isAlive = true;
//        mohamadAmin.walk();
//        mohamadAmin.think();
//
//
//        String name = "hani";
//
//        int i = 1;
        Employee asghar = new Employee(10000,60, "asghar");
        for (int i = 1; i <= 8; i++) {
            asghar.working();
        }
        System.out.println(asghar.workTime);
        System.out.println(asghar.age);
        System.out.println(asghar.name);

    }
}
