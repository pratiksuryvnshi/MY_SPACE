public class TriPttn2 {
    public static void main(String[] args) {
     //pattern(4);
        pattern2(4);

    }
    static void pattern(int n){
        int i, j;
        for ( i = 1; i <=n ; i++) {
            for ( j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        /* Result
                 * * * *
                 * * *
                 * *
                 *
         */

    }
    static void pattern2(int n){
//        int count = 0;
        for (int k =1; k <= n; k++) {
            for (int l = 1; l <= k; l++) {
                System.out.print(" " +l);

            }
                System.out.println();

        }
        /*Result
             1
             1 2
             1 2 3
             1 2 3 4
        */
    }
}
