import java.util.Scanner;

public class P6Calculator {
    public static void main(String[] args) {
        //Q: Build a calculator with basic operations

        System.out.println("---------CALCULATOR----------");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.println("Enter Operator to Calculate= ");
            char op = sc.next().trim().charAt(0);
            System.out.println();
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ){
                //intput
                System.out.println("Enter two Numbers= ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                
                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    if(num2 !=0){
                        ans = num1 / num2;
                    }
                }
                if(op == '%'){
                    ans = num1 % num2;
                }          

            }
            else if(op == 'x' || op == 'X'){
                break;

            }
            else {
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);
        }
    

    }
    
}
