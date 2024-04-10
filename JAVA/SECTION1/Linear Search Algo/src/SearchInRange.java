/*
* WAP to find that given target is going to matches the arrays or not
*  and matches return its index...
*
*/
public class SearchInRange {
    public static void main(String[] args) {

        int[] str = {12, 24, 54, 21, 65, 87};
        int tar = 24;

        System.out.println(linearSearch(str, tar, 0, 4));
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == target){
            return -1;
        }
        for (int i = start; i < end; i++) { //index = i
            int element = arr[i];
            if(element == target){
                return i; // index
            }

        }
        // if nothing found in the list then return false.
        return -1;
    }
}
