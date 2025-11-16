public class TabularOutput {

    public static void main(String[] args) {

        System.out.println("N\t10*N\t100*N\t1000*N");

        int n = 1;
        while (n <= 5) {
            System.out.println(n + "\t" + (10 * n) + "\t" + (100 * n) + "\t" + (1000 * n));
            n++;
        }
    }

}
