package human;

public class Human extends Creature {
    int age;
    String name;
    String lastname;
    int height;
    float weight;

    public void walk() {
        System.out.println(name + " is walking");
    }

    public void think() {
        System.out.println(name + " is thinking");
    }


    Human() {

    }

    Human(String name, int age) {
        this.name = name;
        this.age = age;

    }

}

