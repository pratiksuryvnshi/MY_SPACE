public class TriPttn3 {
    public static void main(String[] args) {
        pattern2(5);
    }
    static void pattern(int n){
        for (int row = 0; row < 2*n ; row++) {
            int totalColInRow = row > n ? 2*n - row : row;
            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        /*Result------------------------------------------------------
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */
    }
    static void pattern2(int n){
        for (int row = 0; row < 2*n ; row++) {
            int totalColInRow = row > n ? 2*n - row : row;// condition
            
            int totalSpaces = n - totalColInRow;
            for (int s = 0; s <totalSpaces ; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        /*Result------------------------------------------------------
              *
             * *
            * * *
           * * * *
          * * * * *
           * * * *
            * * *
             * *
              *

         */
    }
}
