public class CeilingP1{
    public static void main(String[] args) {
        char[] arr = {'c', 'j', 'l', 'n', 'w'};
        char target ='z';
//        int start =0;
        char ans = ceiling(arr, target);
        System.out.println(ans);
//        if(ans == 0)
//            System.out.println("Element in array is invalid and wrap of it is " + ans);
//        else
//            System.out.println("Element in array \'" + target +
//                    "\' having ceiling char is" + ans);
    }
    // return the index of smallest no >= target---------------------
    public static char ceiling(char[] arr, char target){
         int start = 0;
        int end = arr.length - 1;//index

        while(start <= end){// bc arr is sorted in asc order---

            int mid = start + (end - start)/ 2;

//            if(target > arr[arr.length -1])
//               return 0;

            // ans will display--------
//            if (arr[mid] == target){
//                return mid;
//            }

            if(arr[mid] < target){
                start = mid + 1;
            } else  {
                end = mid - 1;
            }

        }
        return arr[start % arr.length];
    }
}
