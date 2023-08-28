package tamrin;

public class tamrine10 {
    public static void main(String[] args) {
        int[] main = {1, 2, 3, 4, 5, 6};
        int[] makos = {0, 0, 0, 0, 0, 0};

        int length = main.length;

        for (int i = 0; i < length; i++) {
            makos[i] = main[length - i - 1];
        }
        for (int i = 0; i < length; i++) {
            System.out.print(makos[i] + ",");
        }

    }
}
