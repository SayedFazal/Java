public class PerfectSquares {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;

        while (true) {
            int sq = i * i;

            if (sum + sq > 10)
                break;

            System.out.print(sq + " ");
            sum = sum + sq;
            i++;
        }

        System.out.println("\nSum = " + sum);
    }
}
