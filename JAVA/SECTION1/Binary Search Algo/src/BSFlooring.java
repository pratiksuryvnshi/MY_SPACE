public class BSFlooring{
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 9, 14, 20, 23};
        int tar =25;
        int start =0;
        int end = arr.length -1;

        int ans = flooring(arr, tar, start, end);
        if(ans == -1)
            System.out.println("Element in array is invalid");
        else
            System.out.println("Element in array " + tar +
                    " having index is " + ans);
    }
    // return the index greater no <= target---------------------
    static int flooring(int[] arr, int target, int start, int end){
 //        start = 0;
//        int end = arr.length -1;

        while(start <= end){// bc arr is sorted in asc order---
            int mid = start + (end - start)/ 2;

            //  but what if the target is greater than...
            //  the greatest number in the array===========
            if(target > arr[arr.length -1])
                return -1;

            // ans will display--------
            if (arr[mid] == target){
                return  mid;
            }

            if(arr[mid] < target){
                start = mid + 1;
            } else  {
                end = mid - 1;
            }

        }
        return end;
    }
}
