import java.util.Arrays;

public class P18DynamicARR {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8},
        };
        //------------Enhance loop----------
    //     for (int[] is : arr) {
    //         System.out.println(Arrays.toString(is));
    //     }
    // }
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
        
    }
}

}
