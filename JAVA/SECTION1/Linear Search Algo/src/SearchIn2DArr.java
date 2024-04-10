import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchIn2DArr {
    public static void main(String[] args) {
        int[][] arr = {
                {32, 3, 4},
                {65, 67, 87, 9},
                {12, 45, 66, 7, 14},
                {64, 8},
        };
        int target = 9;
        int[] ans =search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    //this will display index of given target which present in 2Darray---------------
    static int[] search(int[][] arr, int tar) {
        for (int i = 0; i < arr.length ; i++) {//---for row
            for (int j = 0; j < arr[i].length ; j++) {//----for col
                if (arr[i][j] == tar) {
                    return new int[]{i, j};// bc we not declare that array
                }

            }

        }
        return new int[]{-1, -1};
    }
    //It will show max number in 2Darray.-----------------
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int[] ints : arr) {//---for row
            for (int elements : ints) {//----for col
                if (elements > max) {
                    max = elements;// bc we not declare that array
                }

            }

        }
        return max;
    }

}
