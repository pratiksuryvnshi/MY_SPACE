public class MaxWealth {
    public static void main(String[] args) {
        int[][] wealth = {
                     //c  c  c
          /*r*/      {2, 4, 5}, //sum = 11
         /*r*/       {6, 7, 8}, //sum = 21
         /*r*/       {1, 3, 5}, //sum = 9
        };

        System.out.println(maximumWealth(wealth));
    }
    static int maximumWealth(int[][] accounts){
        //person = rol;
        //sccount = col;
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length ; person++) {
            int sum = 0;
            for (int account = 0; account< accounts[person].length; account++) {
                sum += accounts[person][account];

            }
            if(sum > ans){
                ans = sum;
            }

        }
        return ans;
    }
}
