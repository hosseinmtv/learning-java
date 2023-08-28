package tamrin;

public class mosalas {
    public static void main(String[] args) {
        for (int i = 5; i >= 2; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");
        }


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        System.out.println();


    }
}
