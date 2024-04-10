public class FibonacciNum {
    public static void main(String[] args) {
        //System.out.println(fibo(10));
//        for (int i = 0; i < 20 ; i++) {
//            System.out.println(fiboFormula(i));
//        }
        System.out.println(fiboFormula(50));
    }
    static long fiboFormula(int n){
        //extended formula for fibonnaci number.
        return (long)(Math.pow(((1 + Math.sqrt(5)) / 2 ), n) / Math.sqrt(5));
    }
    static  int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n - 2);
    }
}
