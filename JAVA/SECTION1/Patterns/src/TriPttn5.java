public class TriPttn5 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        int originalN = n;
        n = 2 * n;
        for (int row = 1; row < n; row++) {
            for (int col = 1; col < n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row-1, col-1), Math.min(n-row-1, n-col-1));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();

        }
    }/*Result-------------------------------------------------------------------
            5 5 5 5 5 5 5 5 5
            5 4 4 4 4 4 4 4 5
            5 4 3 3 3 3 3 4 5
            5 4 3 2 2 2 3 4 5
            5 4 3 2 1 2 3 4 5
            5 4 3 2 2 2 3 4 5
            5 4 3 3 3 3 3 4 5
            5 4 4 4 4 4 4 4 5
            5 5 5 5 5 5 5 5 5

    */
}
