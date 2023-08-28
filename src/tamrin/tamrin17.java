package tamrin;

public class tamrin17 {

    String vowel = "a, i ,o ,u";


    public static void main(String[] args) {
        String str = "mmmd mn";
        int check = 0;
        for (int j = 0; j < str.length(); j++) {
            switch (str.charAt(j)) {
                case 'i':
                    check = 1;
                    break;
                case 'u':
                    check = 1;

                    break;
                case 'o':
                    check = 1;

                    break;
                case 'a':
                    check = 1;

                    break;
            }
        }

        if (check == 1) {
            System.out.println("ok");
        } else {
            System.out.println("not ok");
        }
    }
}

