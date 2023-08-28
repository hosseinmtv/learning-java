package tamrin;

import java.util.Scanner;

public class tamrine5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("name: ");
        String name = scanner.nextLine();
        System.out.println("your name is: " + name);
        System.out.print("last name: ");
        String lastname = scanner.nextLine();
        System.out.println("your lastname is: " + lastname);
        System.out.print("age: ");
        String age = scanner.nextLine();
        System.out.println("your age is: " + age);
        System.out.println("salam" + name + lastname + " ba sene" + age);
    }
}
