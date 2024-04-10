public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};

//       int target = 6;
        //  System.out.println(peakInMountain(arr));
    }
    static int peakInMountain(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int mid = end + (end - start)/2;
            if(arr[mid] > arr[mid +1]){
                //you are in dec part of arr
                //this may be ans, look at left
                //this why  end!= mid -1;
                end = mid;
            }else {
                //you are in asc part of arr
                start = mid + 1;
                // b/c we know that mid + 1element > mid element
            }
        }
        return  start;//or return end as both are =.
    }
}
