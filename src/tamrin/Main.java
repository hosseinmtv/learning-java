package tamrin;

public class Main {
    public static void main(String[] args) {
        for (int i = 12; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        System.out.println();
    }
}
