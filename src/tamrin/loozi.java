package tamrin;

public class loozi {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {

            for (int j = 8; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");

            }
            System.out.print("\n");


        }
        for (int i = 6; i >= 1; i--) {

            for (int j = 8; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");

            }
            System.out.print("\n");

        }
    }
}

