package tamrin;

public class adadAval {
    public static void main(String[] args) {
        int tedad = 0;
        for (int i = 1; i <= 100; i++) {
            int c = 0;


            for (int y = 1; y <= i; y++)
                if (i % y == 0)
                    c++;

            if (c == 2) {
                tedad++;

                System.out.println(i);
            }
        }

    }
}


