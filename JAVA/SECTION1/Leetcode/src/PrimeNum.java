import java.util.Scanner;

public class PrimeNum{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to Display Prime No. = ");
        int N = scanner.nextInt();

        for(int i= 2; i<= N; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        if(n == 2 || n == 3){
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0){
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i++) {
            if(n % i ==0){
                return false;
            }

        }
        return true;


    }
}