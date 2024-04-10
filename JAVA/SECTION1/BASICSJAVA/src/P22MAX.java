public class P22MAX {
    public static void main(String[] args) {
        int[] arr = {1, 25, 45, 56, 75, 354, 65};

        System.out.println(max(arr));
        System.out.println();
        System.out.println(maxRange(arr, 0, 4));

    }
    

    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
                
            }
            
        }
        return maxVal;
    }
    static int maxRange(int[] arr, int start, int end){
        int maxVal = arr[0];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
                
            }
            
        }
        return maxVal;
    }


}
