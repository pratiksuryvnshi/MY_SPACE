
//Find Position of Number in array which infinite in size
//We tried to solve this problem without taking lenght of array

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int target = 13;

        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target> arr[end]){
            int temp= end +1;
            //double the box
            //end = previous +sizeofbox*2
            end = end + (end -start + 1)*2;
            start= temp;
        }
        return binarySearch(arr,target,start,end);

    }
    static int binarySearch(int[] arr, int target,int start, int end ){


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


