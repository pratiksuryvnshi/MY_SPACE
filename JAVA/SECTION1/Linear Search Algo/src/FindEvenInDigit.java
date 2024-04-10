public class FindEvenInDigit {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896, 34};
//        System.out.println(findNumbers(nums));
        System.out.println(digit2(-4335));
    }

    // this will count how many even number are present in that number
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;

    }//this will tell you whether num is even or not
        static boolean even ( int num){
            int numberOfDigit = digit(num);
         /* if (numberOfDigit % 2 == 0) {
                return true;
            }
                return false;*/
            return numberOfDigit % 2 == 0;

        }
        // This will count digit are present in that number.
        static int digit ( int num){
            // for negative number convert into positive number
            if(num < 0){
                num = num * -1;
            }
            // This for if number is zero
            if(num == 0){
                return 1;
            }

            int count = 0;

            //counts
            while (num > 0) {
                count++;
                num = num / 10;

            }
            return count;
        }
        //ALTERNATIVE METHOD for founding count of digit
    static int digit2(int num){
        // for negative number convert into positive number
        if(num < 0){
            num = num * -1;
        }
        // This for if number is zero
        if(num == 0){
            return 1;
        }
        return (int)(Math.log10(num)) + 1;
    }


}



