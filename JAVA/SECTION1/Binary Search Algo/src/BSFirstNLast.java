import java.lang.reflect.Array;
import java.util.Arrays;

public class BSFirstNLast {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 8, 8, 10};
        int target = 7;

//        int[] result = positionSort(arr, tar);
//        System.out.println(result);
        int[] ans = {-1, -1};

        int start = search(arr, target, true);
        int end = search(arr, target, false);

        ans[0] = start;
        ans[1] = end;

        System.out.println(Arrays.toString(ans));

    }
//    static int[] positionSort(int[] arr, int target){
//
//        int[] ans = {-1, -1};
//
//        int start = search(arr, target, true);
//        int end = search(arr, target, false);
//
//        ans[0] = start;
//        ans[1] = end;
//
//        return ans;
//
//    }

    static int search(int [] arr, int target, boolean findStartIndex ){
        int ans = -1;
        int start = 0;
        int end = arr.length -1;

        while(start <= end){// bc arr is sorted in asc order---
            int mid = start + (end - start)/ 2;

            // ans will display--------
            //potential ans
            if (arr[mid] == target){
                ans = mid;

                if (findStartIndex)
                    end = mid -1;
                else
                    start = mid + 1;
            }

            if(arr[mid] < target){
                start = mid + 1;
            } else  {
                end = mid - 1;
            }


        }
        return ans;

    }
}
