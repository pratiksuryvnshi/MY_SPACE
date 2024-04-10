public class Numbers {
    //WTP In Recursion printing 5 first number.....
    public static void main(String[] args) {
        num(1);
    }
    static void num(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        num(n+1);
    }
//    static void num1(int n){
//        System.out.println(n);
//        num2(3);
//    }
//    static void num2(int n){
//        System.out.println(n);
//        num3(4);
//    }
//    static void num3(int n){
//        System.out.println(n);
//    }
}
