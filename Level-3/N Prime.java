public class Prac {
    public static void main(String[] args) {
        int n = 1, N = 5, c = 0, num = 2;

        while (true) {
            int f = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    f++;
            }
            if (f == 2)
                c++;
            if (c == n)
                break;
            num++;
        }

        num++;
        int p = 0;

        while (p < N) {
            int f = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    f++;
            }
            if (f == 2) {
                System.out.print(num + " ");
                p++;
            }
            num++;
        }
    }
}
