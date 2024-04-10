

public class P3CountOcc {
    public static void main(String[] args) {
        // Counting occurrences
        int n = 4546455;

        int count =0 ;
        while(n>0){
            int rem = n% 10;

            if (rem == 5){
                count++;
            }
            n =n/10;
        }
        System.out.println(count);

    }
    
}
