import java.util.Arrays;
import java.util.Scanner;

public class P15ForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] val = new int[5];
        

        for (int i = 0; i < val.length; i++) {
            val[i] = sc.nextInt();
            
        }

        // for(int num : val){// for - each loop and here num is element for each val arrays.
            
        //     System.out.print(num + " ");
        // }
        System.out.println(Arrays.toString(val));
    }
}
