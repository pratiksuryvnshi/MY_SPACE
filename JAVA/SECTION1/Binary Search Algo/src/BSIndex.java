
public class BSIndex {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 9, 14, 20, 23};
        int target =5;

        int ans = index(arr, target);
        if(ans == -1)
            System.out.println("Element in array is invalid");
        else
            System.out.println("Element in array " + target +
                    " having index is " + ans);
    }
    static int index(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){// bc arr is sorted in asc order---
            int mid = start + (end - start)/ 2;

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
        return -1;
    }
}
