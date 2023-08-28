package tamrin;

public class tamrine9 {
    public static void main(String[] args) {
        int[] jaygozini = {1, 2, 3, 4, 5};
        for (int i = 0; i < jaygozini.length; i++) {
            if (i + 1 == jaygozini.length) {
                jaygozini[i] = 0;
            } else {
                jaygozini[i] = jaygozini[i + 1];
            }
        }
        for (int i = 0; i < jaygozini.length; i++) {
            System.out.print(jaygozini[i] + ",");

        }
    }
}
