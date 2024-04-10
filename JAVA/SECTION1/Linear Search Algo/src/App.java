import java.util.Scanner;

/*
 code for Linear Search 
 */
public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {2, 32, 43, 65, 7, 8, 98, 6};
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int ans = linearSearch(arr, m);
        System.out.println(ans);

    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == target){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target){
                return i; // index
            }
            
        }
        // if nothing found in the list then return false.
        return -1;
    }
}
