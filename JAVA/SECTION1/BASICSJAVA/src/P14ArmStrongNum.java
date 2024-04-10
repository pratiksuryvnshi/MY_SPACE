import java.util.Scanner;

public class P14ArmStrongNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // int n= sc.nextInt();

        // System.out.println(isArm(n));
        for (int i = 100; i < 1000; i++) {
            if(isArm(i)){
                System.out.print(i+ " ");
            }
            
    }
    



    }static boolean isArm(int n){
        int original = n;
        int sum = 0;

        while(n>0){
            int rem = n % 10 ;
            n = n / 10;
            sum = sum +rem*rem*rem;
        }
        // return sum == original ;
        if(sum == original){
            return true;
        }
        return false;
    
}
}

